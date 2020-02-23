package academy.everyonecodes.java.optionals.maps.exercise2;

import java.util.Objects;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password; //we don't need it, but it's good practice to set a new password on a regular basis! ;) Also let me have those stupid jokes at quarter past midnight.
    }
}
