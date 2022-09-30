package lldpractice.cachesystem.algorithm;

public class DoublyLinkedListNode {

    public String key;
    public DoublyLinkedListNode prev;
    public DoublyLinkedListNode next;

    public DoublyLinkedListNode(String key) {
        this.key = key;
        this.prev = null;
        this.next =null;
    }
}
