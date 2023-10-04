//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package Battleship_AOOD;

public class GoodOcean {
    private Boat[] myboats = new Boat[5];
    private int[][] grid = new int[10][10];
    private int boatsplaced = 0;

    GoodOcean() {
        for(int pos = 0; pos < 10; ++pos) {
            for(int pos2 = 0; pos2 < 10; ++pos2) {
                this.grid[pos][pos2] = -1;
            }
        }

    }

    public void placeBoat(String boatName, String direction, Position pos) throws Exception {
        Boat myboat = new Boat(boatName, pos, direction);
        if (pos.rowIndex() >= 0 && pos.columnIndex() >= 0) {
            int pos1;
            if (direction.equalsIgnoreCase("vertical")) {
                if (myboat.size() + pos.rowIndex() > 10) {
                    throw new Exception("out of grid");
                }

                for(pos1 = pos.rowIndex(); pos1 < myboat.size() + pos.rowIndex(); ++pos1) {
                    if (this.grid[pos1][pos.columnIndex()] != -1) {
                        throw new Exception("overlapping");
                    }
                }

                for(pos1 = pos.rowIndex(); pos1 < myboat.size() + pos.rowIndex(); ++pos1) {
                    this.grid[pos1][pos.columnIndex()] = this.boatsplaced;
                }
            } else {
                if (myboat.size() + pos.columnIndex() > 10) {
                    throw new Exception("out of grid");
                }

                for(pos1 = pos.columnIndex(); pos1 < myboat.size() + pos.columnIndex(); ++pos1) {
                    if (this.grid[pos.rowIndex()][pos1] != -1) {
                        throw new Exception("overlapping");
                    }
                }

                for(pos1 = pos.columnIndex(); pos1 < myboat.size() + pos.columnIndex(); ++pos1) {
                    this.grid[pos.rowIndex()][pos1] = this.boatsplaced;
                }
            }

            this.myboats[this.boatsplaced] = myboat;
            ++this.boatsplaced;
        } else {
            throw new Exception("out of grid");
        }
    }

    public void shootAt(Position pos) {
        if (this.grid[pos.rowIndex()][pos.columnIndex()] != -1) {
            this.myboats[this.grid[pos.rowIndex()][pos.columnIndex()]].hit(pos);
        }

    }

    public boolean hit(Position pos) {
        return this.grid[pos.rowIndex()][pos.columnIndex()] != -1 ? this.myboats[this.grid[pos.rowIndex()][pos.columnIndex()]].isHit(pos) : false;
    }

    public char boatInitial(Position pos) {
        return this.grid[pos.rowIndex()][pos.columnIndex()] != -1 ? this.myboats[this.grid[pos.rowIndex()][pos.columnIndex()]].abbreviation() : ' ';
    }

    public String boatName(Position pos) {
        return this.grid[pos.rowIndex()][pos.columnIndex()] != -1 ? this.myboats[this.grid[pos.rowIndex()][pos.columnIndex()]].name() : "";
    }

    public boolean sunk(Position pos) {
        return this.grid[pos.rowIndex()][pos.columnIndex()] != -1 ? this.myboats[this.grid[pos.rowIndex()][pos.columnIndex()]].sunk() : false;
    }

    public boolean allSunk() {
        for(int pos = 0; pos < this.boatsplaced; ++pos) {
            if (!this.myboats[pos].sunk()) {
                return false;
            }
        }

        return true;
    }
}
