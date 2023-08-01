
let express=require('express')
let checkUrl=require('./middleware')
let app=express();
const router= express.Router();

app.get('/', function(req, resp){
    resp.send('express js working!!')
})
router.get('/login',checkUrl, function(req, resp){
    resp.send('login')
})
app.get('/about', function(req, resp){
    resp.send('about')
})

router.get('/admin',checkUrl, function(req, resp){
    resp.send('admin')
})

app.post('/postdemo', function(req, resp){
    resp.send('post')
})
app.use('/', router);
app.listen(4000);
console.log('server is running')
