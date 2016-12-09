/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author lairg
 */
public class Main {

   
    public static String toString(int[] arr) {
        String s = "";
        for(int i=0;i<arr.length; i++){
            s = s + arr[i]+" ";
        }
        return s;
    }

    
    public static void main(String[] args) {
        System.out.println("hello");
        //System.out.println(Generator.getP());
        System.out.println("проверка на равномерность "+TestP.hiquadrat(Generator.generateF(10000)));
       // TestP.undependence(Generator.generateBin(2000));
       // System.out.println(Generator.getP());
                
    }
    
}
