import './App.css';
import { IndianPlayers } from './Components/IndianPlayers';
import {OddPlayers} from './Components/IndianPlayers';
import {EvenPlayers} from './Components/IndianPlayers';
import ListOfPlayers from './Components/ListOfPlayers';

function App() {
  const flag=false;
  return (
    <div>
      {
        flag ? (
          <div>
            <h1>List of Players</h1>
            <ListOfPlayers />            
          </div>
        ) : (
          <div>
            <h1>Odd Players</h1>
            <OddPlayers first={"Sachin1"} third={"Virat3"} fifth={"Yuvaraj5"}/>
            <hr/>
            <h1>Even Players</h1>
            <EvenPlayers second={"Dhoni2"} fourth={"Rohit4"} sixth={"Raina6"}/>
            <hr/>
            <h1>List of Indian Players Merged</h1>
            <div>
              {
                  IndianPlayers.map((player,index)=>(
                    <li key={index}>
                      Mr. {player}
                    </li>
                  ))
              }
            </div>
          </div>
        )
      }
    </div>
  );
}

export default App;
