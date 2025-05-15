// ----------class based component---
// import { Component } from "react";
// export class MyComponent extends Component{

//     render(){
//         return(// it delivrs UI for this class
//             <div>
//                 <h1>welcome to my component</h1>
//             </div>
//         )
//     }
// }



export function MyComponent(props) {
  return (
    <div>
        <h1>function based</h1>
        <p>{props.heading}</p>
        <p>{props.text}</p>
    </div>
  )
}
