package Battleship_AOOD;

public class Ocean {
    Position[][] oceanTiles;
    Boat[] boats;
    public Ocean(){
        oceanTiles = new Position[10][10];
        boats = new Boat[5];
    }

    public void placeBoat(String boatName, String orientation, Position pos) throws Exception{
        boolean isOnBoard;
        int size = switch (boatName) {
            case "Aircraft Carrier" -> 5;
            case "Battleship" -> 4;
            case "Cruiser","Submarine" -> 3;
            case "Destroyer" -> 2;
            default -> 0;
        };

        for(int i = 0; i <size; i++){
            if(orientation.equals("vertical")){
                if(!((oceanTiles.length >= pos.getRowIndex()+i) && (oceanTiles.length >= pos.getColIndex()))){
                    throw new Exception("Boat is off the map in the vertical direction");
                }
            }else{
                if((oceanTiles[0].length >= pos.getRowIndex()) && (oceanTiles[0].length >= pos.getColIndex()+i)){
                    throw new Exception("Boat is off the map in the horizontal direction");   
                }
            }
        }

        for(int i = 0; i <size; i++){
            if(orientation.equals("vertical")){
                if((oceanTiles[pos.getRowIndex()+i][pos.getColIndex()] == null)){
                    oceanTiles[pos.getRowIndex()+i][pos.getColIndex()] = new Position(pos.getRowIndex() + i, pos.getColIndex());
                }else{
                    throw new Exception("Boat is overlapping with another boat");
                }
            }else{
                if((oceanTiles[pos.getRowIndex()][pos.getColIndex()+i] == null)){
                    oceanTiles[pos.getRowIndex()][pos.getColIndex()+i] = new Position(pos.getRowIndex(), pos.getColIndex() + i);
                }else{
                    throw new Exception("Boat is overlapping with another boat");
                }
            }
        }

        for(int i = 0; i < boats.length; i++){
            if(boats[i] == null){
                boats[i] = new Boat(boatName, pos, orientation);
            }
        }
        
    }

    public void shootAt(Position pos){
        if((oceanTiles[pos.getRowIndex()][pos.getColIndex()] != null)&&(pos.equals(oceanTiles[pos.getRowIndex()][pos.getColIndex()]))){
            findBoat(pos).hit(pos);
        }
    }

    public boolean hit(Position pos){
        if((oceanTiles[pos.getRowIndex()][pos.getColIndex()] != null)&&(pos.equals(oceanTiles[pos.getRowIndex()][pos.getColIndex()]))){
            return findBoat(pos).isHit(pos);
        }
        return false;
    }

    public char boatInitial(Position pos){
        return findBoat(pos).abbreviation();
    }

    public String boatName(Position pos){
        return findBoat(pos).name();
    }

    public boolean sunk(Position pos){
        return findBoat(pos).sunk();
    }

    public boolean allSunk(){
        for (Boat boat : boats) {
            if (!boat.sunk()) {
                return false;
            }
        }
        return true;
    }


    private Boat findBoat(Position pos){
        for(Boat b : boats){
            if(b.onBoat(pos)) return b;
        }
        return null;
    }

}
