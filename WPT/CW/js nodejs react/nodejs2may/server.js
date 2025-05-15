//const http = require('http');
import {createServer} from 'http';

//var server = http.createServer((request, response)=>{
var server = createServer((request, response)=>{

    // var x= 5;
    // var y=3;
    // var z=x+y;

    response.write("hello world");
    response.end();
});

server.listen(4500,()=>{
    console.log("server started")
});