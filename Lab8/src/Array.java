/**
 * Created by alayn on 11/1/2016.
 */
public class Array<T extends Comparable<T>> {
    private T[] a;
    private int length;
    public Array(){
        length = 5;
        a = (T[]) new Comparable[5];
    }
    public Array(int initSize){
        if(initSize <= 0){
            throw new IllegalArgumentException("Array length is <= 0");
        }
        else {
            length = initSize;
            a = (T[]) new Comparable[initSize];
        }
    }
    public T get(int index){

        return a[index];
    }
    public void set(int index, T item){
        a[index] = item;
    }
    public String toString(){
        String contents = "";
        for(int i = 0; i<a.length; i++){
            contents += a[i];
            if(i != a.length - 1){
                contents += ",";
            }
        }
        return contents;
    }
    public int length(){
        return a.length;
    }
    public int count(){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] != null){
                count++;
            }
        }
        return count;
    }
    public void compress(){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] != null){
                count++;
            }
        }
        T[] cpyA = (T[]) new Comparable[count];
        int cA = 0;
        int cCA = 0;
        while(cCA < count){
            if(a[cA] != null){
                cpyA[cCA] = a[cA];
                cCA ++;
            }
            cA++;
        }
        a = cpyA;
    }
    public void reverse(){
        T[] b = (T[]) new Comparable[length];
        for(int i = 0; i<a.length; i++){
            b[i] = a[a.length - i - 1];
        }
        a = b;
    }
    public void shuffle(){
        T temp;
        for(int i = 0; i<a.length; i++) {
            int rand = (int) Math.floor(Math.random() * (a.length - 1));
            temp = a[i];
            a[i] = a[rand];
            a[rand] = temp;
        }
    }
    public boolean equals(Array<T> array2){
        boolean tf = false;
        int count = 0;
        if(length != array2.length){
            tf = false;
        }
        else{
            for(int i = 0; i<length; i++){
                if(a[i] == null){
                    if(array2.get(i) == null){
                        count ++;
                    }
                    else{
                        tf = false;
                    }
                }
                if(a[i] == array2.get(i)){
                    count++;
                }
            }
            if(count == length){
                tf = true;
            }
        }
        return tf;
    }
    public void resize(int newSize){
        if(newSize < length){
            throw new IllegalArgumentException("Must increase size, not decrease size");
        }
        else {
            length = newSize;
            T[] b = (T[]) new Comparable[length];
            for(int i = 0; i<a.length; i++){
                b[i] = a[i];
            }
            a = b;
        }
    }
    public Array<T> slice(int startIndex, int endIndex){
        Array<T> b = null;
        if(startIndex<0 || endIndex > length-1 || endIndex < startIndex){
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        else{
            b = new Array<T>(endIndex - startIndex + 1);
            int cA = startIndex;
            int cB = 0;
            while(cB < b.length()){
                b.set(cB, a[cA]);
                cB++;
                cA++;
            }
        }
        return b;
    }
    public T[] sort(){
        compress();
        if(a.length == 1){
            return a;
        }
        else{
            Array front = slice(0, length/2 - 1);
            Array back = slice(length/2, length-1);
            T[] f = (T[]) front.sort();
            T[] b = (T[]) back.sort();
            return merge(f,b);
        }
    }
    public T[] merge(T[] array1, T[] array2){
        T[] finalArray = (T[]) new Comparable[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< array1.length && j<array2.length){
            if(array1[i].compareTo(array2[j])<0){
                finalArray[k] = array1[i];
                i++;
                k++;
            }
            else{
                finalArray[k] = array2[j];
                j++;
                k++;
            }
        }
        for(i=i;i<array1.length;i++){
            finalArray[k] = array1[i];
            k++;
        }
        for(j=j; j<array2.length; j++){
            finalArray[k] = array2[j];
            k++;
        }
        return finalArray;
    }


    public static void main(String[] args) {
        Array array = new Array(6);
        array.set(0, "a");
        array.set(1, "b");
        array.set(2, "c");
        array.set(3, "d");
        array.set(4, "e");
        array.set(5, "f");
        System.out.println("Array:");
        System.out.println(array);
        System.out.println("Array value at 0: " + array.get(0));
        System.out.println("Length of array: " + array.length());
        System.out.println("Number of non-null values in array: " + array.count());

        Array a1 = new Array();
        for(int i=0; i<a1.length(); i++){
            if(i%2 != 0){
                a1.set(i,null);
            }
            else{
                a1.set(i,i-5);
            }
        }
        System.out.println("a1:");
        System.out.println(a1);
        System.out.println("a1 reversed:");
        a1.reverse();
        System.out.println(a1);
        System.out.println("a1 shuffled:");
        a1.shuffle();
        System.out.println(a1);
        a1.compress();
        System.out.println("a1 compressed:");
        System.out.println(a1);

        System.out.println("Are array and a1 equal?");
        System.out.println(array.equals(a1));
        System.out.println("Resize a1 from 3 to 10");
        a1.resize(10);
        System.out.println("Length of a1: " + a1.length());
        for(int i = 3; i<a1.length(); i++){
            a1.set(i,i);
        }
        System.out.println("a1: " + a1);
        System.out.println("Sort:");
        a1.sort();
        System.out.println(a1);
        System.out.println("Slice a1 from index 1 to index 5");
        System.out.println(a1.slice(1,5));
    }

}
