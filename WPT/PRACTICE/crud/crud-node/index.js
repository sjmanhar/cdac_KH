import express from 'express'
import { createConnection } from 'mysql2';

function createDbConnection(){
    var conn= createConnection({
        host: "localhost",
        user: "root",
        password:"cdac",
        database:"wpt"
    })
    conn.connect((error)=>{
        if (error) {
            console.log("db error")
        } else {
            console.log("db connected")
        }
    })
    return conn;
}
const conn = createDbConnection()
const PORT= 6000
const app =express();
app.use(express.json())

app.get("/",(req,res)=>{
    res.send({msg:"welcome"})
})

app.post("/employee", (req,res)=>{
    try {
       const data= req.body
       const qry= `insert into employee values(${data.id}, '${data.name}', '${data.phone}', ${data.salary})` 
       conn.query(qry,(error, result)=>{
        if (error) {
            if (error.errno==1062) {
                res.send({msg:"id duplicate"})
            } else {
                res.send({msg:"insert error"})
            }
        } else {
            res.send({msg:"inserted"})
        }
       })
    } catch (error) {
        console.log(error)
        res.send({msg:"smthng wrong"})
    }
})

app.get("/employee", (req,res)=>{
    try {
       const qry= `select * from employee` 
       conn.query(qry,(error, result)=>{
        if (error) {
                res.send({msg:"insert error"})
        } 
        else {
            res.send(result)
        }
       })
    } catch (error) {
        console.log(error)
        res.send({msg:"smthng wrong"})
    }
})

app.delete("/employee/:id", (req,res)=>{
    try {
        const id = parseInt(req.params.id)
       const qry= `delete  from employee where id= ${id}` 
       conn.query(qry,(error, result)=>{
        if (error) {
                res.send({msg:"delete error"})
        } 
        else {
            res.send({msg:"deleted"})
        }
       })
    } catch (error) {
        console.log(error)
        res.send({msg:"smthng wrong"})
    }
})

app.put("/employee/:id", (req,res)=>{
    try {
       const id = parseInt(req.params.id)
       const data= req.body
       const qry= `update employee set name='${data.name}', phone='${data.phone}', salary=${data.salary} where id= ${id}` 
       conn.query(qry,(error, result)=>{
        if (error)  {
                res.send({msg:"update error"})
            
        } else {
            res.send({msg:"updated"})
        }
       })
    } catch (error) {
        console.log(error)
        res.send({msg:"smthng wrong"})
    }
})


app.listen(PORT,()=>{
    console.log("server 6000 runing")
})