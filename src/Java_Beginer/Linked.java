package Java_Beginer;

public class Linked {
    Node head;
    int count;
    public void add(int value) {
        if (head == null) {
            head = new Node();
            head.value = value;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node tail = new Node();
            tail.value = value;
            current.next = tail;
        }
        count++;
    }

    public int get(int index) {
        int start = 0;
        Node current = head;
        while (start < index) {
            current = current.next;
            start++;
        }
        return current.value;
    }

    private Node getNode(int index){
        int start = 0;
        Node current = head;
        while (start < index) {
            current = current.next;
            start++;
        }
        return current;

    }

    public void deleteNode(int index){
        /*getNode(index-1).next = getNode(index).next;*/
        Node previous = getNode(index-1);
        Node toBeDelete = previous.next;
        previous.next = toBeDelete.next;
        count--;
    }

    public int getSize() {
        return count;
    }

    /*public void delete(int index) {
        int start = 0;
        Node current = head;
        while (start < index){
            current = current.next;
            start++;
        }
            while (start < count-1){
                current.value = current.next.value;
                current = current.next;
                start++;
            }
        count =- 1;
        }*/ //<---------------1

   /* public void delete(int index) {
        int start = 0;
        Node current = head;
        while (start < index){
            current = current.next;
            start++;
        }
        Node delete = new Node();
        delete.value = current.value;
        delete = current.next;
        System.out.println(delete.value + "------------------");
        start = 0;
        while (start < index){
            current = current.next;
            start++;
        }
        delete.next = current.next;
        current.value = delete.value;
        while (current.next != null){
            current = current.next;
        }
        count =- 1;
    }*/  // <---------------2

 /*   public void delete(int index) {
        int start = 0;
        int info = get(index);
        Node current = head;
        while (start < index+1){
            current = current.next;
            start++;
        }
        Node delete = new Node();
        delete.value = current.value;
        delete.next = current.next;
        start = 0;
        current = head;
        while (start < index-1){
            current = current.next;
            start++;
        }
        current.next = delete;
        while (current.next != null){
            current = current.next;
        }
        count =- 1;
        System.out.println(">>number-" + info + "-is delete-<<");
    }*/

  /*  public void delete(int index) {
        int start = 0;
        Node current = head;
        while (start < index) {
            current = current.next;
            start++;
        }
    }*/

    public void findMax() {
        int max = 0;
        Node current = head;
        while(current != null){
            current = current.next;
            max = current.value;
            if (current.value > max){
                max = current.value;
            }
        }
        System.out.println("" + max);
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }


    class Node {
        Node next;
        int value;

     /*   @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", value=" + value +
                    '}';
        }*/

    }

    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.add(9);
        linked.add(5);
        linked.add(3);
        linked.add(6);
        linked.add(7);
        linked.add(12);
        linked.add(19);
        linked.add(15);
        linked.print();
        System.out.println("----------------");
        linked.deleteNode(5);
        linked.print();

    }

}
