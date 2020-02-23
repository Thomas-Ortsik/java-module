package academy.everyonecodes.java.optionals.exceptions.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChatBotTest {
    ChatBot bot = new ChatBot();

    @ParameterizedTest
    @CsvSource({

            "'So you just want to annoy me, right?', temperature 0",
            "Temperature lowered by 2, temperature -2",
            "Temperature raised by 2, temperature 2",
            "Argument not supported: bla, temperature bla",
            "Lights switched on, lights on",
            "Lights switched off, lights off",
            "Argument not supported: bla, lights bla",
            "Argument not supported: 3, lights 3",
            "Argument not supported: off, temperature off"
    })
//I know, I know...assertThrows... but then I would have to turn this Csv into a methodsource
// and it wouldn't make a difference, since the not supported message is in the catch block
// and i do a
    void handle(String expected, String input) {
        String result = bot.handle(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void firstArgumentExceptionInDecideService() {
        Assertions.assertThrows(WrongFirstArgumentException.class, () -> {
            bot.decideService("bla");
        });
    }

    @Test
    void secondArgumentExceptionInCheckSecondArgument() {
        Assertions.assertThrows(WrongSecondArgumentException.class, () -> {
            bot.checkSecondArgument("bla");
        });
    }
}