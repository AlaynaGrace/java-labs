/**
 * Created by alayn on 11/29/2016.
 */
public class BiasedQueue {
    Node<String> n,start;
    int length;
    public BiasedQueue(){
        start = new Node<String>(null,null);
        n = start;
        length = 0;
    }
    public void enqueue(String o){
        if(o == null){
            RuntimeException e = new RuntimeException("Object is null");
            throw e;
        }
        else {
            if(o.equals("Budger")){
                n = start;
                Node<String> t;
                for(int i = 0; i<length; i++){
                    n = n.getNext();
                }
                Node<String> fin = n.getNext();
                t = new Node<String>(o,fin);
                n.setNext(t);
                n = fin;
            }
            else {
                Node<String> t = new Node<String>(o,null);
                n.setNext(t);
                n = n.getNext();
            }
            System.out.println(n.getData());
            length++;
        }
    }
    public String dequeue(){
        if(length == 0){
            throw new RuntimeException("Stack is empty");
        }
        else {
            Node<String> d = start;
            int c = 0;
            for(int i = 0; i<length; i++){
                System.out.println(d.getData());
                if(d.getData().equals("Budger")){
                    c++;
                }
                d = d.getNext();
            }
            if(c == length){
                Node<String> temp = start.getNext();
                start.setNext(start.getNext().getNext());
                length--;
                return (String) temp.getData();
            }
            else{
                Node<String> temp = d.getNext();
                d.setNext(d.getNext().getNext());
                length--;
                return (String) temp.getData();
            }

            //Node temp = start.getNext();
            //start.setNext(start.getNext().getNext());
        }
    }
    public String peek(){
        return (String) start.getNext().getData();
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
//        BiasedQueue bq = new BiasedQueue();
//        bq.enqueue("Budger");
//        bq.enqueue("Budger");
//        bq.enqueue("Ron");
//        bq.enqueue("Little-Sebastian");
//        bq.enqueue("Leslie");
//        while(!bq.isEmpty()){
//            System.out.println(bq.dequeue());
//        }
    }
}
