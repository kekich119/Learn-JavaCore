package org.instanceofSolution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) {
        Object obj = getObject();

        if (obj instanceof FileInputStream){
            System.out.println("Это FileInputStream");
        } else if (obj instanceof InputStream) {
            System.out.println("Это InputStream");

        }else {
            System.out.println("Это неизвестный тип");
        }

    }

    public static Object getObject(){
        try {
            return new FileInputStream("text.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
