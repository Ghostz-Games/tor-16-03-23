package TaskTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData(){
        File file = new File("src/TaskTwo/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String output = scan.nextLine();
                coffeeMenu.add(output);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }

}
