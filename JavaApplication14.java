/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        int []b=new int [a];
        int t;
        for(int i=0;i<b.length;i++)
        {
            b[i]=d.nextInt();
        }
        int j,i;
        for(j=0;j<b.length;j++)
        {
            for(i=0;i<b.length-j-1;i++)
            {
                if(b[i]>b[i+1])
                {
                    t=b[i];
                    b[i]=b[i+1];
                    b[i+1]=t;
                }
            }
        }
        for( i=0;i<b.length;i++)
     {
         System.out.print(b[i]);
     }
    }
    
}
