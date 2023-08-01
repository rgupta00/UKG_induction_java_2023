let fs = require('fs');

let data = 'Hello World!';
console.log('start');
fs.writeFile('test.txt', data, function (err) {
  if (err) 
	return console.log(err);
  else
    console.log('Hello World > test.txt');
});
console.log('end');