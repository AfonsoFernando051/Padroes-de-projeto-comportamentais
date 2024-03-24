public class User {
    private String username;
    private String password;
    private boolean twoFactorEnabled;

    public User(String username, String password, boolean twoFactorEnabled) {
        this.username = username;
        this.password = password;
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }
}
