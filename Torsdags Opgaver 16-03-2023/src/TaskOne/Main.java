package TaskOne;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args){

        customers.add(new Customer("Nicklas", "Winther", "NokIkNick"));
        customers.add(new Customer("Lars", "Peter", "Petercoolgut"));
        customers.add(new Customer("Morten", "Pedersen", "Pedersen21"));
        customers.add(new Customer("Ditte", "Larsen", "dittensen"));
        customers.add(new Customer("Paula", "Laursen", "P.Laus"));
        customers.add(new Customer("Snicklas", "Swinther", "yahooman"));
        printCustomers();
    }

    public static void printCustomers(){
        for(Customer c : customers){
            System.out.println(c);
        }
    }

}
