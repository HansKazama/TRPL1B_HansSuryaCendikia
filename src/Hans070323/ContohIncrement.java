/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hans070323;

/**
 *
 * @author LABSIKOMP03
 */
public class ContohIncrement {
    public static void main (String[] args){
        int i = 10;
        int j = 3;
        int k;
        
        k = j++ + i;
        
        System.out.println("i = " +i+ ", j = " +j+ ", k = " +k );
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }    
}
