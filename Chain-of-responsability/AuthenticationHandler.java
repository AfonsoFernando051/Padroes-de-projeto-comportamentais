public interface AuthenticationHandler {
    boolean authenticate(User user);
    void setNextHandler(AuthenticationHandler nextHandler);
}
