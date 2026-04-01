package strings.frequencyCounting;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "loveleetcode";

        System.out.println(firstNonRepeatingCharacter(str));

        //2 ->output

    }

    public static int firstNonRepeatingCharacter(String str) {

        int char_count[] = new int[256];

        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            char_count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {

            if (char_count[str.charAt(i)] == 1) {

                index = i;
                break;
            }
        }
        return index;
    }
    //✔ Time: O(n)
//✔ Space: O(1)
}
