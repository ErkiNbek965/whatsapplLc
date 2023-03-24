package dao;

import model.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private Long id;
    private String userName;
    private int phoneNumber;
    private String password;
    private String image;
    List<String> messages=new ArrayList<>();
    Status status;

    public Profile() {
    }

    public Profile(Long id, String userName, int phoneNumber, String password, String image, List<String> messages, Status status) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.image = image;
        this.messages = messages;
        this.status = status;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Profile : " +
                "id =" + id +
                " userName = " + userName + '\n' +
                " phoneNumber = " + phoneNumber +
                " password = " + password + '\n' +
                " image = " + image + '\n' +
                " messages = " + messages +'\n'+
                " status = " + status ;
    }
}
