/**
 * Created by alayn on 11/8/2016.
 */
public class Queue<T extends Comparable<T>> {
    Node n,start;
    int length;
    public Queue(){
        start = new Node(null,null);
        n = start;
        length = 0;
    }
    public void enqueue(T o){
        if(o == null){
            RuntimeException e = new RuntimeException("Object is null");
            throw e;
        }
        else {
            n.setNext(new Node(o, null));
            n = n.getNext();
            length++;
        }
    }
    public T dequeue(){
        if(length == 0){
            throw new RuntimeException("Stack is empty");
        }
        else {
            Node temp = start.getNext();
            start.setNext(start.getNext().getNext());
            return (T) temp.getData();
        }
    }
    public T first(){
        return (T) start.getNext().getData();
    }
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Is it empty?: " + q.isEmpty());
        //q.enqueue(null);
        for(int i =0; i<8; i++){
            q.enqueue(i);
        }
        System.out.println("Still empty?: " + q.isEmpty());
        System.out.println("What's first?: " + q.first());
        System.out.println("Let's remove that");
        System.out.println(q.dequeue());
        System.out.println("Now what's first?: " + q.first());
    }
}
