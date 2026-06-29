class LRUCache {
    class Node{
        int key,value;
        Node prev,next;
        Node(int key, int value){ 
            this.key=key;
            this.value=value;   
        }
    }
    HashMap<Integer,Node> map;
    int capacity;
    Node head,tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head= new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    public void remove(Node node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insertAtFront(Node node)
    {
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node temp=map.get(key);
            remove(temp);
            insertAtFront(temp);
            return temp.value;
        }
        else
            return -1;        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node temp=map.get(key);
            temp.value=value;
            remove(temp);
            insertAtFront(temp);
        }
        else
        {
            if(map.size()==capacity)
            {
                Node temp=tail.prev;
                remove(temp);
                map.remove(temp.key);
            }
            
                Node t=new Node(key,value);
                map.put(key,t);
                insertAtFront(t);
            
        }

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */