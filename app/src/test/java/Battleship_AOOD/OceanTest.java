package Battleship_AOOD;

import org.junit.Test;


public class OceanTest {
    Ocean ocean = new Ocean();

    Position fiveD = new Position(5, 'D');
    Position oneA = new Position(1, 'A');
    Position oneJ = new Position(1, 'H');
    Position tenA = new Position(6, 'A');
    Position tenJ = new Position(8, 'H');
    Boat battleship = new Boat("Battleship", fiveD, "vertical");
    Boat aircraftC = new Boat("Aircraft Carrier", oneA, "vertical");
    Boat cruiser = new Boat("Cruiser", oneJ, "vertical");
    Boat destroyer = new Boat("Destroyer", tenA, "horizontal");
    Boat sub = new Boat("Submarine", tenJ, "horizontal");

    Boat badBoatVert = new Boat("Destroyer", new Position(9,9), "vertical");
    Boat badBoatHorz = new Boat("Aircraft", new Position(1,9), "horizontal");
    
    @Test
    public void testOcean(){
        try{
            ocean.placeBoat(badBoatVert.name(), badBoatVert.direction(), badBoatVert.position());
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            ocean.placeBoat(badBoatHorz.name(), badBoatHorz.direction(), badBoatHorz.position());
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            ocean.placeBoat(aircraftC.name(), aircraftC.direction(), aircraftC.position());
            ocean.placeBoat(battleship.name(), battleship.direction(), battleship.position());
            ocean.placeBoat(cruiser.name(), cruiser.direction(), cruiser.position());
            System.out.println(destroyer.position());
            ocean.placeBoat(destroyer.name(), destroyer.direction(), destroyer.position());
            ocean.placeBoat(sub.name(), sub.direction(), sub.position());

            for(int i = 0; i <= aircraftC.size; i++){
                System.out.println("Shooting at " +
                        new Position(aircraftC.position().getColIndex(), aircraftC.position().getRowIndex()+i) + ": ");
                ocean.shootAt(new Position(aircraftC.position().getColIndex(), aircraftC.position().getRowIndex()+i));
                System.out.print(ocean.hit(new Position(aircraftC.position().getColIndex(), aircraftC.position().getRowIndex()+i)));
            }

            for(int i = 0; i <= battleship.size; i++){
                System.out.println("Shooting at " +
                        new Position(battleship.position().getColIndex(), battleship.position().getRowIndex()+i) + ": ");
                ocean.shootAt(new Position(battleship.position().getColIndex(), battleship.position().getRowIndex()+i));
                System.out.print(ocean.hit(new Position(battleship.position().getColIndex(), battleship.position().getRowIndex()+i)));
            }

            for(int i = 0; i <= cruiser.size; i++){
                System.out.println("Shooting at " +
                        new Position(cruiser.position().getColIndex()+i, cruiser.position().getRowIndex()) + ": ");
                ocean.shootAt(new Position(cruiser.position().getColIndex()+i, cruiser.position().getRowIndex()));
                System.out.print(ocean.hit(new Position(cruiser.position().getColIndex()+i, cruiser.position().getRowIndex())));
            }

            for(int i = 0; i <= destroyer.size; i++){
                System.out.println("Shooting at " +
                        new Position(destroyer.position().getColIndex(), destroyer.position().getRowIndex()+i) + ": ");
                ocean.shootAt(new Position(destroyer.position().getColIndex(), destroyer.position().getRowIndex()+i));
                System.out.print(ocean.hit(new Position(destroyer.position().getColIndex(), destroyer.position().getRowIndex()+i)));
            }

            for(int i = 0; i <= aircraftC.size; i++){
                System.out.println("Shooting at " +
                        new Position(aircraftC.position().getColIndex(), aircraftC.position().getRowIndex()+i) + ": ");
                ocean.shootAt(new Position(aircraftC.position().getColIndex(), aircraftC.position().getRowIndex()+i));
                System.out.print(ocean.hit(new Position(aircraftC.position().getColIndex(), aircraftC.position().getRowIndex()+i)));
            }


        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
