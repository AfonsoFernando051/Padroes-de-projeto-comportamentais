public class TwoFactorAuthenticator implements AuthenticationHandler {
    private AuthenticationHandler nextHandler;

    @Override
    public boolean authenticate(User user) {
        if (user.isTwoFactorEnabled()) {
            System.out.println("TwoFactorAuthenticator: Autenticado com sucesso!");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.authenticate(user);
        } else {
            System.out.println("TwoFactorAuthenticator: Não foi possível autenticar.");
            return false;
        }
    }

    @Override
    public void setNextHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

