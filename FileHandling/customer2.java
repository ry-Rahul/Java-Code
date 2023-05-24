import java.io.*;
import java.util.Scanner;
class customer implements Serializable
{
    String custID;
    String name;
    String phno;

    static int count = 1;

    customer() {

    }

    customer(String name, String phno) {
        custID = "C" + count;
        count++;
        this.name = name;
        this.phno = phno;
    }

    public String toString() {
        return "Customer ID: " + custID + "\nName: " + name + "\nPhone Number: " + phno;
    }
}

/**
 * customer2
 */
public class customer2 {

    // public static void main(String[] args) throws Exception {

    //     customer list[] = { new customer("rhaul", "9667459928"), new customer("rohit", "7548961235"),
    //             new customer("Harash", "9667459928") };

    //     FileOutputStream fos = new FileOutputStream("D:/Myjava/Customer.txt");
    //     ObjectOutputStream oos = new ObjectOutputStream(fos);

    //     oos.writeInt(list.length);
    //     for(customer c:list)
    //     {
    //         oos.writeObject(c);
    //     }
    //     oos.close();
    //     fos.close();
    // }

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("D:/Myjava/Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int len = ois.readInt();
        customer list[] = new customer[len];
        
        for (int i = 0; i < len; i++) {
            list[i] = (customer) ois.readObject();
        }
        System.out.println("Enter the name of the customer to be searched");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i = 0 ; i < len ; i++)
        {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }

        ois.close();
        fis.close();
    }
}