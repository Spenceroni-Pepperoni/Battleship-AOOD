package Battleship_AOOD;


import org.junit.Test;

//------------------------------------------------------------------------------
// Spencer McGrath
// 9/14/2023
// Assignment 3: Boat Test
// Note: Test is handled trough JUnit Tests and Gradle
//------------------------------------------------------------------------------
public class BoatTest {
    //A.1 through 12
    Position pos1 = new Position(5, 'D');
    Position oneA = new Position(1, 'A');
    Position oneJ = new Position(1, 'J');
    Position tenA = new Position(10, 'A');
    Position tenJ = new Position(9, 'J');
    Boat battleship = new Boat("Battleship", pos1, "vertical");
    Boat aircraftC = new Boat("Aircraft Carrier", oneA, "vertical");
    Boat cruiser = new Boat("Cruiser", oneJ, "horizontal");
    Boat destroyer = new Boat("Destroyer", tenA, "vertical");
    Boat sub = new Boat("Submarine", tenJ, "horizontal");

    @Test
    public void testBoat(){

        //B.1 B.2 B.3 B.4 B.5
        System.out.println(aircraftC.name());
        System.out.println(battleship.name());
        System.out.println(cruiser.name());
        System.out.println(destroyer.name());
        System.out.println(sub.name());

        //C.1.a through e
        System.out.println(aircraftC.abbreviation());
        System.out.println(battleship.abbreviation());
        System.out.println(cruiser.abbreviation());
        System.out.println(destroyer.abbreviation());
        System.out.println(sub.abbreviation());

        //D.1.a through e
        System.out.println(aircraftC.size());
        System.out.println(battleship.size());
        System.out.println(cruiser.size());
        System.out.println(destroyer.size());
        System.out.println(sub.size());
        
        //F.1.a through d
        System.out.println("Aircraft Carrier onBoat");
        for(int i = 0; i<aircraftC.size(); i++){
            System.out.println(new Position(oneA.getColIndex(), oneA.getRowIndex()+i)+" is on boat: " +aircraftC.onBoat(new Position(oneA.getColIndex(), oneA.getRowIndex()+i)));
        }
        System.out.println(new Position(oneA.getColIndex(), oneA.getRowIndex()+5)+" is on boat: " +aircraftC.onBoat(new Position(oneA.getColIndex(), oneA.getRowIndex()+5)));

        //F.2.a through d
        System.out.println("Battleship onBoat");
        for(int i = 0; i<battleship.size(); i++){
            System.out.println(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)+" is on boat: "+battleship.onBoat(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)));
        }
        System.out.println(new Position(pos1.getColIndex(), pos1.getRowIndex()+4)+" is on boat: "+battleship.onBoat(new Position(pos1.getColIndex(), pos1.getRowIndex()+4)));

        //F.3.a through d
        System.out.println("Cruiser onBoat");
        for(int i = 0; i<cruiser.size(); i++){
            System.out.println(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex())+" is on boat: "+cruiser.onBoat(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex())));
        }
        System.out.println(new Position(oneJ.getColIndex()+1, oneJ.getRowIndex())+" is on boat: "+cruiser.onBoat(new Position(oneJ.getColIndex()+4, oneJ.getRowIndex())));
        
        //F.4.a through d
        System.out.println("Destroyer onBoat");
        for(int i = 0; i<destroyer.size(); i++){
            System.out.println(new Position(tenA.getColIndex(), tenA.getRowIndex()+i)+" is on boat: "+destroyer.onBoat(new Position(tenA.getColIndex(), tenA.getRowIndex()+i)));
        }
        System.out.println(new Position(tenA.getColIndex(), tenA.getRowIndex()+3)+" is on boat: "+destroyer.onBoat(new Position(tenA.getColIndex(), tenA.getRowIndex()+3)));

        //F.5.a through d
        System.out.println("Sub onBoat");
        for(int i = 0; i<sub.size(); i++){
            System.out.println(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex())+" is on boat: "+sub.onBoat(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex())));
        }
        System.out.println(new Position(tenJ.getColIndex()-1, tenJ.getRowIndex())+" is on boat: "+sub.onBoat(new Position(tenJ.getColIndex()-1, tenJ.getRowIndex())));

        //E.1 through 3  G.1 through 3
        System.out.println("\nAircraft Carrier isHit");
        for(int i = 0; i<aircraftC.size(); i++){
            System.out.println(new Position(oneA.getColIndex(), oneA.getRowIndex()+i)+" is hit: " +aircraftC.isHit(new Position(oneA.getColIndex(), oneA.getRowIndex()+i)));
            System.out.println("Hitting position @ " + new Position(oneA.getColIndex(), oneA.getRowIndex()+i));
            aircraftC.hit(new Position(oneA.getColIndex(), oneA.getRowIndex()+i));
            System.out.println(new Position(oneA.getColIndex(), oneA.getRowIndex()+i)+" is hit: " +aircraftC.isHit(new Position(oneA.getColIndex(), oneA.getRowIndex()+i)));
            System.out.println("Is Aircraft Carrier sunk: " + aircraftC.sunk());
        }

        //E.1 through 3  G.1 through 3
        System.out.println("\nBattleship isHit");
        for(int i = 0; i<battleship.size(); i++){
            System.out.println(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)+" is hit: "+battleship.isHit(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)));
            System.out.println("Hitting position @ " + new Position(pos1.getColIndex(), pos1.getRowIndex()+i));
            battleship.hit(new Position(pos1.getColIndex(), pos1.getRowIndex()+i));
            System.out.println(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)+" is hit: "+battleship.isHit(new Position(pos1.getColIndex(), pos1.getRowIndex()+i)));
            System.out.println("Is Battleship sunk: " + battleship.sunk());

        }

        //E.1 through 3  G.1 through 3
        System.out.println("\nCruiser isHit");
        for(int i = 0; i<cruiser.size(); i++){
            System.out.println(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex())+" is hit: "+cruiser.isHit(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex())));
            System.out.println("Hitting position @ " + new Position(oneJ.getColIndex()+i, oneJ.getRowIndex()));
            cruiser.hit(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex()));
            System.out.println(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex())+" is hit: "+cruiser.isHit(new Position(oneJ.getColIndex()+i, oneJ.getRowIndex())));
            System.out.println("Is Cruiser sunk: " + cruiser.sunk());
        }
        
        //E.1 through 3  G.1 through 3
        System.out.println("\nDestroyer isHit");
        for(int i = 0; i<destroyer.size(); i++){
            System.out.println(new Position(tenA.getColIndex(), tenA.getRowIndex()+i)+" is hit: "+destroyer.isHit(new Position(tenA.getColIndex(), tenA.getRowIndex()+i)));
            System.out.println("Hitting position @ " + new Position(tenA.getColIndex(), tenA.getRowIndex()+i));
            destroyer.hit(new Position(tenA.getColIndex(), tenA.getRowIndex()+i));
            System.out.println(new Position(tenA.getColIndex(), tenA.getRowIndex()+i)+" is hit: "+destroyer.isHit(new Position(tenA.getColIndex(), tenA.getRowIndex()+i)));
            System.out.println("Is Destroyer sunk: " + destroyer.sunk());
        }

        //E.1 through 3  G.1 through 3
        System.out.println("\nSub isHit");
        for(int i = 0; i<sub.size(); i++){
            System.out.println(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex())+" is hit: "+sub.isHit(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex())));
            System.out.println("Hitting position @ " + new Position(tenJ.getColIndex()+i, tenJ.getRowIndex()));
            sub.hit(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex()));
            System.out.println(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex())+" is hit: "+sub.isHit(new Position(tenJ.getColIndex()+i, tenJ.getRowIndex())));
            System.out.println("Is Sub sunk: " + sub.sunk());
        }

        //H.1 H.2 I.1.a through e
        System.out.println("\nAircraft Position: "+aircraftC.position()+"\nAircraft Direction: " + aircraftC.direction());
        System.out.println("\nBattleship Position: "+battleship.position()+"\nBattleship Direction: " + battleship.direction());
        System.out.println("\nCruiser Position: "+cruiser.position()+"\nCruiser Direction: " + cruiser.direction());
        System.out.println("\nDestroyer Position: "+destroyer.position()+"\nDestroyer Direction: " + destroyer.direction());
        System.out.println("\nSubmarine Position: "+sub.position()+"\nSubmarine Direction: " + sub.direction());
    }
}
