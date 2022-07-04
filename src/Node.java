import java.util.*;


public class Node {
    String Name;
    int weight;
    boolean isvisited;
    List<Node> adjacent;

    Node(String Info, int weight){
        this.Name = Info;
        this.weight = weight;
        this.adjacent = new ArrayList<>();

    }
    public String getName() {
        return Name;
    }

    void visited() {
        isvisited = true;
    }

    void unvisited() {
        isvisited = false;
    }
    public List<Node> getAdj(){
        return adjacent;
    }

}