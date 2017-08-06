package ru.atom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            System.out.println(bufferedReader.lines().toArray().length);
        } catch (FileNotFoundException e) {
            System.out.println("There's no file with this name.");
        }
    }
}
