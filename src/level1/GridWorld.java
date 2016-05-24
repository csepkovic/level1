package level1;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
World Califinia = new World ();
Califinia.show();
Bug Boi = new Bug ();
Location home = new Location (5, 5);
Califinia.add(home, Boi);
Bug Antony = new Bug (Color.BLUE);
Location random = new Location (new Random().nextInt(10), new Random().nextInt(10));
Califinia.add(random, Antony);
Antony.turn();
Antony.turn();
Location plant = new Location (5, 4);
Location plant2 = new Location (5, 6);
Flower Flowey = new Flower (Color.YELLOW);
Califinia.add(plant, Flowey);
Califinia.add(plant2, Flowey);
Location x1 = new Location (2, 2);
Location x2 = new Location (1, 1);
Location x3 = new Location (3, 3);
Location x4 = new Location (3, 1);
Location x5 = new Location (1, 3);
Califinia.add(x1, Flowey);
Califinia.add(x2, Flowey);
Califinia.add(x3, Flowey);
Califinia.add(x4, Flowey);
Califinia.add(x5, Flowey);
	}
}
