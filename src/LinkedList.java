
import java.util.*;

public class LinkedList<Type extends Comparable>   {

    protected Node<Type> head;
    protected Node<Type> tail;

    /* Iterator mechanism */


     class Node<Type extends Comparable> implements Comparable<Node<Type>> {
        Type data;
        Node<Type> next;

        Node(Type d) {
            this.data = d;
            this.next = null;
        }

         public int compareTo(Node<Type> otherNode) {
             return data.compareTo(otherNode.data);
         }
     }

    public LinkedList() {
        head = null;
    }



    public boolean isEmpty() {
        return (head == null);
    }


    // your methods will go here.

    public void addInFront(Type d) {


    }

    public void print() {

    }

    public boolean contains(Type d) {
        return false;
    }


    public void remove(Type d) {

    }
}










