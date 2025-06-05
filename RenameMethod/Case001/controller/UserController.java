package controller;

import model.UserInfo;
import service.UserService;

public class UserController {
    public void handleRequest() {
        UserService service = new UserService();
        UserInfo user = new UserInfo("Alice");
        service.printUser(user);
    }
}
