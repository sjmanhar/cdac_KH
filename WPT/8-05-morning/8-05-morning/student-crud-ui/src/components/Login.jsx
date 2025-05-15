import { useState } from "react";
import { Alert, Button, Col, Container, Form, Row } from "react-bootstrap";
import { login, storeToken } from "../services/AdminService";
import { toast } from "react-toastify";
import { useNavigate } from "react-router-dom";

export function Login() {

    const navigate = useNavigate();

    const [formData, setFormData] = useState({ username: '', password: '' });

    const handleChange = (event) => {
        setFormData({ ...formData, [event.target.name]: event.target.value });
    }

    const handleSubmit = async (event) => {
        try {
            event.preventDefault();
            console.log(formData);
            const response = await login(formData);
            console.log(response);
            if(response.status === 200){
                console.log(response.data.token);
                storeToken(response.data.token);
                navigate("/dashboard");
            }
        } catch (error) {
            console.log(error);
            if(error.response.status === 400){
                toast.error(error.response.data.message);
            }
            else{
                toast.error('Something went wrong...!'); 
            }
        }

    }

    return (
        <Container className="mt-5">
            <Row>
                <Col lg={4}>
                    <Alert variant="primary" className="mb-3">Admin Login</Alert>
                    <Form onSubmit={handleSubmit}>
                        <Form.Group className="mb-3">
                            <Form.Label>Username</Form.Label>
                            <Form.Control type="text" placeholder="Enter Username" name="username" onChange={handleChange} />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Enter Password" name="password" onChange={handleChange} />
                        </Form.Group>
                        <Button variant="success" type="submit">Login</Button>
                    </Form>
                </Col>
            </Row>
        </Container>
    )
}