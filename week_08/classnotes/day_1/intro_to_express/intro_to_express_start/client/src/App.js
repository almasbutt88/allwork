import './App.css';
import {useState, useEffect} from "react";


function App() {

  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch('http://localhost:5001')
    .then(response => response.json())
    .then(data => setMessage(data.message)); 
  }, [])
  
  return(
    <>
    <h1> My RoS App</h1>
    <p> The Server Response Is: {message}</p>

    </>
  )
}

export default App;

