package chap03.classToCollection;

public class StudentMembers {
    private int number;
    private String name;
    
    public StudentMembers() { }

    public StudentMembers(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return "number : " + this.number + ", name : " + this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name  = name;
    }
}
