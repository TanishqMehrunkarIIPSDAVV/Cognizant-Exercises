import React from "react";

class GetUser extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            person: null,
            loading: true,
        };
    }

    async componentDidMount()
    {
        const url = "https://api.randomuser.me/";
        const response = await fetch(url);
        const data = await response.json();
        this.setState({person: data.results[0], loading: false});
        console.log(data.results[0]);
    }

    render()
    {
        return(
            <div>
                {
                    this.state.loading ? (
                        <>Loading...</>
                    ) : (
                        <>
                            <h1>Mr. {this.state.person.name.first} {this.state.person.name.last}</h1>
                            <img src={this.state.person.picture.large} alt="User"/>
                        </>
                    )
                }
            </div>
        );
    }
}

export default GetUser;