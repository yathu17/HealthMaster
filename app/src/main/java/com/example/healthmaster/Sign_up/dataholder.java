package com.example.healthmaster.Sign_up;

public class dataholder {
    String Email, User_name, Phone_number, Age, User_Weight;

    public dataholder(String email, String user_name, String phone_number, String age, String user_Weight) {
        Email = email;
        User_name = user_name;
        Phone_number = phone_number;
        Age = age;
        User_Weight = user_Weight;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getUser_Weight() {
        return User_Weight;
    }

    public void setUser_Weight(String user_Weight) {
        User_Weight = user_Weight;
    }
}