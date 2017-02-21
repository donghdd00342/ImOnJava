/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.User;

/**
 *
 * @author DongHo
 */
public class UserModel {

    public static User find(int id) {
        User user = new User();

        return user;
    }

    public static int insert(User user) {
        int id = 0;

        return id;
    }

    public static boolean update(User user, int id) {
        boolean success = true;

        return success;
    }

    public static User delete(int id) {
        User user = new User();

        return user;
    }

    public static void all(byte pagination) {

    }

}
