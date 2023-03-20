import java.util.LinkedList;

public class Main {
    public static LinkedList reverseList(LinkedList list) {
        LinkedList reversedList = new LinkedList();
    
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
    
        return reversedList;
    }
    
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
    
        LinkedList reversedList = reverseList(list);
        System.out.println(reversedList);
    }
}