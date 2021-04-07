package com.conceptfactory.problems.lists;

/*
 * We are given the head of a linked list and a key. We have to delete the node that contains this given key.
 * Input : 7 -> 14 -> 21 -> 28 -> 35 -> 42 -> NULL key : 28
 * Output : 7 -> 14 -> 21 -> 35 -> 42 -> NULL
 *
 * Input : 7 -> 14 -> 21 -> 28 -> 35 -> 42 -> NULL key : 7
 * Output : 14 -> 21 -> 28 -> 35 -> 42 -> NULL
 */
public class DeleteNodeSinglyLinkedList {


    public static void main(String[] args) {
        Node head = createList(new int[] { 42, 35, 28, 21, 14, 7 });

        System.out.println(head);
//        System.out.println(deleteNodeFromList(head, 21));
//        System.out.println(deleteNodeFromList(head, 7));
        System.out.println(deleteNodeFromList(head, 42));
    }

    private static Node deleteNodeFromList(Node node, int key) {
        if (node == null) { return null; }

        if (node.val == key) {
            return node.next;
        } else {
            node.next = deleteNodeFromList(node.next, key);
            return node;
        }
    }

    private static Node createList(int[] vals) {
        Node head = null;
        for (int val : vals) {
            Node n = new Node(val);
            n.next = head;
            head = n;
        }

        return head;
    }

}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return val + " -> " + next;
    }
}
