/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;
import java.security.SecureRandom;
/**
 *
 * @author Syed Inkisar Ahmed
 */
public class Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Integer[] a = new Integer[10];
     SecureRandom c = new SecureRandom();
     for(int i=0;i<a.length;i++){
     a[i]= c.nextInt(9);
     }
     Integer[] avr=mean(a);
     for(int i=0;i<a.length;i++){
         System.out.println(avr[i]);
     }
     
    }
    public static <T> T[] mean(T[] a){
    
        for(T b:a){
        
//System.out.println(b);
    }
    return a;
    }
    
}
