package basics;

import java.io.File;

public class FindAllFilesInAFolder {

    public static void main(String[] args) {

        //Write a code to print all the file names in one folder

        String folderPath = "C:\\Users\\TaniyaSharma\\IdeaProjects\\Taniya_Test_Project\\src\\basics";

        //creating a File object that represents the folder path you provide.

        File folder = new File(folderPath);

        // Check if it's a valid directory
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();

            System.out.println("Files in folder: " + folderPath);
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Provided path is not a directory.");
        }
    }
}