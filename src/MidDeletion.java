public class MidDeletion {
    public static void main(String[] args) {
        Node3 head = new Node3(2);
        head.next = new Node3(1);
        head.next.next = new Node3(4);
        head.next.next.next = new Node3(8);
        head.next.next.next.next = new Node3(5);
        delMiddleNode(head);
        print(head);
    }

    static void print(Node3 head) {
        Node3 ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    static boolean delMiddleNode(Node3 head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node3 ptr = head.next;
        head.value = ptr.value;
        head.next = ptr.next;
        return true;
    }
}

class Node3 {
    Node3 next;
    int value;
    Node3(int v) {
        value = v;
    }
}

