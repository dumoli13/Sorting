package sorting;

import java.util.Arrays;

public class IntegerSorting {
        
    public static int[] mergeSort(int[] value){
        if(value.length>1){
            int half = value.length/2;
            int[] leftArray = Arrays.copyOfRange(value, 0, half);
            int[] rightArray = Arrays.copyOfRange(value, half, value.length);
            
            mergeSort(leftArray);
            mergeSort(rightArray);
            
            merge(value, leftArray, rightArray);
        }
        return value;
    }
    
    static void merge(int[] value, int[] leftArray, int[] rightArray){
        int totalLength = value.length;
        int i=0, li=0, ri=0;
        
        while(i<totalLength){
            if(li<leftArray.length && ri<rightArray.length){
                if(leftArray[li]<=rightArray[ri]){
                    value[i] = leftArray[li];
                    i++;
                    li++;
                }
                else{
                    value[i] = rightArray[ri];
                    i++;
                    ri++;
                }
            }
            else{
                if(li >= leftArray.length){
                    while(ri<rightArray.length){
                        value[i] = rightArray[ri];
                        i++;
                        ri++;
                    }
                }
                if(ri >= rightArray.length){
                    while(li<leftArray.length){
                        value[i] = leftArray[li];
                        i++;
                        li++;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] value = {2492, 1776, 1941, 1945, 1963, 1918, 2001, 1783, 1865, 1804};
        System.out.println(Arrays.toString(mergeSort(value)));
    }
    
}
