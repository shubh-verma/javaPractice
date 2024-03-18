package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSys {
    public static void main(String[] args) {
        try {
            File Obj = new File("newFile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "
                        + Obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error has occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter Writer
                    = new FileWriter("newFile.txt");
            Writer.write(
                    "Test File!!");
            Writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.err.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
