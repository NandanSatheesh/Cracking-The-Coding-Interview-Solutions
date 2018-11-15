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
/* - Class Decalaration Reference
class Node
{
    int value ;
    Node next ;    
}
*/ 
public class Q02 
{
 
    
    int kthelement_interative(Node head , int k)
    {
        if(head == null)
        {
            return -1 ;
        }
        else 
        {
            int i = 0 ;
            Node temp = head ;
            while(i < k)
            {
                if(temp == null)
                {
                    return -1 ;
                }
                else if( i== k-1)
                {
                    break ;
                }
                else
                {
                    temp = temp.next ;
                    i++;
                    
                }
            }
            
            return temp.value ;
        }
    }
    
    public static void main(String[] args)
    {
        Q02 test = new Q02() ;
        Node head = new Node(10);
        Node t1 = new Node(20) ;
        head.next = t1 ;
        Node t2 = new Node(30);
        t1.next = t2 ;
        Node t3 = new Node(40);
        t2.next = t3 ;
        Node t4 = new Node(50);
        t3.next = t4 ;
        System.out.println("kth element in the linked list -->"+test.kthelement_interative(head, 2));
    }
}
