package records;

public class StudentInfo {
    private final String name;
    private final String ID;          //id could be (int) but id has hyphens in it.
    private int marks;

    public StudentInfo(String name, String ID, int marks) {
        this.name = name;
        this.ID = ID;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return ID;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
}
