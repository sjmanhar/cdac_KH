import { Button, Container, Nav, Navbar } from "react-bootstrap";
import { LinkContainer } from "react-router-bootstrap";
import { removeToken } from "../services/AdminService";
import { useNavigate } from "react-router-dom";

export function NavigationBar() {

    const navigate = useNavigate();

    const handleLogout = () => {
        removeToken();
        navigate("/");
    }

    return (
        <Navbar expand="lg" bg="dark" data-bs-theme="dark">
            <Container>
                <Navbar.Brand href="#home">Student App</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <LinkContainer to="/dashboard">
                            <Nav.Link>Dashboard</Nav.Link>
                        </LinkContainer>

                        <LinkContainer to="/register-student">
                            <Nav.Link>Register Student</Nav.Link>
                        </LinkContainer>

                        <LinkContainer to="/student-list">
                            <Nav.Link>Students List</Nav.Link>
                        </LinkContainer>

                    </Nav>
                    <Button variant="success" onClick={handleLogout}>Logout</Button>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    )
}