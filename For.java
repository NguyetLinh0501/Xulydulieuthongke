/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author LA-AM
 */
public class For {
    public static void main(String args[]){
    int[] a= {1,5,10,12,17};
    int max= a[0];
    int min= a[0];
    int maxind, minind;

    for(int i=0;i< a.length ;i++){
       if(a[i]> max)
           max= a[i];
       if(a[i]< min)
           min= a[i];
    }
    System.out.println("max= "+max +" min= "+min);
    }
}
