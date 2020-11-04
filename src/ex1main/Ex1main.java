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
public class Ex1main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     biodata a = new biodata();
     cgpa b = new cgpa();
     Workexperience c = new Workexperience();
     
     a.displayBiodata();
     b.displayGPA();
     c.displayWorkexperience();
    }
    
}
