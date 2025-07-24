import { useParams } from "react-router-dom";
import trainersMock from "../TrainersMock";

function TrainerDetails()
{
    const {trainerId} = useParams();
    const trainer = trainersMock.find(t => t.trainerId === trainerId);

    return(
        <div>
            <h1>Trainer Details</h1>
            <h3>{trainer.name} {trainer.technology}</h3>
            <p>{trainer.email}</p>
            <p>{trainer.phone}</p>
            {
                trainer.skills.length > 0 ? (
                    <ul>
                        {
                            trainer.skills.map((skill,index)=>(
                                <li key={index}>{skill}</li>
                            ))
                        }
                    </ul>
                ) : (
                    <></>
                )
            }
        </div>
    );
}

export default TrainerDetails;