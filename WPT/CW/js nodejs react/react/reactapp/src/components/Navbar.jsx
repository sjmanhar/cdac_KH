/* eslint-disable react-refresh/only-export-components */
import React from 'react'
import { Link } from 'react-router-dom'

export default function () {
  return (
    <div>
        <Link to="/">Home</Link>
        <Link to="/about">About Us</Link>
        <Link to="/contact">Contact Us</Link>
        

        {/* <a href="/">Home</a>
        <a href='/about'>About Us</a>
        <a href='/contact'>Contact Us</a> */}
    </div>
  )
}
