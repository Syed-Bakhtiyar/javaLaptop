/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;
import java.util.InputMismatchException;
/**
 *
 * @author Syed Inkisar Ahmed
 */
public class A extends Bc  {

 private String name;

    public A() {
        super();
        System.out.println("child");
    }

 public String geter(){
// super.geter();
 return super.geter();
 }
 
 public void seter(String x){
 name=x;
 
 }
    public static void main(String[] args) {
    A b = new A();
    b.seter("dgddg");
    System.out.println(b.geter());
        System.out.println(b.f);
        
    }
    
}
