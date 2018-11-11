/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package Chapter_02_Linked_Lists;

/**
 *
 * @author Nandan
 */


public class Q08 
{
    boolean findcycle(Node a)
    {
        Node slow = a.next ;
        Node fast = a.next.next ;
        
        while(slow != null && fast != null)
        {
            if(slow == fast)
            {
                return true ;
            }
            else if(slow.next == null || fast.next==null || fast.next.next == null)
            {
                return false ; 
            }
            slow = slow.next ;
            fast = fast.next.next ;
        }
        
        return false ;
    }
    
    public static void main(String[] args)
    {
        Q08 test = new Q08() ;
        Node head = new Node(10);
        Node t1 = new Node(20) ;
        head.next = t1 ;
        Node t2 = new Node(30);
        t1.next = t2 ;
        Node t3 = new Node(40);
        t2.next = t3 ;
        Node t4 = new Node(50);
        t3.next = t4 ;
        
        System.out.println("cycle in the linked list? --> "+test.findcycle(head));
    }
}
   

