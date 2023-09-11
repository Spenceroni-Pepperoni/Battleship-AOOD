package src.main.java.Battleship_AOOD;

import  src.main.java.Battleship_AOOD.Position;

/**
 * Boat class for Battleship Game
 *
 * @Author Spencer McGrath
 */
public class Boat {
    int size;
    boolean[] hits;
    String boatType;
    Position pos;
    Position[] boatPos;
    String orientation;

    /**
     * Public constructor for Boat class
     * @param boatType Type of boat ie Battleship or Submarine
     * @param pos Starting position of the boat
     * @param orientation Orientation of the boat ie vertical
     */
    public Boat(String boatType,Position pos, String orientation){
        this.boatType = boatType;
        this.pos = pos;
        this.orientation = orientation;
        hits = new boolean[size()];
        size = size();
    }

    /**
     * @return Returns the first letter of the Boat type
     */
    public char abbreviation(){
        return boatType.charAt(0);
    }

    /**
     * @return Returns boat type
     */
    public String name(){
        return boatType;
    }

    /**
     * @return Returns the size of the boat
     */
    public int size(){
        return switch (boatType) {
            case "Aircraft Carrier" -> 5;
            case "Battleship" -> 4;
            case "Cruiser", "Submarine" -> 3;
            default -> 2;
        };
    }

    /**
     * Checks of targetPos is on the boat
     * @param targetPos Position to check if it is on the boat
     * @return Returns if Position is on the boat
     */
    public boolean onBoat(Position targetPos){
        for(int i = 0; i<size; i++){
            if(orientation.equals("vertical")){
                if(targetPos.getCol() == pos.getCol()+i){
                    return true;
                }
            }else{
                if(targetPos.getRow() == pos.getRow()+i){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if targetPos has been hit before
     * @param targetPos Position to check if it has been hit
     * @return Returns if the position has been hit
     */
    public boolean isHit(Position targetPos){
        for(int i = 0; i<size; i++){
            if(orientation.equals("vertical")){
                if(targetPos.getCol() == pos.getCol()+i){
                    return hits[i];
                }
            }else{
                if(targetPos.getRow() == pos.getRow()+i){
                    return hits[i];
                }
            }
        }
        return false;
    }

    /**
     * Method that handles hits on the boats
     * @param targetPos Position to check if it has been hit
     */
    public void hit(Position targetPos){
        for(int i = 0; i<size; i++){
            if(orientation.equals("vertical")){
                if(targetPos.getCol() == pos.getCol()+i){
                    hits[i]=true;
                }
            }else{
                if(targetPos.getRow() == pos.getRow()+i){
                    hits[i]=true;
                }
            }
        }
    }

    /**
     * @return Returns if the boat has been sunk
     */
    public boolean sunk(){
        for (boolean hit : hits) {
            if (!hit) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return Returns the boat position
     */
    public Position position(){
        return pos;
    }

    /**
     * @return Returns the orientation of the boat
     */
    public String direction(){
        return orientation;
    }

    public Position[] generateAllPositions(){
        
        
        return null;
    }


}
