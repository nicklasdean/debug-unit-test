package com.example.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {
    @Test
    public void isValidAge() {
        //Arrange
        UserValidation testObject = new UserValidation();

        //Act
        boolean result = testObject.isValidAge(17);

        //Assert
        assertTrue(result);
    }
}