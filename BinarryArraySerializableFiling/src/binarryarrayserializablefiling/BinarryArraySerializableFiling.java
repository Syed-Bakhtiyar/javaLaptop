/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarryarrayserializablefiling;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Syed Inkisar Ahmed
 */
public class BinarryArraySerializableFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[5];
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1.write\n2.read\n3.exit");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\Java Filing\\array1.dat", true))){
                    for(int i=0;i<a.length;i++){
                        a[i]=input.nextInt();
                    }
                    out.writeObject(a);
                    out.close();
                }catch(Exception ex){
                    System.out.println("can't write");
                }   break;
            case 2:
                try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\Java Filing\\array1.dat"))){
                
                while(true){
                int b[] = (int[]) in.readObject();
                for(int i=0;i<b.length;i++){
                    System.out.print(b[i]+"  ");
                }
                in.close();
                }
                }
                catch(Exception ex){
                    System.out.println("read completed");
                    
                
                }
                
                break;
            case 3:
                break;
            default:
                break;
        }
    }
    
}
