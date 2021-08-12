package Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
	private String name;
	private int hitPoints;
	private int strength;

	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return this.name;
	}

	public int getHitPoints() {
		return this.hitPoints;
	}

	public int getStrength() {
		return this.strength;
	}

	@Override
	public List<String> write() {
		List<String> atributes = new ArrayList<>();
		atributes.add(this.name);
		atributes.add(String.valueOf(this.hitPoints));
		atributes.add(String.valueOf(this.strength));
		return atributes;
	}

	@Override
	public void read(List<String> atributes) {
		if (atributes != null && atributes.size() > 0) {
			this.name = atributes.get(0);
			this.hitPoints = Integer.parseInt(atributes.get(1));
			this.strength = Integer.parseInt(atributes.get(2));
		}
	}

	public String toString() {
		return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + "}";
	}
}
