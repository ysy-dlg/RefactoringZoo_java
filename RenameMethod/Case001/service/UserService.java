package service;

import model.UserInfo;

public class UserService {
    public void displayUser(UserInfo user) {
        System.out.println("Name: " + user.getName());
    }
}
