package com.epam.mjc.exception;

/**
 * created by Leyla in 21/01/2023 01:15 am
 */

public class CouldNotFindStudentException extends IllegalArgumentException {
    private final long id;

    public CouldNotFindStudentException(long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Could not find student with ID " + id;
    }
}
