import axios from 'axios'
export function fetchAllStu(){
    return axios.get("http://localhost:5000/student")
}

export function storeToken(){
   localStorage.setItem()
}
export function removeToken(){
    localStorage.removeItem("token")
}