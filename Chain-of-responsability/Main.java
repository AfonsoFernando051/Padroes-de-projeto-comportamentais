public class Main {
    public static void main(String[] args) {
        AuthenticationManager authenticationManager = new AuthenticationManager();

        User user1 = new User("user1", "password123", false);
        User user2 = new User("user2", null, true);

        authenticationManager.authenticate(user1);
        authenticationManager.authenticate(user2);
    }
}
