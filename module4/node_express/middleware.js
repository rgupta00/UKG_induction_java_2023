module.exports=function(req, resp, next){
    console.log('current rounte is '+ req.originalUrl)
    next()
}