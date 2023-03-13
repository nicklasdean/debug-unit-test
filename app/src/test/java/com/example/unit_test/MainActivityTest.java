package com.example.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {
    @Test
    public void isValidAge() {
        //Arrange
        UserValidation testObject = new UserValidation();

        //Act
        boolean resultSeventeen = testObject.isValidAge(17);
        boolean resultEighteen = testObject.isValidAge(18);
        boolean resultZero = testObject.isValidAge(0);
        boolean resultOne = testObject.isValidAge(1);

        //Assert
        assertFalse(resultSeventeen);
        assertTrue(resultEighteen);
        assertFalse(resultZero);
        assertFalse(resultOne);
    }
}