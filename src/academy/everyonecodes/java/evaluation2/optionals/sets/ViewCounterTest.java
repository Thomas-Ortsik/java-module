package academy.everyonecodes.java.evaluation2.optionals.sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewCounterTest {
    ViewCounter counter = new ViewCounter();

    @Test

    void newStream(){
        counter.addViewerIPAddress("172.12.11.3.29");
        counter.addViewerIPAddress("172.12.11.3.29");
        counter.addViewerIPAddress("152.11.11.3.29");
        counter.addViewerIPAddress("192.12.11.3.29");
        int expected = 3;
        int result = counter.countUniqueViews();
        Assertions.assertEquals(expected, result);
    }

}