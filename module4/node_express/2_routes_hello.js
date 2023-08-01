
let express=require('express')
let app=express();





app.get('/', function(req, resp){
    resp.send('express js working!!')
})
app.get('/home', function(req, resp){
    resp.send('home')
})
app.get('/about', function(req, resp){
    resp.send('about')
})

app.get('/admin', function(req, resp){
    resp.send('admin')
})

app.get('/foo*bar', function(req, resp){
    resp.send('admin')
})

app.post('/postdemo', function(req, resp){
    resp.send('post')
})

app.listen(4000);
console.log('server is running')
