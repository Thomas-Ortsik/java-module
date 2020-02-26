package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import java.util.List;

public class EmailAddressParser {

    public EmailAddress parse(String emailAddress) throws InvalidEmailException{
        List<String> splitAddress = List.of(emailAddress.split("@"));
        if (splitAddress.size() != 2 || (splitAddress.get(0).isEmpty() || splitAddress.get(1).isEmpty())){
            throw new InvalidEmailException("Email Address not valid");
        }
        return new EmailAddress(splitAddress.get(0), splitAddress.get(1));
    }
}
