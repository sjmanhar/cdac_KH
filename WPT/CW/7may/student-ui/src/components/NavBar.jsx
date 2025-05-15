import React from 'react'
import {Button, Container, Nav, Navbar} from 'react-bootstrap'
import {LinkContainer} from 'react-router-bootstrap'
//import { removeToken } from '../services/StuSer'
//import { useNavigate } from 'react-router-dom'

export default function NavBar() {

    // const useNavigate()
    // const handleLogout =()=>{
    //     removeToken()
    // }



  return (
    <Navbar expand="lg" bg="dark" data-bs-theme="dark">
      <Container>
        <Navbar.Brand href="#home">STUDENT APP-</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <LinkContainer to="/">
                <Nav.Link >Dashboard</Nav.Link>
            </LinkContainer>
            <LinkContainer to="/reg-student">
                <Nav.Link >Student REgister</Nav.Link>
            </LinkContainer>
            <LinkContainer to="/student-list">
                <Nav.Link >Student List</Nav.Link>
            </LinkContainer>
            
          </Nav>
          <Button>logout</Button>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  )
}
