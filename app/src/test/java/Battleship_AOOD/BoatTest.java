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
            System.out.println(new Position(oneA.columnIndex(), oneA.rowIndex()+i)+" is on boat: " +aircraftC.onBoat(new Position(oneA.columnIndex(), oneA.rowIndex()+i)));
        }
        System.out.println(new Position(oneA.columnIndex(), oneA.rowIndex()+5)+" is on boat: " +aircraftC.onBoat(new Position(oneA.columnIndex(), oneA.rowIndex()+5)));

        //F.2.a through d
        System.out.println("Battleship onBoat");
        for(int i = 0; i<battleship.size(); i++){
            System.out.println(new Position(pos1.columnIndex(), pos1.rowIndex()+i)+" is on boat: "+battleship.onBoat(new Position(pos1.columnIndex(), pos1.rowIndex()+i)));
        }
        System.out.println(new Position(pos1.columnIndex(), pos1.rowIndex()+4)+" is on boat: "+battleship.onBoat(new Position(pos1.columnIndex(), pos1.rowIndex()+4)));

        //F.3.a through d
        System.out.println("Cruiser onBoat");
        for(int i = 0; i<cruiser.size(); i++){
            System.out.println(new Position(oneJ.columnIndex()+i, oneJ.rowIndex())+" is on boat: "+cruiser.onBoat(new Position(oneJ.columnIndex()+i, oneJ.rowIndex())));
        }
        System.out.println(new Position(oneJ.columnIndex()+1, oneJ.rowIndex())+" is on boat: "+cruiser.onBoat(new Position(oneJ.columnIndex()+4, oneJ.rowIndex())));
        
        //F.4.a through d
        System.out.println("Destroyer onBoat");
        for(int i = 0; i<destroyer.size(); i++){
            System.out.println(new Position(tenA.columnIndex(), tenA.rowIndex()+i)+" is on boat: "+destroyer.onBoat(new Position(tenA.columnIndex(), tenA.rowIndex()+i)));
        }
        System.out.println(new Position(tenA.columnIndex(), tenA.rowIndex()+3)+" is on boat: "+destroyer.onBoat(new Position(tenA.columnIndex(), tenA.rowIndex()+3)));

        //F.5.a through d
        System.out.println("Sub onBoat");
        for(int i = 0; i<sub.size(); i++){
            System.out.println(new Position(tenJ.columnIndex()+i, tenJ.rowIndex())+" is on boat: "+sub.onBoat(new Position(tenJ.columnIndex()+i, tenJ.rowIndex())));
        }
        System.out.println(new Position(tenJ.columnIndex()-1, tenJ.rowIndex())+" is on boat: "+sub.onBoat(new Position(tenJ.columnIndex()-1, tenJ.rowIndex())));

        //E.1 through 3  G.1 through 3
        System.out.println("\nAircraft Carrier isHit");
        for(int i = 0; i<aircraftC.size(); i++){
            System.out.println(new Position(oneA.columnIndex(), oneA.rowIndex()+i)+" is hit: " +aircraftC.isHit(new Position(oneA.columnIndex(), oneA.rowIndex()+i)));
            System.out.println("Hitting position @ " + new Position(oneA.columnIndex(), oneA.rowIndex()+i));
            aircraftC.hit(new Position(oneA.columnIndex(), oneA.rowIndex()+i));
            System.out.println(new Position(oneA.columnIndex(), oneA.rowIndex()+i)+" is hit: " +aircraftC.isHit(new Position(oneA.columnIndex(), oneA.rowIndex()+i)));
            System.out.println("Is Aircraft Carrier sunk: " + aircraftC.sunk());
        }

        //E.1 through 3  G.1 through 3
        System.out.println("\nBattleship isHit");
        for(int i = 0; i<battleship.size(); i++){
            System.out.println(new Position(pos1.columnIndex(), pos1.rowIndex()+i)+" is hit: "+battleship.isHit(new Position(pos1.columnIndex(), pos1.rowIndex()+i)));
            System.out.println("Hitting position @ " + new Position(pos1.columnIndex(), pos1.rowIndex()+i));
            battleship.hit(new Position(pos1.columnIndex(), pos1.rowIndex()+i));
            System.out.println(new Position(pos1.columnIndex(), pos1.rowIndex()+i)+" is hit: "+battleship.isHit(new Position(pos1.columnIndex(), pos1.rowIndex()+i)));
            System.out.println("Is Battleship sunk: " + battleship.sunk());

        }

        //E.1 through 3  G.1 through 3
        System.out.println("\nCruiser isHit");
        for(int i = 0; i<cruiser.size(); i++){
            System.out.println(new Position(oneJ.columnIndex()+i, oneJ.rowIndex())+" is hit: "+cruiser.isHit(new Position(oneJ.columnIndex()+i, oneJ.rowIndex())));
            System.out.println("Hitting position @ " + new Position(oneJ.columnIndex()+i, oneJ.rowIndex()));
            cruiser.hit(new Position(oneJ.columnIndex()+i, oneJ.rowIndex()));
            System.out.println(new Position(oneJ.columnIndex()+i, oneJ.rowIndex())+" is hit: "+cruiser.isHit(new Position(oneJ.columnIndex()+i, oneJ.rowIndex())));
            System.out.println("Is Cruiser sunk: " + cruiser.sunk());
        }
        
        //E.1 through 3  G.1 through 3
        System.out.println("\nDestroyer isHit");
        for(int i = 0; i<destroyer.size(); i++){
            System.out.println(new Position(tenA.columnIndex(), tenA.rowIndex()+i)+" is hit: "+destroyer.isHit(new Position(tenA.columnIndex(), tenA.rowIndex()+i)));
            System.out.println("Hitting position @ " + new Position(tenA.columnIndex(), tenA.rowIndex()+i));
            destroyer.hit(new Position(tenA.columnIndex(), tenA.rowIndex()+i));
            System.out.println(new Position(tenA.columnIndex(), tenA.rowIndex()+i)+" is hit: "+destroyer.isHit(new Position(tenA.columnIndex(), tenA.rowIndex()+i)));
            System.out.println("Is Destroyer sunk: " + destroyer.sunk());
        }

        //E.1 through 3  G.1 through 3
        System.out.println("\nSub isHit");
        for(int i = 0; i<sub.size(); i++){
            System.out.println(new Position(tenJ.columnIndex()+i, tenJ.rowIndex())+" is hit: "+sub.isHit(new Position(tenJ.columnIndex()+i, tenJ.rowIndex())));
            System.out.println("Hitting position @ " + new Position(tenJ.columnIndex()+i, tenJ.rowIndex()));
            sub.hit(new Position(tenJ.columnIndex()+i, tenJ.rowIndex()));
            System.out.println(new Position(tenJ.columnIndex()+i, tenJ.rowIndex())+" is hit: "+sub.isHit(new Position(tenJ.columnIndex()+i, tenJ.rowIndex())));
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
