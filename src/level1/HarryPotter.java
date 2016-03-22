package level1;

public class HarryPotter {

	private boolean cloakOn;
	String name;
	HarryPotter(String name) {
		this.name = name;
		System.out.println("making "+ name +" Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println(name + " is invisible");
		else
			System.out.println(name + " is visible");
	}

	void spyOnSnape() {
		System.out.println(name + " sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter Dank = new HarryPotter("Dank");
		// 2. become invisible
		Dank.makeInvisible(true);
		// 3. spy on professor snape
		Dank.spyOnSnape();
		// 4. become visible again
		Dank.makeInvisible(false);
		// 5. cast a “stupefy” spell
		Dank.castSpell("rip");
	}

}






