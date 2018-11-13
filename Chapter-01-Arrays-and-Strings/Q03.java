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
public class Q03 
{
    String removespaces(String str)
    {
        String s[] = new String(str).trim().split(" ");
        String output = new String();
        for(int i = 0 ; i < s.length-1;i++)
        {
            output+=s[i]+"%20" ;
        }
        
        
        return output+s[s.length-1] ;
    }
    
    public static void main(String[] args)
    {
        Q03 test = new Q03() ;
        System.out.println(test.removespaces(" Mr John Smith        "));
                
    }
}
