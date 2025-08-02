import { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function handleLogin()
  {
    setIsLoggedIn(true);
  }

  function handleLogout()
  {
    setIsLoggedIn(false);
  }

  return (
    <div>
      {
        !isLoggedIn ? (
          <>
            <h1>Please sign up</h1><br/>
            <button onClick={()=>{handleLogin();}}>Login</button>
          </>
        ) : (
          <>
            <h1>Welcome back</h1><br/>
            <button onClick={()=>{handleLogout();}}>Logout</button>
          </>
        )
      }
    </div>
  );
}

export default App;
