package Arrays;

import java.util.ArrayList;

public class SearchInArray {
    
    public static void main(String[] args) {
        int[] arr = { 23, 4, 34, 5, 2312, 4, 34234 };
        // System.out.println(searchInArray(arr, 1));
        // findAllIndices2(arr, 4, 0,list);
        
        
        System.out.println(findAllIndices3(arr, 4, 0));
        // System.out.println(list);
        
    }
    
    // -----------------------------------------------
    static int searchInArray(int[] arr, int x) {
        return helper(arr, x, 0);
    }
    
    static int helper(int[] arr, int x, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == x) {
            return index;
        } else {
            return helper(arr, x, index + 1);
        }
    }
    // -----------------------------------------------
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndices1(int[] arr, int x, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == x) {
            list.add(index);

        }
        findAllIndices1(arr, x, index + 1);
    }
    static ArrayList<Integer> findAllIndices2(int[] arr, int x, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == x) {
            list.add(index);

        }
        return findAllIndices2(arr, x, index + 1,list);
    }

    // 3rd way: returning list, but not taking it in parameter body
    static ArrayList<Integer> findAllIndices3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);

        }   
        ArrayList<Integer> ansFromBelowCalls = findAllIndices3(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
