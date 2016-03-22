package level1;

public class FazeVaper {
int time;
int mlgLevel;
String flavor;
String name;
FazeVaper(int time, int mlgLevel, String flavor, String name) {
	this.time = time;
	this.mlgLevel = mlgLevel;
	this.flavor = flavor;
	this.name = name;
}
void vape(){
	System.out.println(name + " is vaping on some " + flavor);
}
void blaze(){
	System.out.println(name + " is blazing on some " + flavor);
}

} 
