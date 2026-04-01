package strings;

public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "aa"; //a  2 b 0
        String magazine = "aab"; // a 2 b 1

        System.out.println(ransomNote(ransomNote,magazine));

        //return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
    }

    //store all ransom note characters in character array
    //minus all the magazine characters from the ransom array , all index values should be less than 0

    public static boolean ransomNote(String ransomNote, String magazine) {

        int char_count[] = new int[126];

        for (int i = 0; i < magazine.length(); i++) {

            char_count[magazine.charAt(i)]++;

        }

        for (int i = 0; i < ransomNote.length(); i++) {

            char_count[ransomNote.charAt(i)]--;

            if (char_count[ransomNote.charAt(i)] < 0) {

                return false;
            }

        }

        return true;
    }
}

