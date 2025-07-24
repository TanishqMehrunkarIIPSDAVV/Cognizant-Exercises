import React from "react";

class CountPeople extends React.Component
{
    constructor()
    {
        super();
        this.state={
            entryCount: 0,
            exitCount: 0,
            c: 0
        };
    }

    updateEntry()
    {
        this.setState((prevState)=>
        {
            return {entryCount: prevState.entryCount + 1}
        });
    }

    updateExit()
    {
        this.setState((prevState)=>
        {
            return {exitCount : prevState.exitCount + 1}
        });
    }

    render()
    {
        return(
            <div className="mydiv">
                <div>
                    <button onClick={()=>{this.updateEntry()}}>Login</button> {this.state.entryCount} People Entered!!!
                </div>
                <div>
                    <button onClick={()=>{this.updateExit()}}>Exit</button> {this.state.exitCount} People Left!!!
                </div>
            </div>
        );
    }
}

export default CountPeople;