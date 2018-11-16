/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03_Stacks_and_Queues;

/**
 *
 * @author Nandan
 */
class Stack
{
    int stack_top1 = -1 , stack_top2 = -1 , stack_top3 = -1 ;
    int end_stack1 , end_stack2 ,end_stack3 ;
    int stack[] ;
    Stack(int n)
    {
        stack = new int[n] ;
        
        end_stack1 = n / 3 ;
        end_stack2 = 2 * n / 3 ;
        end_stack3 = n ;
        
        stack_top1 =  -1 ;
        stack_top2 = end_stack1 -1  ;
        stack_top3 = end_stack2 -1   ;
            
    }
    
    void push(int n , int ele)
    {
        if( n == 1 && stack_top1 != end_stack1 -1 )
        {
            stack[++stack_top1] = ele ;
        }
        else if(n == 2 && stack_top2 != end_stack2 -1 )
        {
            stack[++stack_top2] = ele ;
        }
        else if(n ==3 && stack_top3 != end_stack3 -1 )
        {
            stack[++stack_top3] = ele ;
        }
        else
        {
            System.out.println("stack "+n+" is full ");
        }
    }
    
    int pop(int n)
    {
        if( n == 1 && stack_top1 != -1)
        {
             return stack[stack_top1--] ;
        }
        else if(n == 2 && stack_top2 != end_stack1-1)
        {
            return stack[stack_top2--]  ;
        }
        else if(n == 3 && stack_top3 != end_stack2-1 )
        {
            return stack[stack_top3--] ;
        }
        else
        {
            System.out.println("stack "+n+" is empty ");
        }
        
        return -1 ;
        
    }
    
    int peek(int n)
    {
        if( n == 1 && stack_top1 != 0)
        {
             return stack[stack_top1] ;
        }
        else if(n == 2 && stack_top2 != end_stack1-1)
        {
            return stack[stack_top2]  ;
        }
        else if(n ==3 && stack_top3 != end_stack2-1 )
        {
            return stack[stack_top3] ;
        }
        else
        {
            System.out.println("stack "+n+" is empty ");
        }
        
        return -1 ;
        
    }
    
    boolean isfull(int n)
    {
        if( stack_top1 == end_stack1 -1 ) 
        {
            return true ;
        }
        else if(stack_top2 == end_stack2 -1 )
        {
            return true ;
        }
        else if(stack_top3 == end_stack3 -1)
        {
            return true ;
        }
        else
        {
            return false ;
        }
             
    }
    
    void display()
    {
        for(int i : stack)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
            
    
    
    
    
    
    
}

public class Q01 
{
    public static void main(String[] args)
    {
        Stack s = new Stack(6);
       
        s.push(3,130);
        s.push(3,230);
        s.display();
        s.push(3, 0);
        System.out.println(s.pop(3));
        
        
        s.push(2,190);
        s.push(2,210);
        s.display();
        s.push(2, 20);
        System.out.println(s.pop(2));
       
        s.push(1,1590);
        s.push(1,5210);
        s.display();
        s.push(1, 520);
        System.out.println(s.pop(1));
        
    }
    
    
    
    
}
