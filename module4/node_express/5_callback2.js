//COnfigure array of callback function to handle an route

let express=require('express')
let app=express();
let callback1=function(req, resp, next){
    console.log('callback 1 function one executed '+ req.originalUrl)
    next();
}
let callback2=function(req, resp, next){
    console.log('callback 2 function one executed '+ req.originalUrl)
    next();
}
app.use(callback1);

app.get('/home',[callback2], function(req, resp){
    resp.send('home')
})

app.get('/home2', function(req, resp){
    resp.send('home')
})

app.listen(4000);
console.log('server is running!')
