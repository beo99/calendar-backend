package de.fraguela.backendcalendar;

import de.fraguela.backendcalendar.user.User;

public class Session {

    private User[] userArray = new User[20];

    public Session() {
    }

    //fills empty array
    public boolean fillarray(User user) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                userArray[i] = user;
                return true;
            }
        }
        return false;
    }

    public void storeUser(User user) {
        //checks array and insert user or insert user at the end if array is filled
        if (!fillarray(user)) {
            for (int i = 0; i < userArray.length - 1; i++) {
                userArray[i] = userArray[i + 1];
            }
            userArray[19] = user;
        }
        //store User in Database
    }


    public User checkUserName(String username) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] != null && userArray[i].getUsername().equals(username)) {
                return userArray[i];
            }
        }
        return null;
    }

    public User checkUserMail(String mail) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] != null && userArray[i].getMail().equals(mail)) {
                return userArray[i];
            }
        }
        return null;
    }
}
