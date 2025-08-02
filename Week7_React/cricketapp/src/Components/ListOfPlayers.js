const ListOfPlayers=()=>
{
    const players=[
        { id: 1, name: "Virat Kohli", score: 85 },
        { id: 2, name: "Rohit Sharma", score: 120 },
        { id: 3, name: "Jasprit Bumrah", score: 10 },
        { id: 4, name: "Hardik Pandya", score: 60 },
        { id: 5, name: "Ravindra Jadeja", score: 45 },
        { id: 6, name: "KL Rahul", score: 70 },
        { id: 7, name: "Mohammed Shami", score: 15 },
        { id: 8, name: "Surya Kumar Yadav", score: 90 },
        { id: 9, name: "Rishabh Pant", score: 55 },
        { id: 10, name: "Yuzvendra Chahal", score: 5 },
        { id: 11, name: "Shreyas Iyer", score: 30 }
    ];
    const players70=[];

    players.map((item)=>
    {
        if(item.score <= 70)
            players70.push(item);
    });

    return(
        <div>
            {
                players.map((item)=>
                {
                    return(
                        <div key={item.id}>
                            <li>Mr. {item.name}<span> {item.score} </span></li>
                        </div>
                    );
                })
            }
            <hr/>
            <h1>List of Players having Scores Less than 70</h1>
            {
                players70.map((item)=>
                {
                    return(
                        <div key={item.id}>
                            <li>Mr. {item.name}<span> {item.score} </span></li>
                        </div>
                    );
                })
            }
        </div>
    );
}

export default ListOfPlayers;