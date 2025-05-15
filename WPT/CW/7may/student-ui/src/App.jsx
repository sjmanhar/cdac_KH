import {BrowserRouter, Route, Routes} from 'react-router-dom'
import './App.css'
import NavBar from './components/NavBar'
import DashBoard from './components/DashBoard'
import RegForm from './components/RegForm'
import StudenetList from './components/StudenetList'

function App() {
 

  return (
    <BrowserRouter>
      <NavBar/>
      <Routes>
        <Route path ="/" element={<DashBoard/>} />
        <Route path ="/reg-student" element={<RegForm/>} />
        <Route path ="/student-list" element={<StudenetList/>} />

      </Routes>
    </BrowserRouter>
  )
}

export default App
