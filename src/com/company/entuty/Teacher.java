package com.company.entuty;

public class Teacher extends Person{

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Teacher(String login, String password, String firstName, String lastName, String middleName, String email, Boolean active, String position) {
        super(login, password, firstName, lastName, middleName, email, active);
        this.position = position;
    }
}
