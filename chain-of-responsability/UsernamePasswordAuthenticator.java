public class UsernamePasswordAuthenticator implements AuthenticationHandler {
    private AuthenticationHandler nextHandler;

    @Override
    public boolean authenticate(User user) {
        if (user.getUsername() != null && user.getPassword() != null) {
            System.out.println("UsernamePasswordAuthenticator: Autenticado com sucesso!");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.authenticate(user);
        } else {
            System.out.println("UsernamePasswordAuthenticator: Não foi possível autenticar.");
            return false;
        }
    }

    @Override
    public void setNextHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
