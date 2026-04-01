package arrays.multidimensional;

public class PrintCheck {


    public static void main(String[] args) {


        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int i = 0; i < matrix.length; i++) {  //matrix.length = number of rows
            for (int j = i+1; j < matrix[i].length; j++) { //matrix[i].length = length of ith row

                System.out.println("index is : " + i + " " + j + " values: " + matrix[i][j]);
            }


        }
    }
}

/*

🧠 The Core Difference
🔹 Case 1
for (int i = 0; i < matrix.length; i++) {
    for (int j = i + 1; j < matrix[i].length; j++) {

👉 You start j from i + 1

🔹 Case 2
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {

👉 You start j from 0

🔍 What this means visually

Given matrix:

1  2  3
4  5  6
7  8  9
✅ Case 1: j = i + 1

👉 You only visit upper triangle (excluding diagonal)

   2  3
      6
Elements accessed:
(0,1) → 2
(0,2) → 3
(1,2) → 6
✅ Case 2: j = 0

👉 You visit entire matrix

1  2  3
4  5  6
7  8  9
🔥 Key Difference
Loop	Traversal
j = 0	Full matrix
j = i + 1	Upper triangle only
🧠 Why use j = i + 1?

Used when:

Avoid duplicate comparisons

Work with symmetric matrices

Graph problems (undirected edges)

🔥 Example Use Case
🔹 Avoid duplicate pairs

Instead of:

(0,1) and (1,0)

You only take:

(0,1)
 */
