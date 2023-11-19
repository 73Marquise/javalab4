package org.example.parse;

import org.example.model.Division;
import org.example.model.Gender;
import org.example.model.Person;

public class Parser {

    /**
     * converts an array of strings containing data about a person into an object of class Person
     * @param data array of strings containing data about a person
     * @return object of class Person
     */
    public Person parseStringArrayToPerson(String[] data) {
        String[] newData;
        if (data.length == 1) {
            newData = data[0].split(";");
        } else {
            newData = String.join(", ", data).split(";");
        }

        return new Person(
                Long.parseLong(newData[0]),
                newData[1],
                Gender.of(newData[2]),
                newData[3],
                new Division(newData[4]),
                Integer.parseInt(newData[5])
        );
    }
}
