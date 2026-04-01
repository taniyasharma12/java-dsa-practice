package maps;

public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "aa";

        String magazine = "aaab";

        System.out.println(canConstruct(ransomNote,magazine));

        /*
        Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the
        letters from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.
         */
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        //create a char count array and store all character counts of magazine
        //now reduce count of all characters from array present in ransomNote
        //if any char count is less than 0 it means that character is not present in ransomNote

        int[] char_count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {

            char_count[magazine.charAt(i)-'a']++;


        }

        for (int i = 0; i < ransomNote.length(); i++) {

            char_count[ransomNote.charAt(i)-'a']--;
        }

        for (int i = 0; i < 26; i++) {

             if(char_count[i]<0) {

               return false;
            }
        }
return true;

    }
}
