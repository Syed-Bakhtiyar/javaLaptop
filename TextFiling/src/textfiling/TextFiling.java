 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiling;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Syed Inkisar Ahmed
 */
public class TextFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name="farrukh";
        int a=5;
        try(PrintStream out = new PrintStream("E:\\Java Filing\\abc.txt")){
        out.println(name);
        out.println(a);
        
        }catch(Exception ex){
            System.out.println("Cant create or write");
        }
        try(DataInputStream input = new DataInputStream( new FileInputStream("E:\\Java Filing\\abc.txt"))){
        
       
        int b;
        while(true){
        char read;
        read = input.readChar();
        b=input.readInt();
            System.out.println(read   +"      "+b);
        }
            }catch(Exception ex){
        
        }
        
    }
    
}
