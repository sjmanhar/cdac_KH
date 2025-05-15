import './App.css'
import About from './components/About'
import Contact from './components/Contact'
import Home from './components/Home'
import Navbar from './components/Navbar'
import {BrowserRouter, Route, Routes} from 'react-router-dom'
// import { DemoComponent } from './DemoComponent'
// import { MyComponent } from './MyComponent'

function App() {
  

  return (
    <BrowserRouter>
    <Navbar/>
    <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
        <Route path="/contact" element={<Contact/>}/>

    </Routes>
      {/* <div>hello world</div>
      <MyComponent text="HELLOOO WORLDDD" heading="welcome"></MyComponent>
      <DemoComponent text="CLASS PROPS EG" heading="welcome CLASS"></DemoComponent> */}
    </BrowserRouter>
  )
}

export default App
