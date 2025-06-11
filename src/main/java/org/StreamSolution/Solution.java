package org.StreamSolution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        String fileNameEnd = in.nextLine();

        try(FileInputStream input = new FileInputStream(fileName);
            FileOutputStream output = new FileOutputStream(fileNameEnd)){
            while(input.available() > 0){
                int data = input.read();
                output.write(data);

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
