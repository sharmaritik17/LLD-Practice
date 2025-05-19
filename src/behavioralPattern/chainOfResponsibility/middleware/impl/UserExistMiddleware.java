package behavioralPattern.chainOfResponsibility.middleware.impl;

import behavioralPattern.chainOfResponsibility.middleware.Middleware;
import behavioralPattern.chainOfResponsibility.server.Server;

public class UserExistMiddleware extends Middleware {
    private Server server;

    public UserExistMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)) {
            System.out.println("This email is not registered");
            return false;
        }
        if(!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }
        return checkNext(email, password);
    }
}
