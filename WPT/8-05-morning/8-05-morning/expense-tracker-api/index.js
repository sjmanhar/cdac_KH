import express from 'express';
import cors from 'cors';
import { createConnection } from 'mysql';
import {StatusCodes} from 'http-status-codes';
import { compareSync, hashSync } from 'bcrypt';
import jwt from 'jsonwebtoken';

const PORT = 9700;

const conn = createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"expense_tracker"
});
conn.connect((error)=>{
    if(error){
        console.log(error);
    }
    else{
        console.log("db connected..!");
    }
});


const app = express();

app.use(cors());
app.use(express.json());

app.post("/user",(request,response)=>{
    try {
        const data = request.body;
        const encryptedPassword = hashSync(data.password,10);
        const qry = `INSERT INTO user(name,phone,email,password) VALUES('${data.name}','${data.phone}','${data.email}','${encryptedPassword}')`
        conn.query(qry,(error,result)=>{
            if(error){
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:'Error in registration'});
            }
            else{
                response.status(StatusCodes.OK).send({message:'User registered !'});
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:'Something went wrong'});
    }
});

app.post("/user/login",(request,response)=>{
    try {
        const data = request.body;
        const qry = `SELECT * FROM user WHERE phone = '${data.phone}'`
        conn.query(qry,(error,result)=>{
            if(error){
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:'Error in login'});
            }
            else{
                if(result.length===0){
                    response.status(StatusCodes.BAD_REQUEST).send({message:'Invalid Credentials'});
                }
                else{
                    if(compareSync(data.password,result[0].password)){
                        const token = jwt.sign({userId:result[0].id},"secret123");
                        response.status(StatusCodes.OK).send({token:token});
                    }
                    else{
                        response.status(StatusCodes.BAD_REQUEST).send({message:'Invalid Credentials'});
                    }
                }
                
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:'Something went wrong'});
    }
});




app.listen(PORT,()=>{
    console.log(`server is running on ${PORT}`);
});