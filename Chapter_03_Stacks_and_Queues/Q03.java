/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_04_Trees_and_Graphs;

/**
 *
 * @author Nandan
 */
import java.util.* ;
class MyQueue
{
    Stack<Integer> pushQueue = new Stack<Integer>();
    Stack<Integer> popQueue = new Stack<Integer>() ;
    
    void add(int e)
    {
        pushQueue.push(e) ;
    }
    
    void shift()
    {
        if(popQueue.isEmpty())
        {
            while(!pushQueue.isEmpty())
            {
                popQueue.push(pushQueue.pop());
            }
            
        }
    }
    
    void pop()
    {
        shift() ;
        System.out.println("element poped ->"+popQueue.pop());
    }
    
    void display()
    {
        System.out.println("displaying the contents");
        System.out.println(pushQueue);
        System.out.println(popQueue);
    }
            
    
    
}
public class Q03 
{
    
    public static void main(String[] args)
    {
        MyQueue test = new MyQueue() ;
        
        test.add(1) ;
        test.add(2) ;
        test.add(3) ;
        test.add(4) ;
        
        test.display();
        
        test.pop() ;
        test.display();
        
        test.pop() ;
        test.display();
        
        test.add(10);
        test.display();
        
        test.pop() ;
        test.display();
        
        
        
    }
    
    
}
