var fs = require('fs');

console.log('start')

fs.readFile('test1.txt','utf-8',function(err, d){
  if(err)
    console.log(err)
  if(d)
  console.log(d)
})

console.log('end');