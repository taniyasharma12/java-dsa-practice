package basics;

public class Pattern10 {

    public static void main(String[] args) {

        		/*

    1
   22
  333
 4444
55555

		 */

        int n =5;
        for(int i=0; i<n; i++) {

            for(int j=i; j<n; j++){

                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {

                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
