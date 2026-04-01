package strings;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        String str = "loveleetcodeddddd";

        System.out.println(mostFrequentCharacter(str));
    }

    public static char mostFrequentCharacter(String str) {

        int char_count[] = new int[256];

        int max = 0;

        char ch = 0;

        for(int i=0; i<str.length(); i++) {

            char_count[str.charAt(i)]++;
        }

        for(int i=0; i<str.length(); i++) {

            if(char_count[str.charAt(i)]>max) {

                max = char_count[str.charAt(i)];
                ch = str.charAt(i);

            }

        }
        return ch;
    }
}
