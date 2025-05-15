/* eslint-disable react-hooks/exhaustive-deps */
import axios from "axios";
import { useEffect, useState } from "react"

export function UserRecord(){

    const [users,setUsers] =useState([]);

    const getUserData=async()=>{
        try {
            const response= await axios.get("https://jsonplaceholder.typicode.com/users")
            console.log(response)
            setUsers(response.data)
         } catch (error) {
             console.log(error)
         }
    }
    useEffect(()=>{
        getUserData()
    },[])

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
                            users.map((u)=>{
                                return(
                                    <tr key={u.id}>
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