package sorting;

import java.util.Arrays;

public class IntegerSorting {
    
    public static int[] quickSort(int[] value, int start, int end){
        if (start<end || end>start) {
            int pivot = value[start];
            int i = start+1;
            
            for(int j = start+1; j<=end; j++){
                if(pivot > value[j]){
                    int temp = value[j];
                    value[j] = value[i];
                    value[i] = temp;
                    
                    i++;
                }
            }
            
            value[start] = value[i-1];
            value[i-1] = pivot;
            
            quickSort(value, start, i-2);
            quickSort(value, i, end);
        }
      
        return value;
    }
    
    public static void main(String[] args) {
        int[] value = {2492, 1776, 1941, 1945, 1963, 1918, 2001, 1783, 1865, 1804};
        System.out.println(Arrays.toString(quickSort(value, 0, value.length-1)));
    
}
