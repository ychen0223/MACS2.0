public class Node {
    String Name;
    int weight;
    boolean isvisited;
 
    
    Node(String Info, int weight){
        this.Name = Info;
        this.weight = weight;

    }
    
    void visited() {
    	isvisited = true;
    }
    
    void unvisited() {
    	isvisited = false;
    }
}