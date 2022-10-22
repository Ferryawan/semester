package semester3.ferry;

class MianLinkedlist {
    public static void main (String [] args){
        SinglyLinkedList<Integer> singleList = new SinglyLinkedList<>();
        singleList.addFirst(12);
        singleList.addFirst(13);
        singleList.addFirst(14);
        singleList.addFirst(15);
        singleList.addFirst(16);

        System.out.println(singleList.size());
        System.out.println(singleList.first());
        System.out.println(singleList.last());

        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    }
}