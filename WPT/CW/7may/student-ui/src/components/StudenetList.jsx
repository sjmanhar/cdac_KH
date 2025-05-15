import React from 'react'
import { Container, Table } from 'react-bootstrap'

export default function StudenetList() {
  return (
    <Container className='mt-4'>
    <Alert variant='success'>
         list of students
    </Alert>
    <Container className='mt-3'>
        <Table>
            <thead>
                <tr>
                    <th>id </th>
                    <th>name</th>
                    <th>marks</th>
                    <th>phone</th>
                    <th>action</th>
                </tr>

            </thead>
            <tbody></tbody>
        </Table>
    </Container>
</Container>
  )
}
