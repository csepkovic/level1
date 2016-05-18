package level1;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
World Califinia = new World ();
Califinia.show();
Bug Antony = new Bug (Color.BLUE);
Location home = new Location (5, 5);
Califinia.add(home, Antony);
Location plant = new Location (1,1);
Flower Flowey = new Flower (Color.BLACK);
Califinia.add(plant, Flowey);
	}
}
