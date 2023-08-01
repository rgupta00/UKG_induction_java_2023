//Multiple route callback/ Handler function:

let express=require('express')
let app=express();

let checkUrl=function(req, resp, next){
    console.log('current rounte is '+ req.originalUrl)
    next();
}
app.use(checkUrl);

app.get('/', function(req, resp){
    resp.send('express js working!!')
})
app.get('/home', function(req, resp){
    resp.send('home')
})
app.get('/about', function(req, resp){
    resp.send('about')
})
app.listen(4000);
console.log('server is running')
