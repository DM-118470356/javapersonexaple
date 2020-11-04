/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personexample;

import java.util.Scanner;
import personexample.person;

/**
 *
 * @author DannyMorrissey
 */
public class PersonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("whats your name?");
        String name = sc.next();
          System.out.println("whats your age?");
        int age = sc.nextInt();
          System.out.println("whats your height?");
        double height  = sc.nextDouble();
        person me = new person(name, age ,height);
        System.out.println(me.toString());
        
        person me2 =new person();
        me2.setName("tom");
        System.out.println(me2.getName());
        
        
    }
   
            
    
}
