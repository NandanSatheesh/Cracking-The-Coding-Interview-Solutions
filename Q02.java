/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_01_Arrays_and_Strings;

/**
 *
 * @author Nandan
 */
public class Q02 
{
    boolean issame(String a , String b )
    {
        char a_array[] = a.toLowerCase().toCharArray() ;
        char b_array[] = b.toLowerCase().toCharArray() ;
        java.util.Arrays.sort(a_array);
        java.util.Arrays.sort(b_array);
        
        if(a_array.length != b_array.length)
        {
            return false ;
        }
        
        for(int i = 0 ; i < a_array.length ; i++)
        {
            if(a_array[i] != b_array[i])
            {
                return false ;
            }
        }
        
        return true ;           
        
    }
    
}
