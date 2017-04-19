package featuretest.content;

/**
 * Created by Epifanov on 12/14/2016.
 */
public class ChangePassword {
    private final String oldPassword;
    private final String newPassword;
    private String newPasswordRepeat;

    public ChangePassword(String oldPassword, String newPassword) {
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.newPasswordRepeat = newPassword;
    }

    public ChangePassword addNewPasswordRepet(String newPasswordRepeat) {
        this.newPasswordRepeat = newPasswordRepeat;
        return this;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getNewPasswordRepeat() {
        return newPasswordRepeat;
    }

    @Override
    public String toString() {
        return "ChangePassword{" +
                "oldPassword='" + oldPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", newPasswordRepeat='" + newPasswordRepeat + '\'' +
                '}';
    }
}
