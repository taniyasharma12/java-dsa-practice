package strings.substringSearch;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String strs[] = {"flower", "flow", "flight"}; //sorted string -> flight flow flower
        //output fl
        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String strs[]) {

        //sort the entire array
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index =0;

        while (index<first.length() && index< last.length()){

            if(first.charAt(index)==last.charAt(index)){
                index++;
            }
            else {

                break;
            }


        }


        return first.substring(0,index);
    }
}
