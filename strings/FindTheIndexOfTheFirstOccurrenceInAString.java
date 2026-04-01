package strings.substringSearch;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        String haystack = "bussadbutsad";

        String needle = "sad";  //output 0

        //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
        //or -1 if needle is not part of haystack.

        System.out.println(solution(haystack, needle));

    }

    public static int solution(String haystack, String needle) {

        int i = 0;
        int j = needle.length();

        while
        (i <= haystack.length() && j <= haystack.length()) {

            if (haystack.substring(i, j).equals(needle)) {

                return i;
            }

            i++;
            j++;

        }
        return -1;
    }


}
