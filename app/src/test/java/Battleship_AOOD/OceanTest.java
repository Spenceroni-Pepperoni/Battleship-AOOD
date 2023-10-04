package Battleship_AOOD;

import org.junit.Test;
//import GoodOcean;

public class OceanTest {
    //Ocean ocean = new Ocean();
    GoodOcean ocean = new GoodOcean();

    Position fiveD = new Position(5, 'D');
    Position oneA = new Position(1, 'A');
    Position oneJ = new Position(1, 'H');
    Position tenA = new Position(6, 'A');
    Position tenJ = new Position(7, 'H');
    Boat battleship = new Boat("Battleship", fiveD, "vertical");
    Boat aircraftC = new Boat("Aircraft Carrier", oneA, "vertical");
    Boat cruiser = new Boat("Cruiser", oneJ, "vertical");
    Boat destroyer = new Boat("Destroyer", tenA, "horizontal");
    Boat sub = new Boat("Submarine", tenJ, "horizontal");

    Boat badBoatVert = new Boat("Destroyer", new Position(9,9), "vertical");
    Boat badBoatHorz = new Boat("Aircraft Carrier", new Position(1,9), "horizontal");
    
    @Test
    public void testOcean(){


        try{
            ocean.placeBoat(aircraftC.name(), aircraftC.direction(), aircraftC.position());
            ocean.placeBoat(battleship.name(), battleship.direction(), battleship.position());
            ocean.placeBoat(cruiser.name(), cruiser.direction(), cruiser.position());
            ocean.placeBoat(destroyer.name(), destroyer.direction(), destroyer.position());
            ocean.placeBoat(sub.name(), sub.direction(), sub.position());

            System.out.println("\nAircraft");
            for(int i = 0; i <= aircraftC.size; i++){
                System.out.println("Shooting at " +
                        new Position(aircraftC.position().columnIndex(), aircraftC.position().rowIndex()+i) + ": ");
                ocean.shootAt(new Position(aircraftC.position().columnIndex(), aircraftC.position().rowIndex()+i));
                System.out.println(ocean.hit(new Position(aircraftC.position().columnIndex(), aircraftC.position().rowIndex()+i)));
            }

            System.out.println("\nBattleship");
            for(int i = 0; i <= battleship.size; i++){
                System.out.println("Shooting at " +
                        new Position(battleship.position().columnIndex(), battleship.position().rowIndex()+i) + ": ");
                ocean.shootAt(new Position(battleship.position().columnIndex(), battleship.position().rowIndex()+i));
                System.out.println(ocean.hit(new Position(battleship.position().columnIndex(), battleship.position().rowIndex()+i)));
            }

            System.out.println("\nCruiser");
            for(int i = 0; i <= cruiser.size; i++){
                System.out.println("Shooting at " +
                        new Position(cruiser.position().columnIndex()+i, cruiser.position().rowIndex()) + ": ");
                ocean.shootAt(new Position(cruiser.position().columnIndex()+i, cruiser.position().rowIndex()));
                System.out.println(ocean.hit(new Position(cruiser.position().columnIndex()+i, cruiser.position().rowIndex())));
            }

            System.out.println("\nDestroyer");
            for(int i = 0; i <= destroyer.size; i++){
                System.out.println("Shooting at " +
                        new Position(destroyer.position().columnIndex()+i, destroyer.position().rowIndex()) + ": ");
                ocean.shootAt(new Position(destroyer.position().columnIndex()+i, destroyer.position().rowIndex()));
                System.out.println(ocean.hit(new Position(destroyer.position().columnIndex()+i, destroyer.position().rowIndex())));
            }

            System.out.println("\nSubmarine");
            for(int i = 0; i <= sub.size; i++){
                System.out.println("Shooting at " +
                        new Position(sub.position().columnIndex()+i, sub.position().rowIndex()) + ": ");
                ocean.shootAt(new Position(sub.position().columnIndex()+i, sub.position().rowIndex()));
                System.out.println(ocean.hit(new Position(sub.position().columnIndex()+i, sub.position().rowIndex())));
            }

            

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
