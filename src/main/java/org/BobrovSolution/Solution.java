package org.BobrovSolution;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while(reader.ready()){
                System.out.println(reader.readLine());
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
