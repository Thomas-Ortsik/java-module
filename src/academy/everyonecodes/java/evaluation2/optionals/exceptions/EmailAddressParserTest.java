package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailAddressParserTest {
    EmailAddressParser parser = new EmailAddressParser();

    @Test
    void parse() {
        EmailAddress expected = new EmailAddress("t.ortsik", "gmx.at");
        try {
            EmailAddress result = parser.parse("t.ortsik@gmx.at");
            assertEquals(expected, result);
        } catch (InvalidEmailException e) {
            e.printStackTrace();
        }

    }

    @Test
    void parseWithInvalid() {
        Exception exception = assertThrows(InvalidEmailException.class, () -> {
            parser.parse("t.ortsik");
        });
    }


}