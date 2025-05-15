import express from'express';
import { INVALID_ID_VALUE } from './src/constants/responsemsg';
import {StatusCodes} from 'http-status-codes';
const PORT = 9500;
const app = express()
app.use (express.json)

app.get("/",(request, response)=>{
    response.status(StatusCodes.OK).send({message: "welcome home"})

})

app.get("/factorial/:n",(request, response)=>{
    try {
       const num = parseInt(request.params.n);
       if(num>0){
        var fact=1 ;
        for(var i=1; i<=num; i++){

        }

       }
       else{
           response.status(400).send({messgae:INVALID_ID_VALUE}) 
       }
    } catch (error) {
        response.status(StatusCodes.BAD_REQUEST).send({message:"something wrong"})//making code more robust
    }
})

app.post("/product",(request, response)=>{
    try {
       const data =  request.body;
       const res = data.x * data.y
       response.status(200).send({product: res});
    } catch (error) {
        response.status(500).send({message:"something wrong"})//making code more robust
    }
})

app.listen(PORT, ()=>{
    console.log("server running")
})