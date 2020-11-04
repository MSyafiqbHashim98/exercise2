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
public class biodata {
   int age;
   String name, birthday, address;
  
   
   biodata(){
       this.name="Muhammad Syafiq";
       this.age=22;
       this.birthday="20 January 1998";
       this.address="No.6, Lot 2974, Lorong Melati, Kampung Damai, Kuang, 48050 Rawang, Selangor.";
    
      
   }
   biodata(String n,int a, String b, String c){
       this.name=n;
       this.age=a;
       this.birthday=b;
       this.address=c;
      
       
   }
   public void displayBiodata(){
       biodata obj1 = new biodata();
      
       
       System.out.println(obj1.name+", "+obj1.age+", "+obj1.birthday+", "+obj1.address);
   }
    

}