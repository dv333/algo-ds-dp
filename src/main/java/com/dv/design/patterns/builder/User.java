package com.dv.design.patterns.builder;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    private User (UserBuilder userBuilder){
        this.firstName=userBuilder.firstName;
        this.lastName=userBuilder.lastName;
        this.age=userBuilder.age;
        this.address=userBuilder.address;
        this.phone=userBuilder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {

        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public static class UserBuilder{

        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age=age;
            return this;
        }

        public UserBuilder address(String address){
            this.address=address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone=phone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
