package pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class GameData implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String localGroup = null;
	private String visitorGroup = null;
	private int localGoal = 0;
	private int visitorGoal = 0;
	private String place = null;
	private String  gameDate = null;
	
	
	public GameData (String localGroup, String visitorGroup, int localGoal, int visitorGoal, String place, String gameDate) {
		
		this.localGroup = localGroup;
		this.visitorGroup = visitorGroup;
		this.localGoal = localGoal;
		this.visitorGoal = visitorGoal;
		this.place = place;
		this.gameDate = gameDate;
	}


	public String getLocalGroup() {
		return localGroup;
	}


	public void setLocalGroup(String localGroup) {
		this.localGroup = localGroup;
	}


	public String getVisitorGroup() {
		return visitorGroup;
	}


	public void setVisitorGroup(String visitorGroup) {
		this.visitorGroup = visitorGroup;
	}


	public int getLocalGoal() {
		return localGoal;
	}


	public void setLocalGoal(int localGoal) {
		this.localGoal = localGoal;
	}


	public int getVisitorGoal() {
		return visitorGoal;
	}


	public void setVisitorGoal(int visitorGoal) {
		this.visitorGoal = visitorGoal;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getGameDate() {
		return gameDate;
	}


	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}


	@Override
	public int hashCode() {
		return Objects.hash(gameDate, localGoal, localGroup, place, visitorGoal, visitorGroup);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameData other = (GameData) obj;
		return Objects.equals(gameDate, other.gameDate) && localGoal == other.localGoal
				&& Objects.equals(localGroup, other.localGroup) && Objects.equals(place, other.place)
				&& visitorGoal == other.visitorGoal && Objects.equals(visitorGroup, other.visitorGroup);
	}


	@Override
	public String toString() {
		return "GameData [localGroup=" + localGroup + ", visitorGroup=" + visitorGroup + ", localGoal=" + localGoal
				+ ", visitorGoal=" + visitorGoal + ", place=" + place + ", gameDate=" + gameDate + "]";
	}
	
	
	
	
}
