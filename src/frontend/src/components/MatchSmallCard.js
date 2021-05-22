import {React} from 'react';
import {Link, link} from 'react-router-dom';
export const MatchSmallCard = ({teamName,match}) =>{
  if(!match) return null;
  const otherTeam = match.team1 === teamName ? match.team2 : match.team1;
  const otherTeamRoute = `/team/${otherTeam}`;
  return (
    <div className="MatchSmallCard">
      <h3>vs <Link to={otherTeamRoute} > {otherTeam}</Link></h3>
    <p>{match.matchWinner} won by {match.resultMargin} {match.result}</p>
    </div>
  );
}

