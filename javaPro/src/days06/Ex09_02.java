package days06;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 4:48:36
 * @subject 
 * @content
 */
public class Ex09_02 {

   public static void main(String[] args) {
      String name = "admin";
      char ch;
      // char name.charAt(int index)
      // 5:01 수업 시작~
      // String -> char[] 변환

//      char [] nameArr = new char[name.length()];
//      
//      for (int i = 0; i < name.length(); i++) {
//         ch = name.charAt(i);
//         nameArr[i] = ch;
//         System.out.printf("%s -> %d -> '%c'\n", name, i,  ch);
//      } // for i
//      
//      System.out.println( Arrays.toString(nameArr ));
      
      char[] nameArr = name.toCharArray();
      System.out.println(new String(nameArr));
      System.out.println(String.valueOf(nameArr));
      // char[] -> String 변환
      
      /*
      char ch = name.charAt(0);
      System.out.printf("%s -> '%c'\n", name, ch);
      
      ch = name.charAt(1);
      System.out.printf("%s -> '%c'\n", name, ch);
      
      ch = name.charAt(2);
      System.out.printf("%s -> '%c'\n", name, ch);
      
      ch = name.charAt(3);
      System.out.printf("%s -> '%c'\n", name, ch);
      
      ch = name.charAt(4);
      System.out.printf("%s -> '%c'\n", name, ch);
      */
      

   } // main

} // class
