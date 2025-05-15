import './App.css'
import Registrationform from './components/Registrationform'
import { UserData } from './components/UserData'
import { UserRecord } from './components/UserRecord'

function App() {

  return (
    <>
     <div>
      <Registrationform/>
      {/* <UserData/> */}
      <UserRecord/>
     </div>
    </>
  )
}

export default App
