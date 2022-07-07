import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class database{

    Graph graph;
    public void InitialDataBase(){
        graph = new Graph();
        //graph.addtoHolder();

        //fixed data tree structure! don't change if have to;
        graph.addNode(new Node("Emotion", 0));//0
        graph.addNode(new Node("Positive", 0));//1
        graph.addNode(new Node("Negative", 0));//2
        graph.addNode(new Node("Very Positive", 0));//3
        graph.addNode(new Node("Ok Positive", 0));//4
        graph.addNode(new Node("Very Negative", 0));//5
        graph.addNode(new Node("Ok Negative", 0));//6
        graph.addNode(new Node("Happy", 0));//7
        graph.addNode(new Node("Ecstatic", 0));//8
        graph.addNode(new Node("Delighted", 0));//9
        graph.addNode(new Node("Euphoric", 0));//10
        graph.addNode(new Node("Excited", 0));//11
        graph.addNode(new Node("Thrilling", 0));//12
        graph.addNode(new Node("Overjoyed", 0));//13
        graph.addNode(new Node("Vibrant", 0));//14
        graph.addNode(new Node("Energetic", 0));//15
        graph.addNode(new Node("Cheerful", 0));//16
        graph.addNode(new Node("Lively", 0));//17
        graph.addNode(new Node("Enthusiastic", 0));//18
        graph.addNode(new Node("Caring", 0));//19
        graph.addNode(new Node("Content", 0));//20
        graph.addNode(new Node("Cool", 0));//21
        graph.addNode(new Node("Fine", 0));//22
        graph.addNode(new Node("Pleased", 0));//23
        graph.addNode(new Node("Glad", 0));//24
        graph.addNode(new Node("Pleasant", 0));//25
        graph.addNode(new Node("Satisfied", 0));//26
        graph.addNode(new Node("Appreciative", 0));//27
        graph.addNode(new Node("Friendly", 0));//28
        graph.addNode(new Node("Thoughtful", 0));//29
        graph.addNode(new Node("Loving", 0));//30
        graph.addNode(new Node("Depressed", 0));//31
        graph.addNode(new Node("Angry", 0));//32
        graph.addNode(new Node("Alienated", 0));//33
        graph.addNode(new Node("Hopeless", 0));//34
        graph.addNode(new Node("Empty", 0));//35
        graph.addNode(new Node("Beaten", 0));//36
        graph.addNode(new Node("Broken", 0));//37
        graph.addNode(new Node("Lost", 0));//38
        graph.addNode(new Node("Worhtless", 0));//39
        graph.addNode(new Node("Horrified", 0));//40
        graph.addNode(new Node("Terrified", 0));//41
        graph.addNode(new Node("Threatened", 0));//42
        graph.addNode(new Node("Scared", 0));//43
        graph.addNode(new Node("Worried", 0));//44
        graph.addNode(new Node("Lonely", 0));//45
        graph.addNode(new Node("Rejected", 0));//46
        graph.addNode(new Node("Embarassed", 0));//47
        graph.addNode(new Node("Guilty", 0));//48
        graph.addNode(new Node("Left out", 0));//49
        graph.addNode(new Node("Offended", 0));//50
        graph.addNode(new Node("Uncomfortable", 0));//51
        graph.addNode(new Node("Distant", 0));//52
        graph.addNode(new Node("Troubled", 0));//53
        graph.addNode(new Node("Sorry", 0));//54



        graph.addEdge(0,1); //root:emotion
        graph.addEdge(0,2); //
        graph.addEdge(1,3); //parent: positive;
        graph.addEdge(1,4);
        graph.addEdge(2,5); //parent: negative;
        graph.addEdge(2,6);
        graph.addEdge(3,7);  //start from very positive
        graph.addEdge(3,8);
        graph.addEdge(3,9);
        graph.addEdge(3,10);
        graph.addEdge(3,11);
        graph.addEdge(3,12);
        graph.addEdge(3,13);
        graph.addEdge(3,14);
        graph.addEdge(3,15);
        graph.addEdge(3,16);
        graph.addEdge(3,17);
        graph.addEdge(3,18);
        graph.addEdge(4,19);  //start from ok positive
        graph.addEdge(4,20);
        graph.addEdge(4,21);
        graph.addEdge(4,22);
        graph.addEdge(4,23);
        graph.addEdge(4,24);
        graph.addEdge(4,25);
        graph.addEdge(4,26);
        graph.addEdge(4,27);
        graph.addEdge(4,28);
        graph.addEdge(4,29);
        graph.addEdge(4,30);
        graph.addEdge(5,31);  //start from very negative
        graph.addEdge(5,32);
        graph.addEdge(5,33);
        graph.addEdge(5,34);
        graph.addEdge(5,35);
        graph.addEdge(5,36);
        graph.addEdge(5,37);
        graph.addEdge(5,38);
        graph.addEdge(5,39);
        graph.addEdge(5,40);
        graph.addEdge(5,41);
        graph.addEdge(5,42);
        graph.addEdge(6,43); //start from ok negative
        graph.addEdge(6,44);
        graph.addEdge(6,45);
        graph.addEdge(6,46);
        graph.addEdge(6,47);
        graph.addEdge(6,48);
        graph.addEdge(6,49);
        graph.addEdge(6,50);
        graph.addEdge(6,51);
        graph.addEdge(6,52);
        graph.addEdge(6,53);
        graph.addEdge(6,54);



    }


    public ArrayList<String> PrintBFSearch(Graph graph){
        return graph.BFS("Sorry");
    }
    public LinkedList<String> PrintDFSearch(Graph graph){
        return graph.DFS("sorry");
    }

    public void PrintEverything(Graph graph){
        //ArrayList<String> arrayList = new ArrayList<>(graph.DFS("sorry"));
        System.out.println(graph.BFS("sorry"));
        graph.DFS("Sorry");
    }
}