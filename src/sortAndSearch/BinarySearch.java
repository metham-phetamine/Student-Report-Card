package sortAndSearch;

import records.StudentInfo;

import java.util.ArrayList;

public class BinarySearch {

    public void search(ArrayList<StudentInfo>list, String name){
        int start = 0;
        int end = list.size() - 1;
        int mid;

        while(start <= end){
            mid = (start + end) / 2;

            if(list.get(mid).getName().toLowerCase().compareTo(name.toLowerCase()) == 0){
                System.out.println("ID: " + list.get(mid).getId());
                System.out.println("Marks: " + list.get(mid).getMarks());

                return;
            }

            else if(list.get(mid).getName().toLowerCase().compareTo(name.toLowerCase()) < 0){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        System.out.println("Record Not Found!!");
    }
}
