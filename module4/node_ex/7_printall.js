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

    conn.query("select * from emp", function(err, result, fields){
        if(err) throw err;
        // console.log(fields)
        for(let i=0; i<result.length; i++){
            console.log(JSON.stringify(result[i]));
        }
        conn.end();
    })
})

