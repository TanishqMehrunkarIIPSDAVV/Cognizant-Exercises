import './App.css';
import { useState } from 'react';
import CurrencyConvertor from './Components/CurrencyConvertor';

function welcomeFunc(msg)
{
  alert(msg);
}

function App() {
  const [counter,setCounter] = useState(0);
  return (
    <div>
      <br/>
      {counter}<br/><br/>
      <button onClick={()=>{setCounter(counter+1);alert("Hello! Member1");}}>Increment</button><br/>
      <button onClick={()=>{setCounter(counter-1)}}>Decrement</button><br/>
      <button onClick={()=>{welcomeFunc("welcome")}}>Say welcome</button><br/>
      <button onClick={()=>{alert('I was clicked')}}>Click on me</button><br/>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
