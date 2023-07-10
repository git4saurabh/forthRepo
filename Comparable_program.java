package Collection_PAckage;

import java.util.*;

public class Comparable_program implements Comparable<Comparable_program> {
    private int sr_no;
    private int roll_no;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String city;
    private int pinCode;
    private String state;

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Comparable_program() {

    }

    public Comparable_program(int sr_no, int roll_no, String firstName, String middleName, String lastName, String email, String city, int pinCode, String state) {
        this.sr_no = sr_no;
        this.roll_no = roll_no;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
    }


    public static void main(String[] args) {

        Comparable_program student = new Comparable_program(1, 1001, "saurabh", "shankar", "patil", "ssp@gmail.com", "latur", 413512, "maharashtra");
        Comparable_program student1 = new Comparable_program(2, 1002, "shankarrao", "prabhkarrao", "patil", "shankarrao@gmail.com", "latur", 413512, "maharashtra");
        Comparable_program student2 = new Comparable_program(3, 1003, "vijay", "maroti", "kadpewad", "vijay@gmail.com", "umri", 431807, "tihar");
        Comparable_program student3 = new Comparable_program(4, 1004, "akash", "umakant", "biradar", "akash@gmail.com", "bidar", 415304, "karnatak");
        Comparable_program student4 = new Comparable_program(5, 1005, "shubham", "ramesh", "barude", "shubham@gmail.com", "udgir", 411523, "maharashtra");
        Comparable_program student5 = new Comparable_program(6, 1006, "chintu", "bantu", "santo", "chintu@gmail.com", "pimpri", 54742, "panjab");
        List<Comparable_program> obj = new ArrayList<>();
        obj.add(student);
        obj.add(student1);
        obj.add(student2);
        obj.add(student3);
        obj.add(student4);
        obj.add(student5);
        obj.add(new Comparable_program(7,1007,"Ram","Dashrath","Shatriya","ram@gmail.com","Ayodhya",10001,"UP"));
        Collections.sort(obj);
      //  System.out.println("First name sorting "+obj);
        System.out.println("Pin code sorting"+obj);

    }

    @Override
    public String toString() {
        return "Comparable_program{" +
                "sr_no=" + sr_no +
                ", roll_no=" + roll_no +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public int compareTo(Comparable_program o) {
       // return this.getFirstName().compareTo(o.getFirstName());
        return this.pinCode-o.pinCode;
    }



}
