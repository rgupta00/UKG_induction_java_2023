
let express=require('express')
let app=express();

//how to get router parameter?
//http://localhost:4000/customers/121/orders/555
app.get('/customers/:custId/orders/:orderId', function(req, resp){
    resp.send(req.params)
})


//http://localhost:4000/user/1233?gender=male
app.get('/user/:id', function(req, res) {
    const query = req.query;// query = {gender:"male"}
    const params = req.params; //params = {id:"000000"}
    res.send(query.gender +": "+ params)
  })

app.listen(4000);
console.log('server is running')