package Collection_PAckage;

import java.util.*;

public class Comparator_Practice implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o2.getId()-o1.getId();
    }
}

class SalarySorting implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        if(o1.getSalary()>o2.getSalary()){
            return 1;
        }else if (o1.getSalary()<o2.getSalary()){
            return -1;
        }
        return 0;
    }
}

class Employee1{
    private String name;
    private String mail;
    private int id;
    private double salary;
    private float no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getNo() {
        return no;
    }


    public void setNo(float no) {
        this.no = no;
    }

    public Employee1(String name, String mail, int id, double salary, float no) {
        this.name = name;
        this.mail = mail;
        this.id = id;
        this.salary = salary;
        this.no = no;
    }


    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", no=" + no +
                '}';
    }


}

class happy{
    public static void main(String[] args) {
        Employee1 obj1 = new Employee1("ganesha","ganesh@gmail.com",105,99999,1);
        Employee1 obj2 = new Employee1("vinayaka","vinayaka@gmail.com",103,99999,5);
        Employee1 obj3 = new Employee1("ekdanta","ekdanta@gmail.com",102,77777,3);
        Employee1 obj4 = new Employee1("lambodara","lambodara@gmail.com",105,66666,2);
        Employee1 obj5 = new Employee1("ganadhyaksha","ganadhyaksha@gmail.com",101,55555,4);


        List<Employee1> emplist = new ArrayList<>();
        emplist.add(obj1);
        emplist.add(obj2);
        emplist.add(obj3);
        emplist.add(obj4);
        emplist.add(obj5);

//        ID sorting object
      /*  Comparator_Practice ref = new Comparator_Practice();
        Collections.sort(emplist,ref);
        System.out.println("id sorting ="+emplist);

//        Salary sorting object
        SalarySorting ref1 = new SalarySorting();
        Collections.sort(emplist,ref1);
        System.out.println(emplist);*/

        Collections.reverse(emplist);
        System.out.println(emplist);


    }
}
