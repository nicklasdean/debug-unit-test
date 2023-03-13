package com.example.unit_test;

import java.util.InputMismatchException;

public class UserValidation {
    public boolean isValidAge(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
