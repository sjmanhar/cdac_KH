import axios from "axios";
import { getToken } from "./AdminService";

const token = getToken();

export function fetchAllStudents(){
    return axios.get("http://localhost:7800/student",{
        headers:{'Authorization':`Bearer ${token}`}
    });
}

export function registerStudent(formData){
    return axios.post("http://localhost:7800/student",formData,{
        headers:{'Authorization':`Bearer ${token}`}
    });
}

export function deleteStudent(id){
    return axios.delete(`http://localhost:7800/student/${id}`,{
        headers:{'Authorization':`Bearer ${token}`}
    });
}

export function fetchStudentById(id){
    return axios.get(`http://localhost:7800/student/${id}`,{
        headers:{'Authorization':`Bearer ${token}`}
    });
}

export function updateStudent(id,formData){
    return axios.put(`http://localhost:7800/student/${id}`,formData,{
        headers:{'Authorization':`Bearer ${token}`}
    })
}