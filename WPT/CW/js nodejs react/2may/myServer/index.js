import {createServer} from 'http';
const server = createServer((request, response)=>{
    //read the req url
    //apply conditions on url
    //if(url=127.0.0.1:5000){}else if(url= 127.0.0.1:5000/students)
    response.write("hello")
    response.end()
});

server.listen(4500,()=>{
    console.log("server started")
})