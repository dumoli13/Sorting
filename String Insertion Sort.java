package sorting;

import java.util.Arrays;

public class StringSorting {

    public static String insertionSort(String[] str){
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        String value = "";
        for(String temp : str){
            value += temp;
        }
        return value;
    }
        
    public static void main(String[] args) {
        String _str = "kartupesertainiwajibdibawa";
        String[] str = _str.split("");
        
        System.out.println(insertionSort(str));
    }
    
}
