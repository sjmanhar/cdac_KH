const fs = require("fs");

// fs.writeFile("myfile.txt", "hello",(error)=>{
//     if(!error){
//         console.log("write operation completed")
//     }
//     else{
//         console.log("write failed")
//     }
// });
// console.log("after writing file")

// fs.writeFileSync("demo.txt","dummy text")
// console.log("after writing")

// fs.readFile("myfile.txt",(error, data)=>{
//     if(!error){
//         console.log(data)
//     }
//     else{
//         console.log(error)
//     }
// });
// console.log("after reading file")

var data= fs.readFileSync("myfile.txt")
console.log(data.toString())
console.log("after reading file")