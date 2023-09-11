package Battleship_AOOD;

import  src.main.java.Battleship_AOOD.Boat;
import  src.main.java.Battleship_AOOD.Position;
import org.junit.Test;

public class BoatTest {
    Position pos1 = new Position(5, 'D');
    Position zeroE = new Position(1, 'A');
    Position zeroJ = new Position(1, 'J');
    Position nineE = new Position(10, 'A');
    Position zeroA = new Position(1, 'A');
    Boat battleship = new Boat("Battleship", pos1, "vertical");
    Boat aircraftC = new Boat("Aircraft Carrier", zeroE, "vertical");
    Boat cruiser = new Boat("Cruiser", zeroJ, "horizontal");
    Boat destroyer = new Boat("Destroyer", nineE, "vertical");
    Boat sub = new Boat("Submarine", zeroA, "horizontal");


    @Test
    public void testBoat(){

        System.out.println(aircraftC.name());
        System.out.println(battleship.name());
        System.out.println(cruiser.name());
        System.out.println(destroyer.name());
        System.out.println(sub.name());

        System.out.println(aircraftC.abbreviation());
        System.out.println(battleship.abbreviation());
        System.out.println(cruiser.abbreviation());
        System.out.println(destroyer.abbreviation());
        System.out.println(sub.abbreviation());

        System.out.println(aircraftC.size());
        System.out.println(battleship.size());
        System.out.println(cruiser.size());
        System.out.println(destroyer.size());
        System.out.println(sub.size());

        System.out.println(aircraftC.isHit(zeroE));
        aircraftC.hit(zeroE);
        System.out.println(aircraftC.isHit(zeroE));

        for(int i = 0; i<aircraftC.size(); i++){
            System.out.println(aircraftC.onBoat(new Position(zeroE.getColIndex(), zeroE.getRowIndex()+i)));
        }
        System.out.println(aircraftC.onBoat(new Position(zeroE.getColIndex(), zeroE.getRowIndex()+1)));

        for(int i = 0; i<battleship.size(); i++){
            System.out.println(battleship.onBoat(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)));
        }
        System.out.println(battleship.onBoat(new Position(pos1.getColIndex(), pos1.getRowIndex()-1)));

        for(int i = 0; i<cruiser.size(); i++){
            System.out.println(cruiser.onBoat(new Position(zeroJ.getColIndex()+i, zeroJ.getRowIndex())));
        }
        System.out.println(cruiser.onBoat(new Position(zeroJ.getColIndex(), zeroJ.getRowIndex()-1)));

        for(int i = 0; i<destroyer.size(); i++){
            System.out.println(destroyer.onBoat(new Position(zeroE.getColIndex(), zeroE.getRowIndex()+i)));
        }
        System.out.println(destroyer.onBoat(new Position(zeroE.getColIndex(), zeroE.getRowIndex()-1)));

        for(int i = 0; i<sub.size(); i++){
            System.out.println(sub.onBoat(new Position(nineE.getColIndex()+i, nineE.getRowIndex())));
        }
        System.out.println(sub.onBoat(new Position(nineE.getColIndex(), nineE.getRowIndex()-1)));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(aircraftC.position());
        System.out.println(battleship.position());
        System.out.println(cruiser.position());
        System.out.println(destroyer.position());
        System.out.println(sub.position());


        System.out.println("onBoat: "+battleship.onBoat(pos1));
        System.out.println("is hit: "+battleship.isHit(pos1));
        System.out.println("hit pos1: "); battleship.hit(pos1);
        System.out.println("is hit now?: "+ battleship.isHit(pos1));
        System.out.println("name: "+battleship.name());
        System.out.println("size: "+battleship.size());
        System.out.println("Boat Abrv: "+battleship.abbreviation());
        System.out.println("Direction: "+battleship.direction());

    }
}
