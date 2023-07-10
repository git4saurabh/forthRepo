package ConstructorPractice;
class grandparent{
    grandparent(){
        System.out.println("this is default constructor of grand class");
    }
    grandparent(String name){
        System.out.println("this is parameterized constructor of grand class"+" "+name);
    }
}
class parent extends grandparent{
    parent(){
        System.out.println("this is default constructor of parent class");
    }
    parent(String Pname){
        System.out.println("this is default constructor of parent class"+" "+Pname);
    }

}
class child extends parent{
    child(){
        //this();
        System.out.println("his is default constructor of child class");
    }
}
public class DefaultConstructor extends parent {


    public static void main (String []args){
       child obj = new child();
    }
}
