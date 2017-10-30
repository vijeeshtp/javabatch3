/**
 * Created by vijeesh on 24/10/17.
 */
public class Student {

    String id;
    String name;
    int mark1;
    int mark2;
    int mark3;

    int totalMark (){
       return mark1+mark2+mark3;
    }


    void printTotalMark(){
        System.out.println("=============");
        System.out.println("Id :"+ id);
        System.out.println("Name :"+ name);
        System.out.println("Tota; : "+ totalMark());
    }


    Student (){
        System.out.println("Creating object");
    }

    Student (String name, String id, int m1, int m2, int m3 ){
        this.id= id;
        this.name=name;
        mark1=m1;
        mark2=m2;
        mark3= m3;
    }

    void sum (){
        System.out.println(
        mark1+ mark2+ mark3);
    }


}
