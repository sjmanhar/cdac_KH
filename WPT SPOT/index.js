import express, { response } from 'express'
import { createConnection } from 'mysql2';

function createDbconnection(){
    var conn= createConnection({
        host: "localhost",
        user: "root",
        password: "cdac",
        database: "spot"
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

const conn= createDbconnection()
const PORT = 5000
const app = express();
app.use(express.json())

app.get("/", (request, response)=>{
    response.send({msg:"welcome"})
})
app.post('/api/employees', (request, response)=>{
    try {
        const data = request.body
        
        const qry= ` insert into employee values(${data.id}, '${data.name}', '${data.email}','${data.phone}',${data.salary})`
        conn.query(qry,(error,result)=>{
            if (error) {
                
                    response.send({msg:" inserting error"})
                
                
            } else {
                response.send({msg:" inserted successful"})
            }
        })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthing wrong"})
    }
})

app.get("/api/employees",(request, response)=>{
    try {
        const qry= `select * from employee`
    conn.query(qry,(error,result)=>{
        if (error) {
            response.send({msg:" fetching error"})
        } else {
            response.send(result)
        }
    })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthing wrong"})
    }

})

app.put('/api/employees/:id', (request, response)=>{
    try {
        const id = parseInt(request.params.id)
        const data = request.body
        const qry= ` update employee set name='${data.name}', email= '${data.email}', phone= '${data.phone}', salary=${data.salary} where id = ${id}`
        conn.query(qry,(error,result)=>{
            if (error) {
                response.send({msg:" update error"})
            } else {
                response.send({msg:" updated successful"})
            }
        })
    } catch (error) {
        console.log(error)
        res.send({msg:"somthing wrong"})
    }
})

app.delete("/api/employees/:id",(request, response)=>{
    try {
        const id = parseInt(request.params.id)
        const qry= `delete from employee where id=${id}`
    conn.query(qry,(error,result)=>{
        if (error) {
            console.log(error)
            response.send({msg:" delete error"})
        } else {
            response.send({msg:"deleted"})
        }
    })
    } catch (error) {
        console.log(error)
        response.send({msg:"somthing wrong"})
    }

})

app.listen(PORT,()=>{
    console.log("server 7000 running")
})