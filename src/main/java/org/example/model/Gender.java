package org.example.model;

public enum Gender {
    MALE, FEMALE;

    /**
     * converts a string value into an object of type Gender
     * @param value string value of gender
     * @return object of type Gender
     */
    public static Gender of(String value) {
        if (value.equals("Male")) {
            return Gender.MALE;
        } else if (value.equals("Female")) {
            return Gender.FEMALE;
        }
        return null;
    }
}
