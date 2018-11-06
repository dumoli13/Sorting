package sorting;

import java.util.Arrays;

public class IntegerSorting {
        
    public static int[] heapSort(int[] value){
        int size = value.length-1;
        for(int i=size/2; i>=0; i--){
            maxHeapify(value, size, i);
        }
        return value;
    }
    
    static void maxHeapify(int[] value, int n, int i){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int smallest = 0;
        if(left <= n && value[left] < value [i]) smallest = left;
        else smallest = i;
        
        if(right <= n && value[right] < value [smallest]) smallest = right;
        
        if(smallest != i){
            int temp = value[i];
            value[i] = value[smallest];
            value[smallest] = temp;
            maxHeapify(value, n, smallest);
        }
    }
    
    public static void main(String[] args) {
        int[] value = {2492, 1776, 1941, 1945, 1963, 1918, 2001, 1783, 1865, 1804};
        System.out.println(Arrays.toString(heapSort(value)));
    }
    
}
