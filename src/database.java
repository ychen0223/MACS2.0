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
        graph.addNode(new Node("Happiness", 0));//7
        graph.addNode(new Node("Energy", 0));//8
        graph.addNode(new Node("Confidence", 0));//9
        graph.addNode(new Node("Caring", 0));//10
        graph.addNode(new Node("Anger", 0));//11
        graph.addNode(new Node("Fear", 0));//12
        graph.addNode(new Node("Tired", 0));//13
        graph.addNode(new Node("Depression", 0));//14

        graph.addEdge(0,1); //root:emotion
        graph.addEdge(0,2); //
        graph.addEdge(1,3); //parent: positive;
        graph.addEdge(1,4);
        graph.addEdge(2,5); //parent: negative;
        graph.addEdge(2,6);
        graph.addEdge(3,7); //parent:Very Positive;
        graph.addEdge(3,8);
        graph.addEdge(4,9); // parent: Ok positive;
        graph.addEdge(4,10);
        graph.addEdge(5,11);//parent Very negative;
        graph.addEdge(5,12);
        graph.addEdge(6,13);//parent ok Negative;
        graph.addEdge(6,14);
        
    }
    

    public void PrintBFSearch(Graph graph){
        System.out.println(graph.BFS("Very Positive"));
    }
    public void PrintDFSearch(Graph graph){
       graph.DFS("Happiness"); 
    }

}
