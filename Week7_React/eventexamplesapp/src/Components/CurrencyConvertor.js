function handleSubmit()
{
    const amt = document.querySelector("#amt").value;
    const curr = document.querySelector("#curr").value;

    alert(`Converting to ${curr} Amount is ${amt*80}`);
}

const CurrencyConvertor=()=>
{
    return(
        <div>
            <h1 className="curr">Currency Convertor!!!</h1>
            <br/>
            <form onSubmit={(e)=>{e.preventDefault();handleSubmit();}}>
                Amount: <input id="amt" type="number" name="amt"/><br/>
                Currency: <textarea id="curr" name="curr"></textarea><br/>
                <input type="submit" value="Convert"/>
            </form>
        </div>
    );
}

export default CurrencyConvertor;