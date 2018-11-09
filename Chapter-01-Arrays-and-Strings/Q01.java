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
public class Q01 
{
    boolean isunique(String str)
    {
        if(str.length() > 256)
            return false ;
        
        boolean[] letter = new boolean[256] ;
        for(int i = 0 ; i < str.length() ; i++)
        {
            int val = str.charAt(i) ;
            if(letter[val])
            {
                return false ;
            }
            else
            {
               letter[val] = true ;     
            }
        }
        
        return true ;
    }
}
