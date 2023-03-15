package TaskOne;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int count = 0;


    public Customer(String firstName, String lastName, String username){

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = count;
        count++;

    }


    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUserName(){
        return this.username;
    }

    public int getId(){
        return this.id;
    }


    @Override
    public String toString(){
        return this.firstName+" "+this.lastName+". Username: "+this.username+" "+this.id;
    }


}
