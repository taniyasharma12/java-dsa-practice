package strings;

public class DuplicatesCharactersInAString {

    public static void main(String[] args) {

        String str = "beautiful sea";

        System.out.println(duplicates(str));

    }

    public static String duplicates(String str) {

        int char_count[] = new int[256];
        boolean added[] = new boolean[256];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char_count[str.charAt(i)]++;
            added[i]=true;
        }

        for (int i = 0; i < str.length(); i++) {

            if (char_count[str.charAt(i)] > 1 && !added[str.charAt(i)]) {

                result.append(str.charAt(i));
                added[str.charAt(i)]=true;

            }

        }
        return result.toString();

    }
}
