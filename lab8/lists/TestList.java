package hus.oop.lab8.lists;
import java.util.*;
public class TestList {
    public static void main(String[] args) {
        // Create a list
        List<Integer> myList = new ArrayList<>();

        // Testing insertFirst method
        Lists.insertFirst(myList, 10);
        System.out.println("After inserting at the first position: " + myList);

        // Testing insertLast method
        Lists.insertLast(myList, 20);
        Lists.insertLast(myList, 25 );
        System.out.println("After inserting at the last position: " + myList);


        // Testing replace method
        Lists.replace(myList, 30);
        System.out.println("After replacing the value at index 3: " + myList);

        // Testing removeThird method
        Lists.removeThird(myList);
        System.out.println("After removing the value at index 3: " + myList);

        // Testing removeEvil method
        myList.addAll(Arrays.asList(666, 777, 888)); // Add some values including 666
        System.out.println("Before removing 'evil' value: " + myList);
        Lists.removeEvil(myList);
        System.out.println("After removing 'evil' value: " + myList);

        // Testing generateSquare method
        List<Integer> squareList = Lists.generateSquare();
        System.out.println("Generated square list: " + squareList);

        // Testing contains method
        System.out.println("Does the list contain 25? " + Lists.contains(squareList, 25));

        // Testing copy method
        List<Integer> copyList = new ArrayList<>();
        Lists.copy(squareList, copyList);
        System.out.println("Copied list: " + copyList);

        // Testing reverse method
        Lists.reverse(squareList);
        System.out.println("Reversed list: " + squareList);

        // Testing reverseManual method
        Lists.reverseManual(squareList);
        System.out.println("Manually Reversed list: " + squareList);

        // Testing insertBeginningEnd method with LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(squareList);
        System.out.println("Original Linked List: " + linkedList);
        Lists.insertBeginningEnd(linkedList, 100);
        System.out.println("After inserting at the beginning and end: " + linkedList);
    }
}
