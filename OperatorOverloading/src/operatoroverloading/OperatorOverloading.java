/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoroverloading;

/**
 *
 * @author Syed Inkisar Ahmed
 */
public class OperatorOverloading {

    
    private int a=10;

    
    public OperatorOverloading(){
    }

    public OperatorOverloading(int x){
        a=x;
        }
    public OperatorOverloading add(OperatorOverloading v){
    int temp1 = a+v.a;
    OperatorOverloading temp = new OperatorOverloading(temp1);
    return temp;
    }
public void display(){
System.out.println(a);
}


    public static void main(String[] args) {
    OperatorOverloading s = new OperatorOverloading(5);
    OperatorOverloading t = new OperatorOverloading(5);
    OperatorOverloading u = new OperatorOverloading();
    u= s.add(t);
    u.display();
    }
    
}
