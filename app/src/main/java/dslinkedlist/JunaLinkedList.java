package dslinkedlist;

// import org.w3c.dom.Node;

public class JunaLinkedList {
    JunaNode head;

    public JunaLinkedList(){
        head = null;
    }

    public void insertAtBeginning(int data) {
        JunaNode newNode = new JunaNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        JunaNode newNode = new JunaNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        JunaNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void display(){
        JunaNode current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public boolean search(int key) {
        JunaNode current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void delete(int key){
        if (head.data == key) {
            head = head.next;
            return;
        }

        JunaNode current = head;

        while (current.next.data != key){
            System.out.println("Angka "+key+" Belum Ketemu");
            current = current.next;
        }

        if(current.next == null){
            System.out.println("data tidak ditemuka");
        } else {
            // System.out.println("data ditemukan. nenghapus data ");
            current.next = current.next.next;
        }
    }
}