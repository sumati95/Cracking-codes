public class KthElement {
    public static void main(String[] args) {
        Node2 head = new Node2(1);
        head.next = new Node2(2);
        head.next.next = new Node2(7);
        head.next.next.next = new Node2(3);
        head.next.next.next.next = new Node2(25);
        head.next.next.next.next.next = new Node2(11);
        head.next.next.next.next.next.next = new Node2(23);
        head.next.next.next.next.next.next.next = new Node2(31);
        head.next.next.next.next.next.next.next.next = new Node2(12);
        kthToLast(head, 2);
        kElement(head, 6);
    }

    static void print(Node2 head) {
        Node2 ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    static void kElement(Node2 head, int k) {
        Node2 p1 = head;
        Node2 p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1 == null) {
                return;
            }
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println(p2.value);
    }

    static int kthToLast(Node2 head, int k) {
        if (head == null) {
            return 0;
        }
        int index = kthToLast(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.value);
        }
        return index;
    }
}

class Node2 {
    Node2 next;
    int value;
    Node2(int v) {
        value = v;
    }
}