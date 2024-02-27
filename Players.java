package learn.hibernate3.Players;

import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Players {
	@Id
int jerseynum;
String palyername;
String role;
@OneToOne
Teams Teams;
public Players() {
	super();
	// TODO Auto-generated constructor stub
}
public Players(int jerseynum, String palyername, String role, learn.hibernate3.Players.Teams teams) {
	super();
	this.jerseynum = jerseynum;
	this.palyername = palyername;
	this.role = role;
	Teams = teams;
}
public int getJerseynum() {
	return jerseynum;
}
public void setJerseynum(int jerseynum) {
	this.jerseynum = jerseynum;
}
public String getPalyername() {
	return palyername;
}
public void setPalyername(String palyername) {
	this.palyername = palyername;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Teams getTeams() {
	return Teams;
}
public void setTeams(Teams teams) {
	Teams = teams;
}
@Override
public String toString() {
	return "Players [jerseynum=" + jerseynum + ", palyername=" + palyername + ", role=" + role + ", Teams=" + Teams
			+ "]";
}

}
