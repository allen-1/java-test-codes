package files;

import java.io.File;
import java.util.Scanner;

public class Files {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count <= 3)
        {
            System.out.println("Input name of file to test if it is in the location: ");
            File Location = new File("/home/agozie/NetBeansProjects/Files/src/files/" + scan.nextLine());
            if (Location.exists())
            {
                System.out.println(Location.getName() + " exists");
            }
            else
            {
                System.out.println(Location.getName() + " does not exist");
            }
            count += 1;
        }
        /*
        File x = new File("/home/agozie/NetBeansProjects/Files/src/files/activity.txt");
        if (x.exists())
        {
            System.out.println(x.getName() + " exists");
        }
        else
        {
            System.out.println(x.getName() + " does not exist");
        }*/
    }

}
