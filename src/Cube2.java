public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side, String color) {
        this();
        basicCube.setSide(side);
        this.color = color;
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public void setSide(int side){
        basicCube.setSide(side);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setColor(String color){
        this.color = color;
    }



    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return getSide() * getSide()* getSide();}
    public int calculateSurfaceArea() { return getSide() * getSide() * 6;}
    public Cube2 add(Cube2 other) {
        if (!isPythagoreanTriple(this.getSide(), other.getSide(), calculateNewSide(this.calculateSurfaceArea(), other.calculateSurfaceArea()))) {
            throw new IllegalArgumentException("The side lengths do not form a Pythagorean triple.");
        }

        int newSide = calculateNewSide(this.calculateSurfaceArea(), other.calculateSurfaceArea());
        return new Cube2(newSide, this.color);
    }

    public Cube2 minus(Cube2 other) {
        int newSide = this.calculateSurfaceArea() - other.calculateSurfaceArea();
        if (!isPythagoreanTriple(this.getSide(), other.getSide(), newSide)) {
            throw new IllegalArgumentException("The side lengths do not form a Pythagorean triple.");
        }

        return new Cube2(newSide, this.color);
    }

    private int calculateNewSide(int surfaceArea1, int surfaceArea2) {
        int combinedSurfaceArea = surfaceArea1 + surfaceArea2;
        return (int) Math.sqrt(combinedSurfaceArea / 6);
    }

    private boolean isPythagoreanTriple(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
    public boolean equals(Cube2 otherCube) {
        if (this == otherCube) return true;
        if (!(otherCube instanceof Cube2)) return false;
        Cube2 other = (Cube2) otherCube;
        return this.basicCube.getSide() == other.basicCube.getSide() &&
                this.color.equals(other.color);
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=" + '"' + color + '"' + "}";
    }
}
