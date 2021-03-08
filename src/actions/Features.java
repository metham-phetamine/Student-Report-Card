package actions;

import records.*;
import sortAndSearch.*;

import java.util.Scanner;

public class Features implements iFeatures {
    private static final StudentRecord records = new StudentRecord();

    /**
     * 3 inputs name, id, marks input take from the user and call the
     * add method from studentRecord Class. and that class have a arraylist defined
     * and these inputs get added into the arrayList.
     */
    @Override
    public void creatingReportCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYou are adding student report to the record.");
        System.out.print("Enter Student name: ");
        String name = scanner.next();

        System.out.print("Enter student ID: ");
        String id = scanner.next();

        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        records.addRecord(name, id, marks);
        System.out.println("Added!!\n");
    }

    /**
     * call the quickSort method from sortByName class and sent the arraylist
     * and that arrayList get sorted alphabetically by quicksort approach.
     * then a for loop just printed the name, id , marks to show that list is sorted.
     */
    @Override
    public void sortByName() {
        int studentListSize = records.getList().size();
        new SortByName().quickSort(records.getList(), 0, studentListSize - 1);

        System.out.println();
        for (int i = 0; i < records.getList().size(); i++) {
            System.out.print(records.getList().get(i).getName());
            System.out.print("\t" + records.getList().get(i).getId());
            System.out.println("\t" + records.getList().get(i).getMarks());
        }
        System.out.println();
    }

    /**
     * same as sortAsMarks. just sorted according student marks.
     */
    @Override
    public void sortByMarks() {
        int studentListSize = records.getList().size();
        new SortByMarks().quickSort(records.getList(), 0, studentListSize - 1);

        System.out.println();
        for (int i = 0; i < records.getList().size(); i++) {
            System.out.print(records.getList().get(i).getMarks());
            System.out.print("\t" + records.getList().get(i).getName());
            System.out.println("\t" + records.getList().get(i).getId());
        }
        System.out.println();
    }

    /**
     * here this method first call the quicksort method and that method sort the
     * arrayList and then binary Search method called and that method find out the
     * student information user in looking for.
     */
    @Override
    public void displaySpecificRecord() {
        int studentListSize = records.getList().size();
        new SortByName().quickSort(records.getList(), 0, studentListSize - 1);

        System.out.print("\nWhich student record are u looking for: ");
        new BinarySearch().search(records.getList(), new Scanner(System.in).next());
        System.out.println();
    }

    /**
     * here simple linear search have been used. though binary search can be used too.
     * a loop just traverse through the elements of the arraylist and get the student marks
     * and then again another method checkingMethod also called that decides the student grade
     * based on the student marks.
     */
    @Override
    public void displayStudentGrade() {
        System.out.println("\nStudent grades are being shown.");
        for(int i = 0; i<records.getList().size(); i++){
            System.out.println(records.getList().get(i).getName());
            System.out.println("\t" + checkingGrade(records.getList().get(i).getMarks()));
        }
        System.out.println();
    }

    private String checkingGrade(int marks){
        String grade = "Bad Grade";
        if(marks > 580)
            grade = "A+";
        else if (marks > 560)
            grade = "A";
        else if(marks > 540)
            grade = "B+";
        else if(marks > 530)
            grade = "B";
        else if(marks > 500)
            grade = "C";

        return grade;
    }

    /**
     * here linear search used as well. just traverse the list with loop and
     * find the particular name/element user is looking for and change the value
     * with another value.
     */
    @Override
    public void modifyRecord() {
        System.out.print("\nWhich student record you want to change: ");
        String name = new Scanner(System.in).next();
        
        for(int i = 0; i < records.getList().size(); i++){
            if(records.getList().get(i).getName().equalsIgnoreCase(name)){
                System.out.print("Enter new marks: ");
                int newMarks = new Scanner(System.in).nextInt();

                records.getList().get(i).setMarks(newMarks);
            }
        }
        System.out.println();
    }

    /**
     * it is easy to remove a element from a arraylist. and just .remove
     * method call do the job.
     */
    @Override
    public void deleteRecord() {
        records.getList().remove(records.getList().size()-1);
        System.out.println("Deleted!!\n");
    }
}
