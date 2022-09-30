package lldpractice.cachesystem.policies;

import lldpractice.cachesystem.algorithm.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class LRUEvictionPolicy implements EvictionPolicy{

    Map<String, DoublyLinkedListNode> mapper;
    DoublyLinkedListNode first;
    DoublyLinkedListNode last;

    public LRUEvictionPolicy() {
        this.mapper = new HashMap<>();
        this.first = null;
        this.last = null;
    }

    @Override
    public void keyAccessed(String key) {
        if(mapper.containsKey(key)){
            detachNode(mapper.get(key));
            addNodeAtLast(mapper.get(key));
        }else{
            DoublyLinkedListNode newNode = addElementAtLast(key);
            mapper.put(key, newNode);
        }
    }

    @Override
    public String evictKey(String key) {
        DoublyLinkedListNode firstNode = this.first;
        if(firstNode == null){
            return null;
        }
        detachNode(first);
        return first.key;
    }


    private void detachNode(DoublyLinkedListNode node){
        if(node == null){
            return;
        }
        if(node.equals(first)){
            first = first.next;
            if(first!=null){
                first.prev = null;
            }
        }else if(node.equals(last)){
            last = last.prev;
            if(last != null){
                last.next = null;
            }
        }else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    private void addNodeAtLast(DoublyLinkedListNode node){
        if(last == null){
            first = node;
            last = node;
        }else{
            node.prev = last;
            last.next = node;
            node.next = null;
            last = node;
        }
    }

    private DoublyLinkedListNode addElementAtLast(String key){
        DoublyLinkedListNode node = new DoublyLinkedListNode(key);
        addNodeAtLast(node);
        return node;
    }
}
