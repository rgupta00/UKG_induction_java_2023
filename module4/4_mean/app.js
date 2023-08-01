
var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var mongoose = require('mongoose');
var Book = require('./Book.model');

var port = 8080;
var db = 'mongodb://localhost/rajdb3'

mongoose.connect(db, { useNewUrlParser: true, useUnifiedTopology: true});
//u can send json directly ..by sending encoded url string form 
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
  extended: true
}));

app.get('/', function(req, res) {
  res.send('happy to be here');
});

app.get('/book', function(req, res) {
  console.log('getting all books');
  Book.find({}).exec(function(err, books) {
      if(err) {
        res.send('error occured')
      } else {
        console.log(books);
        res.json(books);
      }
    });
});

app.get('/book/:id1', function(req, res) {
  console.log('getting all books');
  //console.log(req.params)
  Book.findOne({
    _id: req.params.id1
    })
    .exec(function(err, books) {
      if(err) {
        console.log(err)
        res.send('error occured')
      } else {
        console.log(books);
        res.json(books);
      }
    });
});

app.post('/book', function(req, res) {
  var newBook = new Book();// ref to moongooes sch

  newBook.title = req.body.title;
  newBook.author = req.body.author;
  newBook.category = req.body.category;

  newBook.save(function(err, book) {
    if(err) {
      res.send('error saving book');
    } else {
      console.log(book);
      res.send(book);
    }
  });
});

app.post('/book2', function(req, res) {
  Book.create(req.body, function(err, book) {
    if(err) {
      res.send('error saving book');
    } else {
      console.log(book);
      res.send(book);
    }
  });
});

app.put('/book/:id', function(req, res) {
  Book.findOneAndUpdate({
    _id: req.params.id
    },
    { $set: { title: req.body.title }
  }, {upsert: false}, function(err, newBook) {
    if (err) {
      res.send('error updating ');
    } else {
      console.log(newBook);
      res.send(newBook);
    }
  });
});

//-------delete the book---------
app.delete('/book/:id', function(req,res){
  Book.findOneAndRemove({
      _id: req.params.id
  }).exec(function(err, book){
      if(err)
          res.send('some error ...')
      else if(book==null){
          res.status(404).send('book is not found')
      }else{
          console.log(book)
          res.status(204).send();
      }
  })
})

app.listen(port, function() {
  console.log('app listening on port ' + port);
});
