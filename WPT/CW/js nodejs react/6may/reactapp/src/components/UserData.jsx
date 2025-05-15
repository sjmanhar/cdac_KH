import { Component } from "react";
import axios from 'axios'

export class UserData extends Component{
    constructor(){
        super();
        this.state={
            users:[]
        }
    }

    async componentDidMount(){
        try {
          const response=  await axios.get("https://jsonplaceholder.typicode.com/users")
          console.log(response.data)
          this.setState({users: response.data})
        } catch (error) {
            console.log(error)
        }
    }

    render(){
        return(
            <div>
                <h1>list of users</h1>
                <table border={1} color="black">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>name</th>
                            <th>email</th>
                            <th>username</th>
                            <th>phone</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map((u)=>{
                                return(
                                    <tr>
                                        <td>{u.id}</td>
                                        <td>{u.name}</td>
                                        <td>{u.email}</td>
                                        <td>{u.username}</td>
                                        <td>{u.phone}</td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}