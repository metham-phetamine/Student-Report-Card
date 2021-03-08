package records;

import java.util.ArrayList;

public class StudentRecord {
    private final ArrayList<StudentInfo> studentList = new ArrayList<>();

    /**
     * There is a arraylist top declared of type StudentInfo and this constructor
     * add some elements in that.It could be done in a method rather in constructor
     * but as this a preSaved records and needs to execute along with the class execution it's
     * done in the constructor.
     */
    public StudentRecord() {
        studentList.add(new StudentInfo("Mahadi", "193-15-13519", 562));
        studentList.add(new StudentInfo("Arafat", "193-15-13512", 550));
        studentList.add(new StudentInfo("Sazid", "193-15-13475", 575));
        studentList.add(new StudentInfo("Nayeem", "193-15-13519", 523));
        studentList.add(new StudentInfo("Topu", "193-15-13249", 583));
    }

    public ArrayList<StudentInfo> getList() {
        return studentList;
    }

    /**
     * just add a new element into the arraylist when called.
     * @param name name of the student
     * @param ID id of the student
     * @param marks of the student
     */
    public void addRecord(String name, String ID, int marks) {
        studentList.add(new StudentInfo(name, ID, marks));
    }
}
