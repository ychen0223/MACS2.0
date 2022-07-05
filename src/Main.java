import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        database DB = new database();
        DB.InitialDataBase();
        DB.PrintBFSearch(DB.graph);
        DB.PrintDFSearch(DB.graph);
        MyFrame frame = new MyFrame(DB);

    }

}