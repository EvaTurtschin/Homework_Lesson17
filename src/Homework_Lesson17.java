import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework_Lesson17 {
    public static void main(String[] args) {

        /* Task1
       Задача про анаграммы - см. код занятия practice -> Practice
         */

        System.out.println("This is anagrams " + anagram("abcd", "abcdghj"));

        /* Task 2
       Написать метод, принимающий строку и целое число(индекс)
       и возвращающий строку без символа, находящегося по этому индексу.
Пример:
int index = 3
String str = "Hello"
public static String removeCharAtIndex( String str, int index) -> "Helo"
         */

        int index = 0;
        String string = "Hello";
        System.out.println(removeCharAtIndex(string,index));

    }
    public static boolean anagram (String string3,String string4)
    {
        //("abht", "dbac")
        boolean resultAnagram = false;
        char [] st3 = string3.toCharArray();
        char [] st4 = string4.toCharArray();

        Arrays.sort(st3);
        Arrays.sort(st4);

        resultAnagram = Arrays.toString(st3).equals(Arrays.toString(st4));

        return resultAnagram;
    }

    public static String removeCharAtIndex( String string, int index)
    {
        return string.substring(0,index).concat(string.substring(index+1));
    }
}
