package practice1;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {


    @Override
    public int compare(String str1, String str2) {
        int firstSum = 0;
        int secondSum = 0;
        int maxLength = Math.max(str1.length(), str2.length());
        for(int i = 0; i < maxLength; i++) {
            if(i < str1.length()){
                Boolean digit1 = Character.isDigit(str1.charAt(i));
                if (digit1) {
                    firstSum += Character.digit(str1.charAt(i), 10);
                }
            }
            if(i < str2.length()) {
                Boolean digit2 = Character.isDigit(str2.charAt(i));

                if (digit2) {
                    secondSum += Character.digit(str2.charAt(i), 10);
                }
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
        System.out.println(test.compare("1a8fs2b12", "kd2fsj3dfos4dfh7"));
    }
}

