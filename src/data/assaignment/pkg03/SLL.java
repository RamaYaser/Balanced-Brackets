
package data.assaignment.pkg03;

public class SLL {
    
    node head;
    node tail;
    int size;

    protected boolean isEmpty(){
        if(head == null)
            return true;
        return false;
    }

    public void insertToHead(int x){
        if (isEmpty()){
            head = new node();
            head.data = x;
            head.next = null;
            tail = head;
            size++;
        }
        else {
            node node = new node();
            node.data = x;
            node.next = head;
            head = node;
            size++;
        }
    }
        public int deleteFromHead(){
        if(!isEmpty()){
            int x = head.data;
            if(head == tail)
                head = tail = null;
            else
                head = head.next;
            size--;
            return x;
        }
        return -1;
    }
}
