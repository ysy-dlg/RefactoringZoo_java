package service;

import model.UserInfo;

public class UserService {
    public void printUser(UserInfo user) {
        System.out.println("Name: " + user.getName());
    }
}
