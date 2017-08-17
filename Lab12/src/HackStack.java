/**
 * Created by alayn on 11/29/2016.
 */
public class HackStack<T extends Comparable<T>> {
    private Stack s = new Stack();
    public void push(T element){
        s.push(element);
    }
    public T pop(){
        return (T) s.pop();
    }
    public T peek(){
        return (T) s.top();
    }
    public T pop(int n){
        Stack temp = new Stack();
        for(int i = 0; i<n; i++){
            temp.push(s.pop());
        }
        T t = (T) s.pop();
        for(int i = 0; i<n; i++){
            s.push(temp.pop());
        }
        return t;
    }

    public static void main(String[] args) {
        HackStack hs = new HackStack();
        for(int i = 0; i<10; i++){
            hs.push(i);
        }
        System.out.println(hs.pop(5));
    }
}
