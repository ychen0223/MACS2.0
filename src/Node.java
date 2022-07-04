public class Node {
	String Name;
    int weight;
    boolean isvisited;
 
    
    Node(String Info, int weight){
        this.Name = Info;
        this.weight = weight;

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

}