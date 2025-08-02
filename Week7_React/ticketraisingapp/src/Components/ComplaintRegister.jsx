import { useState } from "react";

const ComplaintRegister=()=>
{
    const [transactionID, setTransactionID] = useState(0);


    const handleSubmit=()=>
    {
        const name = document.querySelector("#name").value;
        setTransactionID(transactionID+1);
        const msg = `Thanks ${name}\nYour Complaint was Submitted.\nTransaction ID is: ${transactionID}`;
        alert(msg);
    }

    return(
        <div>
            <h1 style={{color: "red"}}>Register your complaints here!!!</h1>
            <form onSubmit={(e)=>{e.preventDefault();handleSubmit();}}>
                Name: <input id="name" type="text" name="name"/><br/>
                Complaint: <textarea id="complaint" name="complaint"></textarea><br/>
                <input type="submit" value="Submit"/>
            </form>
        </div>
    );
}

export default ComplaintRegister;