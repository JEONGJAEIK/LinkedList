package section1;

public class MySingleLinkedList<T> {

    public Node<T> head;
    public int size = 0;

    public MySingleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<T>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAfter(Node<T> before, T item) {
        Node<T> temp = new Node<T>(item);
        temp.next = before.next;
    }

    public void add(int index, T item) { // insert

    }

    public void remove(int index) {  // delete

    }

    public T get(int index) {
        return null;
    }

    public int indexOf(T item) {  // search
        return -1;
    }

    public static void main(String[] args) {

        MySingleLinkedList<String> list = new MySingleLinkedList<>();
        list.add(0,"Saturday");
        list.add(1,"Friday");
        list.add(0,"Monday");  // M, S, F
        list.add(2,"Tuesday");  // M, S, T, F

        String str = list.get(2);  //str = "Tuesday"
        list.remove(2);  // M, S, F
        int pos = list.indexOf("Friday");  //  pos = 2
    }
}
