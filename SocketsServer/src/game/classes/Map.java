package game.classes;

public class Map {
    private int sizeX;
    private int sizeY;
    private Terrain[][] terrain;

    public Map(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public Terrain[][] getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain[][] terrain) {
        this.terrain = terrain;
    }
}
