package learn.hibernate3.Players;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teams 
{
	@Id
	int ranking;
	String team_name;
	public Teams() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teams(int ranking, String team_name) {
		super();
		this.ranking = ranking;
		this.team_name = team_name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	@Override
	public String toString() {
		return "Teams [ranking=" + ranking + ", team_name=" + team_name + "]";
	}
	
}
