import React from 'react'
import { Alert, Container } from 'react-bootstrap'

export default function DashBoard() {
  return (
    <Container className='mt-4'>
        <Alert variant='success'>
             welcome to student mangent app
        </Alert>
        <p> you can perform crud operations on studnt here</p>
    </Container>
  )
}
