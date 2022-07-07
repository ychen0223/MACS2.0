import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        database DB = new database();
        DB.InitialDataBase();
       DB.PrintEverything(DB.graph);
        MyFrame frame = new MyFrame(DB);

    }

}