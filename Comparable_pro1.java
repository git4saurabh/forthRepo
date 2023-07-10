package Collection_PAckage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_pro1 implements Comparable<Comparable_pro1> {
    private int sr_no;

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long mob;

    public long getMob() {
        return mob;
    }

    public void setMob(long mob) {
        this.mob = mob;
    }

    private char alp;

    public char getAlp() {
        return alp;
    }

    public void setAlp(char alp) {
        this.alp = alp;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Comparable_pro1( ){

    }

    public Comparable_pro1(int sr_no, String name, long mob, char alp, double salary) {
        this.sr_no = sr_no;
        this.name = name;
        this.mob = mob;
        this.alp = alp;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Comparable_pro1{" +
                "sr_no=" + sr_no +
                ", name='" + name + '\'' +
                ", mob=" + mob +
                ", alp=" + alp +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Comparable_pro1> ref = new ArrayList<>();
        ref.add(new Comparable_pro1(1, "vinayak", 978788791, 'a', 1000000.99));
        ref.add(new Comparable_pro1(2, "kesari", 987744654, 'b', 1100000.99));
        ref.add(new Comparable_pro1(3, "sarathi", 97878781, 'c', 1200000.99));
        ref.add(new Comparable_pro1(4, "aadiyogi", 78989965, 'd', 1300000.99));

        Collections.sort(ref);
        for(Object s:ref){
            System.out.println(s);
        }

        comp obj = new comp();
        Collections.sort(ref, obj);
        /*for (Object s1 : ref) {
            System.out.println("salary sorting "+s1);

        }*/



    }

    @Override
    public int compareTo(Comparable_pro1 o) {
        return this.getName().compareTo(o.getName());
    }
}


class comp implements Comparator<Comparable_pro1> {


    @Override
    public int compare(Comparable_pro1 o1, Comparable_pro1 o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }
        return 0;
    }
}
