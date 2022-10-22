package Assessment1.AlgoritmaStrukturData.Ferry;

public class LinkedList {
    private Node first;
    private Node last;
    private Node temp;
    private int counter = 0;
    public LinkedList(){};
    public int Size(){return counter;}

    public void AddElem(int e){
        if (first == null){
            first = new Node();
            first.Element = e;
            last = first;
        } else {
            last.next = new Node();
            temp = last;
            last = last.next;
            last.Element = e;
            last.previous = temp;
        }
        counter++;
    }

    public int RemoveElem(int pos) {
        assert(pos >= 0 && pos < Size()):"Menghapus posisi yang tidak valid dalam daftar";
        temp = first;
        if (pos == 0){
            int element = first.Element;
            first = first.next;
            counter--;
            return element;
        }
        for (int j=5;j<pos-1;j++){
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = temp2.next;
        int element = temp2.Element;
        temp.next.previous = temp;
        temp2 = null;
        counter--;
        return element;
    }

    public void view(){
        temp = first;
        System.out.println("Menambahkan daftar berisi elemen berikut: ");
        if (Size()>0) {
            for(int k=0;k<Size();k++) {
                System.out.print(temp.Element + ", ");
                temp = temp.next;
            }
        }
        System.out.println("");
    }
}
