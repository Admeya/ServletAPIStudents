package model;

/**
 * Created by Ирина on 22.02.2017.
 */
public class User {
    public String name;
    public int type;

    public User(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public User() {
    }
}
