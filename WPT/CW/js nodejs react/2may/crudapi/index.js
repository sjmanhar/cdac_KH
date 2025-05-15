import express, { response } from 'express'
import {StatusCodes} from 'http-status-codes'
import { createDbConnection } from './src/configs/DbConfig.js';
import { compareSync, hashSync } from 'bcrypt';
import jwt from 'jsonwebtoken';
import cors from 'cors';


//import adminRouter  from './src/routes/AdminRoutes.js';

const conn = createDbConnection();
const PORT= 5000
const app = express();

app.use(cors())

app.use(express.json())// process the data

// app.use("/", adminRouter)

///app.post("/admin",)


// app.post(".admin/login", (request, response)=>{
//     try {
//         const reqData= request.body;
//         const qry= `select * from admin where username='${reqData.username}'`;
//         conn.query(qry,(error, result)=>{
//             if (error) {
//                 console.log(error)
//                 response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"problem in fetching data"})
//             } else {
//                 console.log(result)
//                 if(result.length===0){
//                     response.status(StatusCodes.BAD_REQUEST).send({msg: "user invalid"})
//                 }
//                 else{
//                     if(compareSync(reqData.password,result[0].password)){
//                         const token= jwt.sign({adminId:result[0].id},"hello123")
//                     response.status(StatusCodes.OK).send({msg: "login done",token})
//                 }
//                     else{
//                         response.status(StatusCodes.BAD_REQUEST).send({msg: "user invalid"})
//                     }
//                     //response.status(StatusCodes.OK).send(result)
//                 }
//             }
//         })
//     } catch (error) {
//         response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"something wrong"})
//     }
// })

app.get("/",(request, response)=>{
    response.status(StatusCodes.OK).send({msg: "welcome to student crud app"})
})

app.post("/student", (request, response)=>{
    try {
       const data = request.body ;
       console.log("received data", data)
       const qry= `insert into student values(${data.id},'${data.name}','${data.phone}',${data.marks})`;
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
            response.status(StatusCodes.OK).send({msg: "student registration done right"})
        }
       });
    } catch (error) {
        console.log("catch error", error)
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"something wrong"})
    }
})
app.get("/student",(request, response)=>{
    try {
        const qry= "select * from student";
        conn.query(qry,(error, result)=>{
            if (error) {
                console.log(error)
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"problem in fetching data"})
            } else {
                response.status(StatusCodes.OK).send(result)
            }
        })
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"something wrong"})
    }
})
app.get("/student/:id",(request,response)=>{
    try {
        const id = parseInt(request.params.id);
    const qry =`select * from student where id= ${id}`;
    conn.query(qry,(error, result)=>{
        if (error) {
            console.log(error)
            response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg: "problem in fetching data"})
        } 
        else {
            if (result.length===0) {
                response.status(StatusCodes.NOT_FOUND).send({msg:`student id ${id} not found`})
            } 
            else {
                    response.status(StatusCodes.OK).send(result[0]);
            }
        }
    })
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:'Something went wrong'});
    }
})

app.delete("/student/:id", (request, response)=>{
    try {
        const id = parseInt(request.params.id);
        const qry = `delete from student where id = ${id}`;
        conn.query(qry,(error, result)=>{
            if (error) {
                console.log(error)
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg: "probelm in fetching data"})
            } else {
                response.status(StatusCodes.OK).send({msg:"deleted"})
            }
        })
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:'Something went wrong'});
    }
})
app.put("/student/:id", (request, response)=>{
    try {
        const id = parseInt(request.params.id);
        const data= request.body;
        const qry = `update student set name='${data.name}', phone ='${data.phone}', marks='${data.marks}' where id = ${id}`;
        conn.query(qry, (error, result)=>{
            if (error) {
                console.log(error)
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"problem in updating data"})
            } else {
                response.status(StatusCodes.OK).send({msg:"student updated"})
            }
        })
    } catch (error) {
        console.log(error)
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({msg:"something wrong"})
    }
})
app.listen(PORT,()=>{
    console.log("server running on 5000")
    //createDbConnection();
})