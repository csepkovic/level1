package level1;

public class SpongeBobRunner {
public static void main(String[] args) {
	SpongeBob SpongeBob = new SpongeBob("SpongeBob");
	SpongeBob Squidward = new SpongeBob("Squidward");
	SpongeBob Patrick = new SpongeBob("Patrick");
	for (int i = 0; i < 100; i++) {
	SpongeBob.eat();
	SpongeBob.laugh();
	Squidward.eat();
	Squidward.laugh();
	Patrick.eat();
	Patrick.laugh();
	}
}
}
