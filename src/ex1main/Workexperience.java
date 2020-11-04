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
public class Workexperience {
    String work1;
    String work2;
    
Workexperience(){
    this.work1="Technician"; 
    this.work2="Tealive Crew";
}

Workexperience(String a, String b){
    this.work1=a;
    this.work2=b;
    
}
public void displayWorkexperience(){
 Workexperience we1= new Workexperience();
 Workexperience we2= new Workexperience();
 
 System.out.println("Work Experience");
 System.out.println("1. "+we1.work1);
 System.out.println("2. "+we2.work2);
}
    
    
}
