import React from 'react'
import jwt from 'jsonwebtoken'

export default function verifyToken(request, response, next) {
  const authHeader = request.get('Authorization')
  if (authHeader) {
    const token = authHeader.split(" ")[1]
    jwt.verify(token,"secret123",(error, payload)=>{
        if (error) {
            
        } else {
            
        }
    })
  } else {
    
  }
}
