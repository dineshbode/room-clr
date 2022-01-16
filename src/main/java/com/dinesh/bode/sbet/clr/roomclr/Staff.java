package com.dinesh.bode.sbet.clr.roomclr;

public class Staff {
    String GUID;
    String firstName;
    String lastName;
    String position;

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff{" +
                "GUID='" + GUID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public Staff(String GUID, String firstName, String lastName, String position) {
        this.GUID=GUID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.position=position;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
