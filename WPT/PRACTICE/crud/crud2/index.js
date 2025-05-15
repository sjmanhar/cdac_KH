//import { StatusCodes} from 'http-status-codes'
import express, { request, response } from 'express'
import {createConnection} from 'mysql2'


function createDbConnection(){
    var conn = createConnection({
        host: "localhost",
        user: "root",
        password: "cdac",
        database:"wpt"
    })
    conn.connect((error)=>{
        if (error) {
            console.log("db error")
        } else {
            console.log("db connected")
        }
    })
    return conn
}
const app = express();
app.use(express.json())
const conn = createDbConnection();
const PORT= 5000




app.get("/",(request, response)=>{
    response.send({msg:"wlcome"})
});

app.post("/customer",(request, response)=>{
    try {
        const data= request.body;
        if (data.name.length===0) {
            return response.send({
                message: "Missing required fields: id, roll, name, mobile",
            });
        }
        console.log(data)
        const qry= `insert into customer values(${data.id}, '${data.name}', '${data.phone}', '${data.address}')`
        console.log(data)
        conn.query(qry,(error, result)=>{
            if (error) {
                
                console.log(error)
                response.send({msg:"insert error"})
            } else {
                response.send({msg:"insert done"})
            }
        })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthg wrong"})
    }
})

app.get("/customer",(request,response)=>{
    try {
        const qry =`select * from customer`
        conn.query(qry,(error, result)=>{
            if (error) {
                console.log(error)
                response.send({msg:"fetching error"})
            } else {
                response.send(result)
            }
        })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthg wrong"})
    }
})

app.put("/customer/:id", (request, response)=>{
    try {
        const id = request.params.id
        const data = request.body
        const qry= `update customer set name='${data.name}', phone ='${data.phone}', address='${data.address} 'where id= ${id}`
        conn.query(qry,(error, result)=>{
            if (error) {
                console.log(error)
                response.send({msg:"update error"})
            } else {
                response.send({msg: 'updated'})
            }
        })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthg wrong"})
    }
})

app.delete("/customer/:id",(request, response)=>{
    try {
        const id = request.params.id
        const qry = `delete from customer where id=${id}`
        conn.query(qry,(error, result)=>{
            if (error) {
                console.log(error)
                response.send({msg:"delete error"})
            } else {
                response.send({msg: 'deleted'})
            }
        })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthg wrong"})
    }
})

app.listen(PORT,()=>{
    console.log("server 5000 running...")
})