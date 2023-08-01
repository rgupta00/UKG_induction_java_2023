//npm install mysql
// let mysql=require('mysql');
// let conn= mysql.createConnection({
//    host:"localhost" ,
//    user: "root",
//    password: "root",
//    database:"ukgdemo"
// })

// conn.connect(function(err){
//     if(err) throw err;
//     console.log('connected')
// })


let mysql=require('pg');

const client = new Client({
    user: 'postgres',
    host: 'localhost',
    database: 'ukglab',
    password: 'root',
    port: 5432,
  })
  client.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
  });
