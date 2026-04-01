package strings.reversePatterns;

public class ReversePreservingSpaces {

    public static void main(String[] args) {

        String str = "i love coding"; //"g nidoc evoli"

        System.out.println(reversePreservingSpaces(str));

    }

    public static String reversePreservingSpaces(String str) {

        char ch[] = str.toCharArray();

        int i=0;
        int j=str.length()-1;

        while (i<j){

            if(ch[i]==' '){

                i++;
            } else if (ch[j]==' ') {
                j--;
            }
            else{

                char temp = ch[i];
                ch[i]= ch[j];
                ch[j]= temp;
                i++;
                j--;



            }


        }

        return new String(ch);
    }
}
