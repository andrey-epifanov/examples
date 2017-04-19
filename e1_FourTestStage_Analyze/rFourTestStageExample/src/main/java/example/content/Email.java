package example.content;

/**
 * Created by Андрей on 26.02.2017.
 */
public class Email {
    private String typeEmail;
    private String email;

    public Email(String typeEmail, String email) {
        this.typeEmail = typeEmail;
        this.email = email;
    }

    public String getTypeEmail() {
        return typeEmail;
    }

    public String getEmail() {
        return email;
    }
}
