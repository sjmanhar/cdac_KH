import { createConnection } from 'mysql';

export function createDbConnection(){
   var conn= createConnection({
        host: "localhost",
        user: "root",
        password: "cdac",
        database: "wpt"
    })
    conn.connect((error)=>{
        if (error) {
            console.log(error)
        }
        else{
            console.log("database connected")
        }
    })
    return conn;
}

