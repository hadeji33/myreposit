/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.util.Arrays;

/**
 *
 * @author lairg
 */
public class TestP {
    public static String hiquadrat(float[] arr){
        Arrays.sort(arr);
        System.out.println("массив количества попадания в интервалы");
        int[] col = new int[10];
        int sum = 0;
        for(int i = 0; i<col.length ;i++){
            col[i]=0;
            for(int j = 0; j<arr.length; j++){
                if((arr[j] >= (float) i/col.length) && (arr[j] < (float)(i+1)/col.length)){
                    col[i]++;
                }
            }
            sum = sum + col[i];
            System.out.print(col[i] + " ");
        }
        
        System.out.println("всего чисел " + sum);
        
        float hi = 0;
        for(int i=0; i<col.length;i++){
            hi = hi + (float) ((col[i] - 1/10 * sum)*(col[i] - 0.1 * sum)/(0.1 * sum) );
        }
        
        System.out.println("хи^2 эксп: " + hi);
        
        if(hi < 18.31){
            return " приемлемая равномерность";
        }
        
        return " распределение не равномерно";
    }
    
    public static String undependence(int[] a) {  
        int b;   
        int[] arr = new int[a.length];
        for(int i=0;i<a.length;i++){
            arr[i]=0;
            while(a[i] !=0 ) {  
                b = a[i]%2;  
                if (b == 1){arr[i]++;}  
                a[i] = a[i]/2;  
            }  
        }
        //System.out.println("массив с числом 1");
        for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i]+" ");
            
        }
        int[] col = new int[9];
        //System.out.println("массив количества");
        for(int i = 0; i<col.length; i++){
            col[i] = 0;
            for(int j = 0; j< arr.length; j++){
                if (arr[j] == i){
                    col[i]++;
                }
            }
            //System.out.print(col[i]+" ");
        }
        float[] pexp = new float[col.length];
        float[] pteor = new float[col.length];
        float sum = 0;
        for(int i= 0; i< col.length; i++){
            pexp[i]= (float)col[i]/a.length;
            System.out.print(pexp[i]+" ");
            pteor[i] = (float)pow(0.5, 8)*sochet(8,i);
            System.out.print(pteor[i]+" ,");
            sum = sum + abs(pexp[i]-pteor[i]);
        }
        System.out.println();
        System.out.println(sum);
        
        return "";
    }  
    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    public static int sochet(int l, int j){
        return (int)(factorial(l)/factorial(j)/factorial(l-j));
    }
}
