export function OddPlayers(props)
{
    return(
        <div>
            <li>First: {props.first}</li>
            <li>Third: {props.third}</li>
            <li>Fifth: {props.fifth}</li>
        </div>
    );
}

export function EvenPlayers(props)
{
    return(
        <div>
            <li>Second: {props.second}</li>
            <li>Fourth: {props.fourth}</li>
            <li>Sixth: {props.sixth}</li>
        </div>
    );
}

const T20Players=['First Player','Second Player','Third Player'];
const RanjiTrophyPlayers=['Fourth Player', 'Fifth Player', 'Sixth Player'];
export const IndianPlayers=[...T20Players,...RanjiTrophyPlayers];