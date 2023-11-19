package org.example.parse;

import org.example.model.Division;
import org.example.model.Gender;
import org.example.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ParserTest {

    @Test
    void parseStringArrayToPersonTest() {
        Parser parser = new Parser();
        String[] data = new String[] {"28298;Aarthi;Female;24.09.1961;A;4300"};
        Person p1 = new Person(
                28298,
                "Aarthi",
                Gender.FEMALE,
                "24.09.1961",
                new Division("A"),
                4300);
        Person p2 = parser.parseStringArrayToPerson(data);

        Assertions.assertTrue(
                p1.getId() == p2.getId() &&
                Objects.equals(p1.getName(), p2.getName()) &&
                p1.getGender().equals(p2.getGender()) &&
                Objects.equals(p1.getBirthDate(), p2.getBirthDate()) &&
                Objects.equals(p1.getDivision().getName(), p2.getDivision().getName()) &&
                p1.getSalary() == p2.getSalary()
        );
    }
}
