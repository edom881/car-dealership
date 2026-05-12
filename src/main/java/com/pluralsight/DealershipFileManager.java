package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {

        try { BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

        } catch (IOException e) {
            System.out.println("Error reading inventory file.");
        }

        return null;
    }
}
