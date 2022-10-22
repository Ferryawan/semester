package semester3.ferry;

public class MainDoublylist {
    public static void main(String [] args) {
        DoublyLinkedList<Integer> doublyList = new DoublyLinkedList<>();
        doublyList.addFirst(15);
        doublyList.addFirst(16);
        doublyList.addFirst(17);
        doublyList.addFirst(18);
        doublyList.addFirst(20);
        doublyList.addLast(30);
        doublyList.addLast(45);

        System.out.println(doublyList.size());
        System.out.println(doublyList.first());
        System.out.println(doublyList.last());
        System.out.println(doublyList.removeFirst());
        System.out.println(doublyList.removeLast());
        System.out.println(doublyList.isEmpty());

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
    }
}
