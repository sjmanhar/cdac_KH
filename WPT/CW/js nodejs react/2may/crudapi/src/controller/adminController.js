import { hashSync } from "bcrypt";
import { StatusCodes } from "http-status-codes";
import { createDbConnection } from './src/configs/DbConfig.js';
import { compareSync, hashSync } from 'bcrypt';
import jwt from 'jsonwebtoken';

const conn= createDbConnection()

export function registerAdmin(request, response) {
    try {
        const data = request.body ;
        console.log("received data", data)
        const encryptpwd =hashSync(data.password, 10)//sync
        data.password=""
        const qry= `insert into admin values(${data.id},'${data.name}','${data.username}','${encryptpwd}')`
        conn.query(qry, (error, result)=>{
         if (error) {
             console.log(error)
             if (error.errno==1062) {
                 response.status(StatusCodes.BAD_REQUEST).send({msg:"id duplicate"})
             } 
             else {
                 response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"something is wrong in inserting"})
 
             }
         } 
         else {
             response.status(StatusCodes.OK).send({msg: "admin registration done right"})
         }
        });
     } 
     catch (error) {
         console.log("catch error", error)
         response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"something wrong"})
     };
};
