package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.example.model.Person;
import org.example.parse.Parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    final static String FILE_PATH = "src/main/resources/foreign_names.csv";

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Parser parser = new Parser();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(FILE_PATH)).withSkipLines(1).build()) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                people.add(parser.parseStringArrayToPerson(line));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
