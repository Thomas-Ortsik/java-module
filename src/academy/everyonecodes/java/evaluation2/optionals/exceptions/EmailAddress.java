package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import java.util.Objects;

public class EmailAddress {
    private String username;
    private String domain;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddress that = (EmailAddress) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, domain);
    }

    public String getUsername() {
        return username;
    }

    public String getDomain() {
        return domain;
    }

    public EmailAddress(String username, String domain) {
        this.username = username;
        this.domain = domain;
    }
}
