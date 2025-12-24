public class Cube {
    int side;
    Cube() {
        this.side = 1;
    }
    Cube(int side) {
        setSide(side);
    }
    int getSide(){
        return side;

    }
    void setSide(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;

    }
    int calculateSurfaceArea(){
        return side * side * 6;
    }
    int calculateVolume(){
        return side * side * side;
    }
    public String toString() {
        return "Cube{side=" + side + "}";
    }

}
