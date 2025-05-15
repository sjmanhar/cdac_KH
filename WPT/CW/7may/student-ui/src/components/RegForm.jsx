import React from "react";
import { Alert, Button, Col, Container, Form, Row } from "react-bootstrap";

export default function RegForm() {
  return (
    <Container className="mt-4">
      <Alert variant="success">Register a student</Alert>
      <Container className="mt-3">
        <Form>
          <Row>
            <Col lg={4}>
              <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>id</Form.Label>
                <Form.Control type="text" placeholder="enter id" name="id"/>
              </Form.Group>
            </Col>

            <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>name</Form.Label>
                <Form.Control type="text" placeholder="enter name" name="name"/>
              </Form.Group>
            </Col>
          </Row>
          <Row>
            <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>marks</Form.Label>
                <Form.Control type="text" placeholder="enter marks" name="marks" />
              </Form.Group>
            </Col>

            <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>phone</Form.Label>
                <Form.Control type="text" placeholder="enter phone" name="phone"/>
              </Form.Group>
            </Col>
          </Row>
          <Button type="submit" variant="primary">Register</Button>
        </Form>
      </Container>
    </Container>
  );
}
