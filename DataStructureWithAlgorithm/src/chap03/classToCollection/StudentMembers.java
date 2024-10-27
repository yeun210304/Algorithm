package chap03.classToCollection;

public class StudentMembers {
    private String name;
    private int number;

    public StudentMembers() { }

    public StudentMembers(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "number : " + this.number + ", name : " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name  = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
