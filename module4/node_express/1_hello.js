
//npm install express
let express=require('express')
let app=express();

app.get('/', function(req, resp){
    resp.send('express js working!!')
}).listen(4000);
console.log('server is running')
// nodemon demo.js