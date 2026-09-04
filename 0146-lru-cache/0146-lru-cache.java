import java.util.*;
class LRUCache{
    class Node{
        int key,val;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    HashMap<Integer,Node> map=new HashMap<>();
    Node head,tail;
    int capacity;
    LRUCache(int capacity){
        this.capacity=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    void add(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public int get(int key){
        if(!map.containsKey(key))return -1;
        Node node=map.get(key);
        remove(node);
        add(node);
        return node.val;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            remove(node);
            add(node);
            return;
        }
        Node node=new Node(key,value);
        map.put(key,node);
        add(node);
        if(map.size()>capacity){
            Node lru=tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */