import axios from "axios";

export function login(formData){
    return axios.post('http://localhost:7800/admin/login',formData);
}

export function storeToken(token){
    localStorage.setItem("token",token);
}

export function removeToken(){
    localStorage.removeItem("token");
}

export function getToken(){
    return localStorage.getItem("token");
}