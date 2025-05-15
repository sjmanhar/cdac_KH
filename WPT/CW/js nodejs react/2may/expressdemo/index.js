import express from 'express';
import { request } from 'http';
//const express = require('express)

//create an express appln
const app= express();//returns obj of newly created appln

app.get("/",(request, response)=>{
    response.send("welcome");
});
app.get("/login",(request, response)=>{
    response.send("welcome to login")
    response.status(200).send("welcome to login")
})
express.json
//app.get("/sum",(request, response)=>{
app.get("/sum/:x/:y",(request, response)=>{
    // var x=2;
    // var y= 6;
    // var z=x+y;
    var a = parseInt(request.params)
    console.log(`sum is${a}`);
    //console.log(request.params);//{x:3,y:5}
   // response.send(`sum is ${z}`)
})
app.listen(3500, ()=>{
    console.log("server 3500 running...")
})