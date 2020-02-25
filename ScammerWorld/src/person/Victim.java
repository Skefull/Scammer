package person;

public class Victim implements Comparable<Victim> {
	private String name;
	private double amountScammed;

	public Victim(String name, double amountScammed) {
		this.name = name;
		this.amountScammed = amountScammed;
	}
	public String getName() {
		return name;
	}
	public double getAmountScammed() {
		return amountScammed;
	}
	
	public int compareTo(Victim v) {
		int result = 0; // Assume equality
		System.out.println("Compare " + this.getName() + " to " + v.getName());
		if (this.getAmountScammed() < v.getAmountScammed()) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}
}
