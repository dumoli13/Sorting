package sorting;

import java.util.Arrays;

public class StringSorting {
   
    public static String[] mergeSort(String[] str){
        if(str.length>1){
            int half = str.length/2;
            String[] left = Arrays.copyOfRange(str, 0, half);
            String[] right = Arrays.copyOfRange(str, half, str.length);
            
            mergeSort(left);
            mergeSort(right);
            
            merge(str, left, right);
        }
        
        return str;
    }
    
    static void merge(String[] str, String[] left, String[] right){
        int totalLength = left.length + right.length;
        int i=0, li=0, ri=0;
        
        while(i<totalLength){
            if(li<left.length && ri<right.length){
                if(left[li].compareTo(right[ri])<=0){
                    str[i] = left[li];
                    i++;
                    li++;
                }
                else{
                    str[i] = right[ri];
                    i++;
                    ri++;
                }
            }
            else{
                if(li >= left.length){
                    while(ri<right.length){
                        str[i] = right[ri];
                        i++;
                        ri++;
                    }
                }
                if(ri >= right.length){
                    while(li<left.length){
                        str[i] = left[li];
                        i++;
                        li++;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String _str = "kartupesertainiwajibdibawa";
        String[] str = _str.split("");
                
        String value = "";
        for(String s : mergeSort(str)){
            value += s;
        }
        System.out.println(value);
        
    }
    
}
