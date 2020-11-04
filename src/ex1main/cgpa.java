/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1main;

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
public class cgpa {
    double cgpa;
    double gpa[]= new double[4];
    
    cgpa(){
        this.cgpa=3.56;
        this.gpa[0]=3.56;
        this.gpa[1]=3.33;
        this.gpa[2]=3.44;
        this.gpa[3]=3.55;
    }
    
    cgpa(double s1, double s2, double s3, double s4){
        gpa[0]=s1;
        gpa[1]=s2;
        gpa[2]=s3;
        gpa[3]=s4;
    }
    public void displayGPA(){
        cgpa obj1CGPA= new cgpa();
        
        System.out.println("CGPA Per Semester");
        System.out.println("Sem 1 : "+obj1CGPA.gpa[0]);
        System.out.println("Sem 2 : "+obj1CGPA.gpa[1]);
        System.out.println("Sem 3 : "+obj1CGPA.gpa[2]);
        System.out.println("Sem 4 : "+obj1CGPA.gpa[3]);
        
    }
    
}
