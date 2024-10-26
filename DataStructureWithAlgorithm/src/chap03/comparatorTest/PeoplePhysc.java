package chap03.comparatorTest;

public class PeoplePhysc {
    private String name;
    private int height;
    private double vision;

    public PeoplePhysc() { }

    public PeoplePhysc(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public String toString() {
        return name + " " + height + " " + vision;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    
    public void setVision(double vision) {
        this.vision = vision;
    }

    public double getVision() {
        return vision;
    }
}
