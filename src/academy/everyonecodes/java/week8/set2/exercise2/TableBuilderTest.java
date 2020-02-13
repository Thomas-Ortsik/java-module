package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TableBuilderTest {
    TableBuilder builder = new TableBuilder();

    @Test

    void build(){
        List<String> expectedParts = List.of("Leg","Leg","Leg","Leg","Surface");
        String expectedName = "Table";
        Furniture result = builder.build();
        Assertions.assertEquals(expectedName, result.getName());
        Assertions.assertEquals(expectedParts, result.getParts());
    }

}