/**
 * Created by alayn on 10/11/2016.
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class ContactList {
    private static Contact[] contactArray;
    int ptr = -1;
    public ContactList(int arrayLen){
        contactArray = new Contact[arrayLen];
    }
    public ContactList(){
        contactArray = new Contact[20];
    }
    public boolean add(Contact c){
        boolean tf = false;
        if(ptr + 1 < contactArray.length){
            contactArray[ptr + 1] = c;
            ptr++;
            tf = true;
        }
        return tf;
    }
    public Contact find(String name){
        Contact found = null;
        int i = 0;
        for(i = ptr; i<contactArray.length; i++){
            if(contactArray[i].getName().equals(name)){
                found = contactArray[i];
                ptr = i;
            }
        }
        if(found == null && i == contactArray.length){
            for(i = 0; i<contactArray.length; i++){
                if(contactArray[i].getName().equals(name)){
                    found = contactArray[i];
                    ptr = i;
                }
            }
        }
        return found;
    }
    public Contact remove(){
        Contact removed = null;
        Contact[] ca = new Contact[contactArray.length];
        if(ptr>= contactArray.length){
            ptr--;
        }
        for(int i=0;i<ca.length; i++){
            if(i != ptr){
                ca[i] = contactArray[i];
            }
        }
        contactArray = ca;
        for(int i =0; i<ca.length; i++){
            System.out.println(ca[i]);
        }
        return removed;
    }
    public boolean write(String fileName){
        boolean tf = false;
        PrintWriter p = null;
        try{
            p = new PrintWriter(new File(fileName));
            tf = true;
        }catch (Exception e){tf = false;}
            for(int i = 0; i<contactArray.length; i++) {
                p.println(contactArray[i]);
                p.println();
        }
        p.close();
        return tf;
    }
    public boolean read(String fileName){
        boolean tf = false;
        Scanner s = null;
        try{
            s = new Scanner(new File(fileName));
            tf = true;
        } catch (Exception e){tf = false;}
            while(s.hasNext()) {
                System.out.println(s.nextLine());
        }
        return tf;
    }
    public Contact getCurrent(){
        return contactArray[ptr];
    }
    public Contact get(int i){
        Contact contact = null;
        if(i >= contactArray.length){
            contact = null;
        }
        else{
            contact = contactArray[i];
        }
        return contact;
    }
    public Contact next(){
        Contact contact = null;
        ptr++;
        if(ptr >= contactArray.length){
            ptr = 0;
            contact = contactArray[ptr];
        }
        if(ptr< contactArray.length){
            contact = contactArray[ptr];
        }
        int count = 0;
        for(int i = 0; i<contactArray.length;i++){
            if(contactArray[i] == null){
                count++;
            }
        }
        if(count == contactArray.length){
            contact = null;
        }
        return contact;
    }
    public Contact previous(){
        Contact contact = null;
        ptr--;
        if(ptr < 0){
            ptr = contactArray.length - 1;
            contact = contactArray[ptr];
        }
        else{
            contact = contactArray[ptr];
        }
        int count = 0;
        for(int i = 0; i<contactArray.length;i++){
            if(contactArray[i] == null){
                count++;
            }
        }
        if(count == contactArray.length){
            contact = null;
        }
        return contact;
    }
    public void sort(){
        Contact temp;
        int counter = 0;
        boolean swapped = true;
        for(int i = 0; i<contactArray.length && swapped;i++){
            swapped = false;
            for(int j = 1; j<contactArray.length - i; j++){
                counter++;
                temp = contactArray[j];
                if(temp.getName().compareTo(contactArray[j-1].getName()) < 0){
                    swapped=true;
                    temp = contactArray[j];
                    contactArray[j] = contactArray[j-1];
                    contactArray[j-1] = temp;
                }
            }
        }

    }

    public static void main(String[] args){
        ContactList cl = new ContactList(3);
        System.out.println("Array len = 3");
        Contact contact = new Contact();
        contact.setName("John");
        contact.setPhone(8951071);
        contact.setAddress("1234 Main St");
        contact.setComments("He's cool");
        System.out.println("Added 1st contact?");
        System.out.println(cl.add(contact));
        System.out.println();

        Contact c = new Contact();
        c.setName("Paul");
        c.setPhone(8951071);
        c.setAddress("1111 Main St");
        c.setComments("He's cool too I guess");
        System.out.println("Added 2nd contact?");
        System.out.println(cl.add(c));
        System.out.println();

        Contact c2 = new Contact();
        c2.setName("Alayna");
        c2.setPhone(8951071);
        c2.setAddress("1234 Main St");
        c2.setComments("She's cool");
        System.out.println("Added 3rd contact?");
        System.out.println(cl.add(c2));
        System.out.println();

        Contact c3 = new Contact();
        c3.setName("Andrew");
        c3.setPhone(8951071);
        c3.setAddress("1234 Main St");
        c3.setComments("He's cool");
        System.out.println("Added 4th contact?");
        System.out.println(cl.add(c3));
        System.out.println();

        String file = "Lab5Test.txt";
        System.out.println("Read and write:");
        cl.write(file);
        cl.read(file);
        System.out.println();

        System.out.println("Find 'Alayna':");
        System.out.println(cl.find("Alayna"));
        System.out.println();

        System.out.println("getCurrent:");
        System.out.println(cl.getCurrent());
        System.out.println();

        System.out.println("get (index = 1):");
        System.out.println(cl.get(1));
        System.out.println();

        System.out.println("next:");
        System.out.println(cl.next());
        System.out.println();

        System.out.println("previous:");
        System.out.println(cl.previous());
        System.out.println();

        System.out.println("Sort:");
        cl.sort();
        for(int i = 0; i<contactArray.length;i++){
            System.out.println(contactArray[i]);
        }
        System.out.println();

        System.out.println("Remove:");
        System.out.println(cl.remove());

    }
}
