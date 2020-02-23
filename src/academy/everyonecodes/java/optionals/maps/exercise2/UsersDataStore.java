package academy.everyonecodes.java.optionals.maps.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UsersDataStore {
    private Map<String, User> users;

    public UsersDataStore() {
        users = new HashMap<>();
        users.put("dagobert", new User("dagobert", "duck"));
        users.put("donald", new User("donald", "workingClassHero"));
    }

    public Optional<User> getUserByUsername(String username) {
        if (!users.containsKey(username)) {
            return Optional.empty();
        }
        return Optional.of(users.get(username));
    }
}
