public class AuthenticationManager {
    private AuthenticationHandler authenticationChain;

    public AuthenticationManager() {
        buildChain();
    }

    private void buildChain() {
        authenticationChain = new UsernamePasswordAuthenticator();
        authenticationChain.setNextHandler(new TwoFactorAuthenticator());
    }

    public boolean authenticate(User user) {
        return authenticationChain.authenticate(user);
    }
}
