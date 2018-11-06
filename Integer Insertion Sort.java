package sorting;

import java.util.Arrays;

public class IntegerSorting {
    
    public static int[] insertionSort(int[] value){
        for(int i=0;i<value.length-1;i++){
            for(int j=i+1;j<value.length;j++){
                if(value[i]>value[j]){
                    int temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }
        
        return value;
    }
    
    public static void main(String[] args) {
        int[] value = {2492, 1776, 1941, 1945, 1963, 1918, 2001, 1783, 1865, 1804};
        System.out.println(Arrays.toString(insertionSort(value)));
    }
    
}
