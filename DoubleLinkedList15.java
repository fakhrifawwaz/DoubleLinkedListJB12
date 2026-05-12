public class DoubleLinkedList15 {
    Node15 head;
    Node15 tail;

    public DoubleLinkedList15() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa15 data) {
        Node15 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node15 newNode = new Node15(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node15 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("----------------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("=== Tampil Terbalik (Tail → Head) ===");
        Node15 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("----------------------------");
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang dihapus.");
            return;
        }
        System.out.println("Data yang dihapus:");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus dari awal.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang dihapus.");
            return;
        }
        System.out.println("Data yang dihapus:");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus dari akhir.");
    }
}