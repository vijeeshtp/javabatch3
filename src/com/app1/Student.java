package com.app1;

/**
 * Created by vijeesh on 24/10/17.
 */
public class Student {

   private String rollNo;
   private String studentName;
   private int m1;
   private int m2;

   public Student (String rollNo, String studentName, int m1, int m2){
    this.rollNo= rollNo;
       this.studentName=studentName;
       this.m1=m1;
       this.m2=m2;
   }

   public int total (){
       return m1+ m2;
   }

}
