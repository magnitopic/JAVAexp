package Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;

	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.weapon = "Sword";
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return this.weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return this.hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return this.strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public List<String> write() {
		List<String> atributes = new ArrayList<>();
		atributes.add(this.name);
		atributes.add(String.valueOf(this.hitPoints));
		atributes.add(String.valueOf(this.strength));
		atributes.add(this.weapon);
		return atributes;
	}

	@Override
	public void read(List<String> atributes) {
		if (atributes != null && atributes.size() > 0) {
			this.name = atributes.get(0);
			this.hitPoints = Integer.parseInt(atributes.get(1));
			this.strength = Integer.parseInt(atributes.get(2));
			this.weapon = atributes.get(3);
		}
	}

	public String toString() {
		return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength
				+ ", weapon='" + this.weapon + "'}";
	}

	public static void main(String[] args) {
		Player player=new Player("Mag", 200, 30);
		System.out.println(player.toString());
		List<String> atributes=new ArrayList<>();
		atributes.add("Magnitopic");
		atributes.add("300");
		atributes.add("47");
		atributes.add("Bow");
		player.read(atributes);
		System.out.println(player.toString());
	}
}