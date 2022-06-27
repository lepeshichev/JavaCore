package ru.sber.IO;

import java.io.*;
import java.util.Arrays;

public class SortedNames {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("listNames.txt"))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("listNamesSorted.txt"))) {
                String line;
                while((line = reader.readLine()) != null ) {
                    String[] words = line.split(" ");
                    Arrays.sort(words);
                    for(String s : words) {
                        s = s.replaceAll(",", "");
                        writer.write(s + "\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
