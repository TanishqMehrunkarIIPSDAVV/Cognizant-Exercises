import './App.css';
import {BrowserRouter as BR,Route,Routes,Link} from "react-router-dom";
import Home from "./Components/Home";
import TrainersList from './Components/TrainersList';
import trainersMock from './TrainersMock';
import TrainerDetails from './Components/TrainerDetails';

function App() {
  return (
    <div>
      <h1>My Academy Trainers App</h1>
      <BR>
        <nav>
          <Link to="/">Home</Link> | <Link to="/trainers">Show Trainers</Link>
        </nav>

        <Routes>
          <Route element={<Home />} path='/' />
          <Route element={<TrainersList trainers={trainersMock} />} path="/trainers" />
          <Route element={<TrainerDetails />} path={`/trainers/:trainerId`}/>
        </Routes>
      </BR>
    </div>
  );
}

export default App;
