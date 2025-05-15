//middleware
export function verifyToken(request, response, next){
    //request.params, req.body; req.get
    const authHeader= request.get('Authorization')
    if (authHeader) {
        const token = authHeader.split(" ")[1];
        jwt.verify(token, "hello123",(error, payload)=>{
            if (error) {
                response.status(StatusCodes.UNAUTHORIZED).send({msg: "token invalid"})
            } else {
                next();
            }
        })
        next();
    } else {
        response.status(StatusCodes.UNAUTHORIZED).send({msg: "msg unauthorised  token missing"})
    }
}