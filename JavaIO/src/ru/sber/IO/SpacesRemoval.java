package ru.sber.IO;

import java.io.*;

public class SpacesRemoval {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Borodino.txt"))) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("BorodinoCorrected.txt"))) {
                String line;
                while((line = reader.readLine()) != null ) {
                    line = line.replaceAll("\\s+"," ");
                    writer.write(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
