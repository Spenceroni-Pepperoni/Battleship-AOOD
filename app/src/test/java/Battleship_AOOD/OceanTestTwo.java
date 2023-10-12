package Battleship_AOOD;

import org.junit.Test;
//import GoodOcean;

public class OceanTestTwo {
    //Ocean ocean = new Ocean();
    @Test
    public void testOcean(){
        GoodOcean ocean = new GoodOcean();

        Position oneA = new Position('A', 1);
        Position fiveD = new Position('D', 5);
        Position oneG = new Position('G', 1);
        Position eightA = new Position('A', 8);
        Position sevenJ = new Position('J', 7);

        Boat aircraftC = new Boat("Aircraft Carrier", oneA, "vertical");
        Boat battleship = new Boat("Battleship", fiveD, "vertical");
        Boat cruiser = new Boat("Cruiser", oneG, "vertical");
        Boat destroyer = new Boat("Destroyer", eightA, "horizontal");
        Boat sub = new Boat("Submarine", sevenJ, "horizontal");

        try {
            ocean.placeBoat(aircraftC.name(), aircraftC.direction(), aircraftC.position());
            ocean.placeBoat(battleship.name(), battleship.direction(), battleship.position());
            ocean.placeBoat(cruiser.name(), cruiser.direction(), cruiser.position());
            ocean.placeBoat(destroyer.name(), destroyer.direction(), destroyer.position());
            ocean.placeBoat(sub.name(), sub.direction(), sub.position());

            System.out.println("Place Boat, Shoot At, and Hit: ");
            System.out.println("\nAircraft Carrier(should return 5 true then 1 false)");
            for(int i = 0; i <= aircraftC.size(); i++){
                System.out.print("Shooting at " + new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex()) + ": ");
                ocean.shootAt(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex()));
                System.out.println(ocean.hit(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex())));
            }

            System.out.println("\nBattleship(should return 4 true then 1 false)");
            for(int i = 0; i <= battleship.size(); i++){
                System.out.print("Shooting at " + new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex()) + ": ");
                ocean.shootAt(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex()));
                System.out.println(ocean.hit(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex())));
            }

            System.out.println("\nCruiser(should return 3 true then 1 false)");
            for(int i = 0; i <= cruiser.size(); i++){
                System.out.print("Shooting at " + new Position(cruiser.position().rowIndex()+i, cruiser.position().columnIndex()) + ": ");
                ocean.shootAt(new Position(cruiser.position().rowIndex()+i, cruiser.position().columnIndex()));
                System.out.println(ocean.hit(new Position(cruiser.position().rowIndex()+i, cruiser.position().columnIndex())));
            }

            System.out.println("\nDestroyer(should return 2 true then 1 false)");
            for(int i = 0; i <= destroyer.size(); i++){
                System.out.print("Shooting at " + new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i) + ": ");
                ocean.shootAt(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex()+ i));
                System.out.println(ocean.hit(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex()+ i)));
            }

            System.out.println("\nSubmarine(should return 3 true then 1 false)");
            for(int i = 0; i <= sub.size(); i++){
                System.out.print("Shooting at " + new Position(sub.position().rowIndex(), sub.position().columnIndex()+ i) + ": ");
                ocean.shootAt(new Position(sub.position().rowIndex(), sub.position().columnIndex()+ i));
                System.out.println(ocean.hit(new Position(sub.position().rowIndex(), sub.position().columnIndex()+ i)));
            }


            System.out.println("\n\n\nBoat Initial & Boat Name: ");

            System.out.println("\nAircraft Carrier(should return 5 \"A - Aircraft Carrier\")");
            for(int i = 0; i <= aircraftC.size(); i++){
                System.out.print("Position: " + new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex()) + ": ");
                System.out.print(ocean.boatInitial(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex())));
                System.out.println(" - " + ocean.boatName(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex())));
            }

            System.out.println("\nBattleship(should return 4 \"B - Battleship\")");
            for(int i = 0; i <= battleship.size(); i++){
                System.out.print("Position: " + new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex()) + ": ");
                System.out.print(ocean.boatInitial(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex())));
                System.out.println(" - " + ocean.boatName(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex())));
            }

            System.out.println("\nCruiser(should return 3 \"C - Cruiser\")");
            for(int i = 0; i <= cruiser.size(); i++){
                System.out.print("Position: " + new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex()) + ": ");
                System.out.print(ocean.boatInitial(new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex())));
                System.out.println(" - " + ocean.boatName(new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex())));
            }

            System.out.println("\nDestroyer(should return 2 \"D - Destroyer\")");
            for(int i = 0; i <= destroyer.size(); i++){
                System.out.print("Position: " + new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i) + ": ");
                System.out.print(ocean.boatInitial(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i)));
                System.out.println(" - " + ocean.boatName(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i)));
            }

            System.out.println("\nSubmarine(should return 3 \"S - Submarine\")");
            for(int i = 0; i <= sub.size(); i++){
                System.out.print("Position: " + new Position(sub.position().rowIndex(), sub.position().columnIndex() + i) + ": ");
                System.out.print(ocean.boatInitial(new Position(sub.position().rowIndex(), sub.position().columnIndex() + i)));
                System.out.println(" - " + ocean.boatName(new Position(sub.position().rowIndex(), sub.position().columnIndex() + i)));
            }

            //----------------------------------------------------------------------------------------------------------

            System.out.println("\n\n\nSunk & All Sunk:\n");

            System.out.println("All boats are sunk?(should be false): " + ocean.allSunk());

            System.out.println("\nAircraft Carrier(should all be false)");
            for(int i = 0; i <= aircraftC.size(); i++){
                System.out.print("Position: " + new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex()) + ": ");
                System.out.println(ocean.sunk(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex())));
            }

            System.out.println("\nBattleship(should all be false)");
            for(int i = 0; i <= battleship.size(); i++){
                System.out.print("Position: " + new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex()) + ": ");
                System.out.println(ocean.sunk(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex())));
            }

            System.out.println("\nCruiser(should all be false)");
            for(int i = 0; i <= cruiser.size(); i++){
                System.out.print("Position: " + new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex()) + ": ");
                System.out.println(ocean.sunk(new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex())));
            }

            System.out.println("\nDestroyer(should all be false)");
            for(int i = 0; i <= destroyer.size(); i++){
                System.out.print("Position: " + new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i) + ": ");
                System.out.println(ocean.sunk(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i)));
            }

            System.out.println("\nSubmarine(should all be false)");
            for(int i = 0; i <= sub.size(); i++){
                System.out.print("Position: " + new Position(sub.position().rowIndex(), sub.position().columnIndex() + i) + ": ");
                System.out.println(ocean.sunk(new Position(sub.position().rowIndex(), sub.position().columnIndex() + i)));
            }


            System.out.println("\nSinking all boats...");

            for(int i = 0; i <= aircraftC.size(); i++){
                battleship.hit(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex()));
            }

            for(int i = 0; i <= battleship.size(); i++){
                battleship.hit(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex()));
            }


            for(int i = 0; i <= cruiser.size(); i++){
                battleship.hit(new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex()));
            }


            for(int i = 0; i <= destroyer.size(); i++){
                battleship.hit(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i));
            }


            for(int i = 0; i <= sub.size(); i++){
                battleship.hit(new Position(sub.position().rowIndex(), sub.position().columnIndex() + i));
            }


            System.out.println("\nAircraft Carrier(should all be true except last one)");
            for(int i = 0; i <= aircraftC.size(); i++){
                System.out.print("Position: " + new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex()) + ": ");
                System.out.println(ocean.sunk(new Position(aircraftC.position().rowIndex() + i, aircraftC.position().columnIndex())));
                //System.out.println(aircraftC.sunk());
            }

            System.out.println("\nBattleship(should all be true except last one)");
            for(int i = 0; i <= battleship.size(); i++){
                System.out.print("Position: " + new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex()) + ": ");
                System.out.println(ocean.sunk(new Position(battleship.position().rowIndex() + i, battleship.position().columnIndex())));
            }

            System.out.println("\nCruiser(should all be true except last one)");
            for(int i = 0; i <= cruiser.size(); i++){
                System.out.print("Position: " + new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex()) + ": ");
                System.out.println(ocean.sunk(new Position(cruiser.position().rowIndex() + i, cruiser.position().columnIndex())));
            }

            System.out.println("\nDestroyer(should all be true except last one)");
            for(int i = 0; i <= destroyer.size(); i++){
                System.out.print("Position: " + new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i) + ": ");
                System.out.println(ocean.sunk(new Position(destroyer.position().rowIndex(), destroyer.position().columnIndex() + i)));
            }

            System.out.println("\nSubmarine(should all be true except last one)");
            for(int i = 0; i <= sub.size(); i++){
                System.out.print("Position: " + new Position(sub.position().rowIndex(), sub.position().columnIndex() + i) + ": ");
                System.out.println(ocean.sunk(new Position(sub.position().rowIndex(), sub.position().columnIndex() + i)));
            }


            System.out.println("\nAll boats are sunk?(should be true): " + ocean.allSunk());


        } catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
