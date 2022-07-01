package com.example.buildingrestfulwebservice;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/content");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        char currentChar = ' ';
        while (reader.ready()) {
            currentChar = (char) reader.read();
            if (currentChar == '\n') {
                System.out.println();
            }
            System.out.print(currentChar);
        }
    }
}
