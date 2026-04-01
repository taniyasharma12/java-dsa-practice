package maps;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonCharacter {

    public static void main(String[] args) {

        String str1 = "and";
        String str2 = "brt";

        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {


        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str1.length(); i++) {

            set.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {

            if (set.contains(str2.charAt(i))) {

                return "YES";
            }
        }

        return "NO";
    }
}
