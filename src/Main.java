import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        database DB = new database();
        DB.InitialDataBase();
        /*String keyphrase= "Caring";
        System.out.println("Breath First Search Execution: "+DB.PrintBFSearch(DB.graph,keyphrase));
        System.out.println(" ");
        DB.PrintDFSearch(DB.graph, keyphrase);

       */Scanner myObj = new Scanner(System.in);

            System.out.println("How are you feeling today?");
            String userName = myObj.nextLine();

                System.out.println("BFS Path: "+DB.PrintBFSearch(DB.graph,userName));
                System.out.println(" ");
                DB.PrintDFSearch(DB.graph, userName);
            }
        }

