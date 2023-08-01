let fs = require('fs');

let data = 'Hello World!';

fs.writeFile('test.txt', data, function (err) {
  if (err) 
	return console.log(err);
  
  console.log('Hello World > test.txt');
});
console.log('testing');