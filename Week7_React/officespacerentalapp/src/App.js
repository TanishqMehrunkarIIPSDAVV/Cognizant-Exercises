import sr from "./images/logo.svg";
import "./App.css";

function App() {
  const officeSpaces = [
    {
      id: 1,
      name: "DBS Hub",
      rent: 50000,
      address: "Chennai, India",
      image: <img src={sr} alt="DBS Hub" height="25%" width="25%" />
    },
    {
      id: 2,
      name: "WeWork Galaxy",
      rent: 75000,
      address: "Bangalore, India",
      image: <img src={sr} alt="WeWork Galaxy" height="25%" width="25%" />
    },
    {
      id: 3,
      name: "Innov8 Co-working",
      rent: 40000,
      address: "Delhi, India",
      image: <img src={sr} alt="Innov8 Co-working" height="25%" width="25%" />
    },
    {
      id: 4,
      name: "The Executive Centre",
      rent: 95000,
      address: "Mumbai, India",
      image: <img src={sr} alt="The Executive Centre" height="25%" width="25%" />
    }
  ];
  const element = "Office Space";
  return (
    <div className="mydiv">
      <h1>{element}, At Affordable Range</h1>
      {
        officeSpaces.map((space,index)=>(
          <>
            <div key={index}>
                {space.image}
                <h3>Name: {space.name}</h3>
                <h3 className={space.rent <= 60000 ? "red" : "green"}>Rent Rs: {space.rent}</h3>
                <h3>Address: {space.address}</h3>
            </div>
            <br/>
          </>
        ))
      }
    </div>
  );
}

export default App;
