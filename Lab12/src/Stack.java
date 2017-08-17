public class Stack<T extends Comparable<T>> {
    T[] stack;
    public Stack(){
        stack = (T[]) new Comparable[2];
    }
    public void push(T o){
        if(o == null){
            RuntimeException e = new RuntimeException("Object is null");
            throw e;
        }
        else{
            int count = 0;
            for(int i = 0; i<stack.length;i++){
                if(stack[i] != null){
                    count++;
                }
            }
            if(count == stack.length){
                T[] temp = (T[]) new Comparable[stack.length * 2];
                for(int i = 1; i<stack.length; i++){
                    temp[i] = stack[i-1];
                }
                temp[0] = o;
                stack = temp;
            }
            else{
                T[] t = (T[]) new Comparable[stack.length];
                for(int i = 1; i<stack.length; i++){
                    t[i] = stack[i-1];

                }
                t[0] = o;
                stack = t;
            }
        }
    }
    public T pop(){
        if(isEmpty()){
            RuntimeException e = new RuntimeException("Stack is empty");
            throw e;
        }
        else {
            T temp = stack[0];
            for (int i = 1; i < stack.length; i++) {
                stack[i - 1] = stack[i];
            }
            return temp;
        }
    }
    public T top(){
        if(stack[0] == null){
            return null;
        }
        else{
            return stack[0];
        }
    }
    public boolean isEmpty(){
        int count = 0;
        for(int i = 0; i<stack.length; i++){
            if(stack[i] == null){
                count++;
            }
        }
        if(count == stack.length){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("Is the stack empty: " + s.isEmpty()); //true
        //System.out.println("Pop while empty: " + s.pop());
        for(int i = 0; i<8; i++){
            s.push(i);
        }
        System.out.println("Now is it empty?: " + s.isEmpty()); //False
        System.out.println("What is on top?: " + s.top()); //Should be 7
        System.out.println("Let's remove the top and look at it: " + s.pop());
        System.out.println("Now what's at the top?: " + s.pop()); //Should be 6
    }
}
