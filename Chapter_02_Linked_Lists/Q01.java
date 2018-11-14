/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_02_Linked_Lists;

import java.util.HashSet;

/**
 *
 * @author Nandan
 */
class Node
{
    int value ;
    Node next ;
    
    Node(int value)
    {
        this.value = value ;
    }
    
    Node(int value , Node head)
    {
        this.next = head ;
    }
    
    void append(Node head , int value)
    {
        Node t2 = head ;
        Node t1 = new Node(value);
        while(t2.next != null)
        {
            t2 = t2.next ;
        }
        
        t2.next = t1 ;
    }
    
    void display(Node head)
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.value+"->");
            temp = temp.next ;
        }
        System.out.println(" End of List ");
    }
}
public class Q01 
{
    void removeduplicates(Node head)
    {
        HashSet<Integer> hs = new HashSet<Integer>() ;
        
        while(head != null )
        {
            hs.add(head.value);
            head = head.next ;
        }
        
        System.out.println("the linked list without any duplicates ->"+hs);
    }
    
    
    public static void main(String[] args)
    {
        Q01 test = new Q01() ;
        Node head = new Node(10);
        Node t1 = new Node(20) ;
        head.next = t1 ;
        Node t2 = new Node(20);
        t1.next = t2 ;
        Node t3 = new Node(40);
        t2.next = t3 ;
        Node t4 = new Node(40);
        t3.next = t4 ;
        
        test.removeduplicates(head);
    }
    
}
