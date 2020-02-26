package academy.everyonecodes.java.evaluation2.optionals.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficePersonalSpaceTest {
    OfficePersonalSpace personalSpace = new OfficePersonalSpace();

    @Test

    void addAndGetMethods(){
        int inputEmployee = 4;
        String inputItem = "TestItem";
        personalSpace.add(inputEmployee, inputItem);
        String result = personalSpace.get(inputEmployee);
        assertEquals("TestItem", result);
    }

    @Test

    void addAndGetMethodsWithPrefilledStorage(){
        int inputEmployee = 4;
        String inputItem1 = "Item1";
        String inputItem2 = "AnotherItem";
        personalSpace.add(inputEmployee, inputItem1);
        personalSpace.add(inputEmployee, inputItem2);
        String result = personalSpace.get(inputEmployee);
        assertEquals("Item1 AnotherItem", result);
    }

    @Test

    void empty(){
        int inputEmployee = 4;
        String inputItem1 = "Item1";
        String inputItem2 = "AnotherItem";
        personalSpace.add(inputEmployee, inputItem1);
        personalSpace.add(inputEmployee, inputItem2);
        personalSpace.empty(inputEmployee);
        String result = personalSpace.get(inputEmployee);
        assertEquals("Empty", result);
    }

    @Test

    void emptyOnAnEmptyStorage(){
        int inputEmployee = 3;
        personalSpace.empty(inputEmployee);
        String result = personalSpace.get(inputEmployee);
        assertEquals("Empty", result);
    }



}