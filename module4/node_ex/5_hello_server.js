let http = require("http");

let srvr = http.createServer(function (request, response) {
	//console.log(request);
	//i am setting content type
	response.writeHead(200, {'Content-Type': 'text/plain'});
	//actual response
	response.end('Hello World!!!\n');

});
srvr.listen(8081);
console.log('Server running at http://127.0.0.1:8081/');

// npm install -g nodemon 
// nodemon ./server.js localhost 8080