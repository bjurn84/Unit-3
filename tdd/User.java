package tdd;

public class User {

    String name;
    String password;
    boolean isAdmin = false;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }


    public boolean authenticate(String name, String password) {
        isAuthenticate = name == this.name && password == this.password;
        return isAuthenticate;
    }

}