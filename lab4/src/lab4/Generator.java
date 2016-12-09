/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author lairg
 */
public class Generator {
    public static boolean prime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int getP(){
        int res = (int) ((System.currentTimeMillis()/100) % 100000);;
        while (!prime(res)){
            res++; 
        }
        return res;
    }
    public static int[] generate(int l){
        System.out.println("любое число для начала генерации");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[l];
        int a = 1009;
        int b = 8719;
        int M = getP();
        int x = sc.nextInt();
        array[0] = M;
        for(int i = 1; i<l; i++){
            array[i] = (int)((x*a+b)%M);
            x = array[i];
        }
        return array;
    }
    public static float[] generateF(int l){
        int arr[] = generate(l+1);
        float[] arrf = new float[l];
        int M = arr[0];
        for(int i =0; i< arrf.length; i++){
            arrf[i] = (float)arr[i+1]/M;
        }
        return arrf;
    }
    
    public static int[] generateBin(int l){
        int arr[] = generate(l+1);
        int[] arrbin = new int[l];
        int M = arr[0];
        for(int i =0; i< arrbin.length; i++){
            arrbin[i] = arr[i+1]%256;
        }
        return arrbin;
    }

}
