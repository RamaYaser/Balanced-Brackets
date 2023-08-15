
package data.assaignment.pkg03;


public class Stack {
    SLL s=new SLL();
    public void push(int val){
        s.insertToHead(val);
    }
    public int top(){
        return s.head.data;
    }
    public int pop(){
        return s.deleteFromHead();
    }
    public boolean isEmpty(){
        return s.isEmpty();
    }
    public int size (){
        return s.size;
    }
    
    
}
