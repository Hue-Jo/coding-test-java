import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] charArray = a.toCharArray(); // 문자열을 문자 배열로 변환
        for(int i = 0; i < charArray.length; i++){
            if(Character.isLowerCase(charArray[i])){
            charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }   
        }
        String result = new String(charArray); // 문자 배열을 다시 문자열로 변환
        System.out.println(result);        
        
    }
}