package actions;

import records.*;
import sortAndSearch.*;

import java.util.Scanner;

public class Features implements iFeatures {
    private static final StudentRecord records = new StudentRecord();

    @Override
    public void creatingReportCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are adding student report to the record.");
        System.out.print("Enter Student name: ");
        String name = scanner.next();

        System.out.print("Enter student ID: ");
        String id = scanner.next();

        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        records.addRecord(name, id, marks);
    }

    @Override
    public void sortByName() {
        int studentListSize = records.getList().size();
        new SortByName().quickSort(records.getList(), 0, studentListSize - 1);

        for (int i = 0; i < records.getList().size(); i++) {
            System.out.print(records.getList().get(i).getName());
            System.out.print("\t" + records.getList().get(i).getId());
            System.out.println("\t" + records.getList().get(i).getMarks());
        }
    }

    @Override
    public void sortByMarks() {
        int studentListSize = records.getList().size();
        new SortByMarks().quickSort(records.getList(), 0, studentListSize - 1);

        for (int i = 0; i < records.getList().size(); i++) {
            System.out.print(records.getList().get(i).getMarks());
            System.out.print("\t" + records.getList().get(i).getName());
            System.out.println("\t" + records.getList().get(i).getId());
        }
    }

    @Override
    public void displaySpecificRecord() {
        int studentListSize = records.getList().size();
        new SortByName().quickSort(records.getList(), 0, studentListSize - 1);

        System.out.print("Which student record are u looking for: ");
        new BinarySearch().search(records.getList(), new Scanner(System.in).next());
    }

    @Override
    public void displayStudentGrade() {
        System.out.println("Student grades are being shown.");
        for(int i = 0; i<records.getList().size(); i++){
            System.out.println(records.getList().get(i).getName());
            System.out.println("\t" + checkingGrade(records.getList().get(i).getMarks()));
        }
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

    @Override
    public void modifyRecord() {
        System.out.print("Which student record you want to change: ");
        String name = new Scanner(System.in).next();
        
        for(int i = 0; i < records.getList().size(); i++){
            if(records.getList().get(i).getName().equalsIgnoreCase(name)){
                System.out.print("Enter new marks: ");
                int newMarks = new Scanner(System.in).nextInt();

                records.getList().get(i).setMarks(newMarks);
            }
        }
    }

    @Override
    public void deleteRecord() {
        records.getList().remove(records.getList().size()-1);
    }
}
