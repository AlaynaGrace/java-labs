/**
 * Created by alayn on 10/11/2016.
 */
public class Contact {
    private String name;
    private long phone;
    private String address;
    private String comments;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public long getPhone(){
        return phone;
    }
    public void setPhone(long newPhone){
        phone = newPhone;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public String getComments(){
        return comments;
    }
    public void setComments(String newComments){
        comments = newComments;
    }
    public String toString(){
        return name + "\n" + phone + "\n" + address + "\n" + comments;
    }

//    public boolean equals(Contact o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Contact contact = (Contact) o;
//
//        if (phone != contact.phone) return false;
//        if (name != null ? !name.equals(contact.name) : contact.name != null) return false;
//        if (address != null ? !address.equals(contact.address) : contact.address != null) return false;
//        return comments != null ? comments.equals(contact.comments) : contact.comments == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (int) (phone ^ (phone >>> 32));
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (comments != null ? comments.hashCode() : 0);
//        return result;
//    }

        public boolean equals(Contact c){
        boolean tf = false;
        if(name == c.getName() && phone == c.getPhone() && address == c.getAddress() && comments == c.getComments()){
            tf = true;
        }
        return tf;
    }
    public static void main(String[] args){
        Contact contact = new Contact();
        contact.setName("Alayna");
        contact.setPhone(8951071);
        contact.setAddress("1234 Main St");
        contact.setComments("She's cool");
        System.out.println(contact);

        Contact c = new Contact();
        c.setName("Paul");
        c.setPhone(8951071);
        c.setAddress("1111 Main St");
        c.setComments("He's cool too I guess");

        Contact c2 = new Contact();
        c2.setName("Alayna");
        c2.setPhone(8951071);
        c2.setAddress("1234 Main St");
        c2.setComments("She's cool");

        if(contact.equals(c)){
            System.out.println("contact == c");
        }
        else{
            System.out.println("contact != c");
        }
        if(contact.equals(c2)){
            System.out.println("contact == c1");
        }
        else{
            System.out.println("contact != c1");
        }


    }

}
