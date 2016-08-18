/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;
import java.security.SecureRandom;
/**
 *
 * @author Syed Inkisar Ahmed
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        SecureRandom rd = new SecureRandom();
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100);
        }
        System.out.println("output");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------Insertion Sort-------------");
        
        
        
        
        for(i=1;i<arr.length;i++){
        int key = arr[i];
        int m = i;
        while(m >0&& key<arr[m-1]){
        arr[m]=arr[m-1];
        //arr[key-1]=key;
        m--;
        }
        arr[m]=key;
        
        }
        System.out.println("output");
        for(int r:arr){
            System.out.println(r);
        }
        
        
    }
    
}
