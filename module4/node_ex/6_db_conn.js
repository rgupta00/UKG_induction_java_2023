//npm install mysql
let mysql=require('mysql');
let conn= mysql.createConnection({
   host:"localhost" ,
   user: "root",
   password: "root",
   database:"ukgdemo"
})

conn.connect(function(err){
    if(err) throw err;
    console.log('connected')
})