//Name: Viet Trinh Nguyen
//Date: 2/26/25
//CS 240
// Programming Heap program
import java.util.*;
public class MinHeap {
public static void main(String[] args) {
// Create a PriorityQueue that works as a Min-Heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
// Inserting elements into the heap initially
minHeap.add(5);
minHeap.add(10);
minHeap.add(30);
minHeap.add(15);
minHeap.add(20);
// Print the heap elements after initial insertions
System.out.println("Heap elements (Min-Heap): " + minHeap);
// Print the smallest element (root) in the heap
System.out.println("Smallest element in the heap: " + minHeap.peek());
// Remove elements from the heap and print them space-separated
System.out.print("Elements removed from heap: ");
List<Integer> removedElements = new ArrayList<>();
while (!minHeap.isEmpty()) {
removedElements.add(minHeap.poll());
}
// Printing the removed elements
for (int i = 0; i < removedElements.size(); i++) {
if (i != 0) {
System.out.print(" ");
}
System.out.print(removedElements.get(i));
}
// Allow user to input additional numbers to insert into the heap
Scanner in = new Scanner(System.in);
System.out.print("\nEnter numbers to insert into the heap (space-separated): ");
String number = in.nextLine();
String[] inputNumbers = number.split(" ");
// Insert the user-provided numbers into the heap
for (String num : inputNumbers) {
minHeap.add(Integer.parseInt(num));
}
// Print the heap after user insertions
System.out.println("Heap after user insertions: " + minHeap);
// Remove and print elements from the heap again
System.out.print("Elements removed from the heap: ");
removedElements.clear();
while (!minHeap.isEmpty()) {
removedElements.add(minHeap.poll());
}
// Print the removed elements again
for (int i = 0; i < removedElements.size(); i++) {
if (i != 0) {
System.out.print(" ");
}
System.out.print(removedElements.get(i));
}
in.close();
}
}