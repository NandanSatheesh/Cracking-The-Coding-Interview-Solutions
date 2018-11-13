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
import java.util.*;
public class Q04 
{
    boolean checkpermutation(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            char letter = s.toLowerCase().charAt(i) ;
            if(s.charAt(i) != ' ')
                if(map.get(letter) == null)
                    map.put(letter ,1) ;
                else
                    map.put(letter,1+map.get(letter));
        }
        
        Object[] key = map.keySet().toArray() ;
        int even = 0 , odd = 1 ;
        for(int i = 0 ; i<key.length ; i++)
        {
            System.out.println(key[i]);
            if(map.get(key[i]) % 2 == 0)
            {
               even = even + 2 ;
            }
            else
            {
                odd = odd + 2 ; ;
            }
            
        }       
        
        System.out.println(map);
        
        
        if(even !=0 && even % 2 == 0 && odd %2 ==1 )
        {
            return true ;
        }
        else if(even != 0 && even % 2 == 0)
        {
            return true ;
        }
        else
        {
            return false ;
        }
        
        
        
    }
    
    
    public static void main(String[] args)
    {
        Q04 test = new Q04();
        System.out.println(test.checkpermutation("racecar"));
        System.out.println(test.checkpermutation("abc"));
        System.out.println(test.checkpermutation("malayalam"));
    }
    
}
