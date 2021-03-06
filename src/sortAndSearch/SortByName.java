package sortAndSearch;

import records.StudentInfo;

import java.util.ArrayList;

/**
 * typical quickSorting approach. but here instead of using array,
 * arraylist has been used though implementation is same.
 * sorted alphabetically.
 */
public class SortByName {

    public void quickSort(ArrayList<StudentInfo> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);

            quickSort(list, low, pi - 1);

            quickSort(list, pi + 1, high);
        }
    }

    private int partition(ArrayList<StudentInfo> list, int low, int high) {
        StudentInfo pivot = list.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (list.get(j).getName().toLowerCase().compareTo(pivot.getName().toLowerCase()) <= 0) {  //converted to lowercase and used compareTo to compare.
                i++;

                StudentInfo temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        StudentInfo temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return (i + 1);
    }
}
