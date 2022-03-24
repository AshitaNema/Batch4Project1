import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class TV {
    String brand;
    int size;
    int price;

    public TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
class Keyboard {
    String brand;
    String type;
    int price;

    public Keyboard(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }


    public String getType() {
        return type;
    }


    public int getPrice() {
        return price;
    }

}
class Mouse {
    String brand;
    String type;
    int price;

    public Mouse(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

}

class ElectronicShop {
    static String userName = "Batch4Project1";
    static String passWord = "Batch4@123";

    void Home() {
        System.out.println("Welcome to home page");
    }

    void Login(String inputuserName, String inputpassWord) {

        // TODO Auto-generated method stub

        if (inputuserName.equals(userName) && inputpassWord.equals(passWord)) {

            Home();
        } else {
            System.out.println("login credential are incorrect");
            System.exit(0);
        }

    }
}


public class Project1 {
    public static void main(String[] a) {
        Scanner scan  = new Scanner(System.in);


        TV t1 = new TV("Samsung",14,120000);
        TV t2 = new TV("LG",16,14000);

        Keyboard k1 = new Keyboard("Logitech","Wired",700);
        Keyboard k2 = new Keyboard("Intel","Wireless",1400);

        Mouse m1 = new Mouse("HP","USB",400);
        Mouse m2 = new Mouse("Dell","Bluetooth",600);

        System.out.println("Enter your username");

        String inputuserName=scan.next();
        System.out.println("Enter your password");
        String inputpassWord =scan.next();
        ElectronicShop obj=new ElectronicShop();
        obj.Login(inputuserName,inputpassWord);

        String upperCaseName = inputuserName.toUpperCase();

        System.out.println("Hello, " + upperCaseName + ", Welcome to Gadget Zone");

        SimpleDateFormat formatter = new SimpleDateFormat("\n dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println("Do you want to buy?? Enter 1 for Yes and 0 for No");
        int bn = scan.nextInt();
        if (bn == 1) {

            String[] electronics = new String[] {"1.Television","2.Keyboard","3.Mouse","4.Netbill"};
            for (int i=0; i<electronics.length; i++)
            {
                System.out.println(electronics[i]);
            }
        }
        else {
            System.out.println("You didn't buy anything!");
        }

        System.out.println("Do you want to buy these item. Press the number : ");
        int num = scan.nextInt();
        int total = 0;
        switch (num) {
            case 1:
                System.out.println("1."+
                        t1.getBrand()+" "+t1.getPrice()+" "+t1.getSize());
                System.out.println("2."+
                        t2.getBrand()+" "+t2.getPrice()+" "+t2.getSize());
                System.out.println("Press the number to buy : ");
                int item = scan.nextInt();
                switch (item) // nested switch
                {
                    case 1:
                        System.out.println("U Bought "+
                                t1.getBrand()+" "+t1.getPrice()+" "+t1.getSize());
                        total+= t1.getPrice();
                        break;
                    case 2:
                        System.out.println("U Bought "+
                                t2.getBrand()+" "+t2.getPrice()+" "+t2.getSize());
                        total+= t2.getPrice();
                        break;


                    default:
                        System.out.println(
                                "U didnt bought any item.");
                }
                break;
            case 2:
                System.out.println("1."+
                        k1.getBrand()+" "+k1.getPrice()+" "+k1.getType());
                System.out.println("2."+
                        k2.getBrand()+" "+k2.getPrice()+" "+k2.getType());
                System.out.println("Press the number to buy : ");
                int sitem = scan.nextInt();
                switch (sitem) // nested switch
                {
                    case 1:
                        System.out.println("U Bought "+
                                k1.getBrand()+" "+k1.getPrice()+" "+k1.getType());
                        total += k1.getPrice();
                        break;
                    case 2:
                        System.out.println("U Bought "+
                                k2.getBrand()+" "+k2.getPrice()+" "+k2.getType());
                        total += k2.getPrice();
                        break;


                    default:
                        System.out.println(
                                "U didnt bought any item.");
                }


        }

        System.out.println("Your total bill is: " + total);



    }
}
