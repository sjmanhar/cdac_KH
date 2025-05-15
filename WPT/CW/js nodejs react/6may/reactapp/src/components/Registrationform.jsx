import axios from 'axios'
import React, { useState } from 'react'

export default function Registrationform() {

    const [formData,setFormData]= useState({id:'',name:'', phone:'',marks:''})

    // const handleIdChange =()=>{
    //     var value;
    //     setFormData({...formData,id:value})
    // }
    // const handleNameChange=()=>{
    //     var value;
    //     setFormData({...formData,name:value}) 
    // }

    const handleChange =(event)=>{
        console.log(event.target.value)
        setFormData({...formData,id:event.target.value})//only on id
        setFormData({...formData,
            [event.target.name]:event.target.value
        })
    }


    const handleSubmit=async(event)=>{

        try {
            event.preventDefault()
        console.log(formData)
       const response= await axios.post("http://127.0.0.1:5000/student", formData)
       console.log(response)
       //Access to XMLHttpRequest at 'http://127.0.0.1:5000/student' from origin 'http://localhost:5173' has been blocked by CORS policy: Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' header is present on the requested resource.
        } catch (error) {
            console.log(error)
        }
        
    }

  return (
    <div>
        <form onSubmit={handleSubmit}>
            <div>
                <label>id</label>
                <input type="text" placeholder='enter id' onChange={handleChange} name='id'></input>
            </div>
            <div>
                <label>name</label>
                <input type="text" placeholder='enter name' onChange={handleChange} name='name'></input>
            </div>
            <div>
                <label>phone</label>
                <input type="text" placeholder='enter phone' onChange={handleChange} name='phone'></input>
            </div>
            <div>
                <label>marks</label>
                <input type="text" placeholder='enter marks' onChange={handleChange} name='marks'></input>
            </div>
            <button>register</button>
        </form>
    </div>
  )
}
