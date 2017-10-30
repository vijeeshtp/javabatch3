/**
 * Created by vijeesh on 24/10/17.
 */
public class TestStudent {


    public static void main (String a[]){


    testStudent();

    }

    static void testStudent (){


        Student s1= new Student ();

        s1.sum();
        Student s2= new Student("Tom", "2222", 20,20,30);
        Student s3= new Student("Vipul" , "3333",30,30,30);
        s1.id="1111";
        s1.name="Vinay";
        s1.mark1=10;
        s1.mark2=20;
        s1.mark3=30;




        s1.printTotalMark();
        s2.printTotalMark();
        s3.printTotalMark();


    }

}
