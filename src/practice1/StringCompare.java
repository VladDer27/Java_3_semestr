package practice1;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {


    @Override
    public int compare(String str1, String str2) {
        int firstSum = 0;
        int secondSum = 0;
        for(int i = 0; i < str1.length(); i++) {
            Boolean digit = Character.isDigit(str1.charAt(i));
            if (digit) {
                firstSum += Character.digit(str1.charAt(i), 10);
            }
        }
        for(int i = 0; i < str2.length(); i++){
            Boolean digit = Character.isDigit(str2.charAt(i));
            if(digit){
                secondSum += Character.digit(str2.charAt(i),10);
            }
        }
        if(firstSum > secondSum) {
            return 1;
        }
        else if(firstSum < secondSum){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        StringCompare test = new StringCompare();
        System.out.println(test.compare("1a2b12", "bcd7"));
    }
}

