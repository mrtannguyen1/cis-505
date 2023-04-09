/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.LinkedList;

public class GenericQueue<E> {
    //1: A private generic linked list data field named list.
    private LinkedList<E> list = new LinkedList<>();

    //2: A public method named enqueue with a generic argument named item that adds the item
    // to the list using the addFirst method.
    public void enqueue(E item) {
        list.addFirst(item);
    }

    //3: A public method named dequeue with a generic return type that removes the first object
    // in the queue using the removeLast method.
    public E dequeue() {
        return list.removeLast();
    }

    //4: A public method named size with a data return type of integer that specifies the size of
    // the list using the size method.
    public int size() {
        return list.size();
    }
}
