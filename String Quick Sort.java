package sorting;

import java.util.Arrays;

public class StringSorting {
    
    public static String[] quickSort(String[] value, int start, int end){
        if (start<end || end>start) {
            String pivot = value[start];
            int i = start+1;
            
            for(int j = start+1; j<=end; j++){
                if(pivot.compareTo(value[j]) > 0){
                    String temp = value[j];
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
        String _str = "kartupesertainiwajibdibawa";
        String[] str = _str.split("");
        
        String value2 = "";
        for(String s : quickSort(str, 0, str.length-1)){
            value2 += s;
        }
        System.out.println(value2);
                
    }
    
}
