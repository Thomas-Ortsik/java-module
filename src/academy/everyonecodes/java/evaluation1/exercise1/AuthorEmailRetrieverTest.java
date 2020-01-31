package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AuthorEmailRetrieverTest {
    AuthorEmailRetriever authorEmailRetriever = new AuthorEmailRetriever();

    @ParameterizedTest
    @CsvSource({
            "user mail, test content, test title, password, user mail",
            "bla@bla.com, what a day, hello world, passw0rd, bla@bla.com"
    })
    void retrieve(String expected, String content, String title, String password, String mail) {
        User user = new User(mail, password);
        Comment comment = new Comment(title, content, user);
        String result = authorEmailRetriever.retrieve(comment);
        Assertions.assertEquals(expected, result);
    }

}