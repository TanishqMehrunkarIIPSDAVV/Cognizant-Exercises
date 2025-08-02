const Register=()=>
{
    const handleSubmit=(e)=>
    {
        const errors=[];
        e.preventDefault();
        const name = document.querySelector("#name").value;
        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;
        if(name.length < 5) errors.push({name : 'Full Name'});
        const validEmailRegex = new RegExp(/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/);
        if(!validEmailRegex.test(email)) errors.push({name: 'Email'});
        if(password.length < 8) errors.push({name: "Password"});

        errors.forEach((error)=>
        {
            let msg = "";
            if(error.name === 'Full Name') msg = `Full Name must be 5 characters long!`;
            else if(error.name === 'Email') msg = `Email is not valid!`;
            else if(error.name === 'Password') msg = `Password must be 8 characters long!`;
            alert(msg);
        });
    }
    return(
        <div>
            <h1 style={{color: "red"}}>Register Here!!!</h1>
            <form onSubmit={(e)=>{handleSubmit(e)}}>
                Name: <input type="text" id="name"/><br/>
                Email: <input type="email" id="email"/><br/>
                Password: <input type="password" id="password"/>
                <input type="submit" value="Submit"/>
            </form>
        </div>
    );
}

export default Register;