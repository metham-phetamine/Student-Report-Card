package records;

import java.util.ArrayList;

public class StudentRecord {
    private final ArrayList<StudentInfo> studentList = new ArrayList<>();

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

    public void addRecord(String name, String ID, int marks) {
        studentList.add(new StudentInfo(name, ID, marks));
    }
}
