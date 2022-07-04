
import java.util.*;
public class Graph{
    ArrayList<LinkedList<Node>> alist;
    LinkedList<Node> Visited = new LinkedList<>();
    Graph(){
        alist = new ArrayList<>();
        LinkedList<Node> Visited = new LinkedList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node destnode = alist.get(dst).get(0);
        currentList.add(destnode);
    }
    public ArrayList<String> BFS(String emotion){
        ArrayList<String> visitedpath = new ArrayList();
        for(LinkedList<Node> currentList: alist) {
            for (Node node : currentList) {
                if (node.Name == emotion ) {
                    visitedpath.add(node.Name);
                    return visitedpath;
                }
                else if(node.Name != emotion && visitedpath.contains(node.Name)){

                    }
                else{
                    visitedpath.add(node.Name);
                }
            }
        }
        return visitedpath;
    }

    // Under-construction!
    public Stack<Node> dfs(String Emotion){
    	
		Stack<Node> stack = new Stack<Node>(); 
		
    	for(LinkedList<Node> currentlist: alist) {
    		for(Node node: currentlist) {  
    			
    			stack.push(node);
    			
    			while(!stack.isEmpty()) {

    				Node current = stack.pop();
    				if(current.isvisited == false && current.getName() != Emotion) {
    					
        				System.out.println(current.Name + " ");
        				current.visited();
    						
    				}
    				if(current.isvisited == true) {
    					continue;
    				}

    				List<Node> adjacent = current.getAdj();
    				for(int i = 0; i < adjacent.size(); i++) {
    					Node n = adjacent.get(i);
    					if(n.isvisited == false ) {
    						stack.push(n);
    					}
    				}
    							
    							    				    				
    			} 			 				
    				
    		}
    	}
    	return stack;
    		}

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node destnode = alist.get(dst).get(0);
        for (Node node : currentList) {
            if (node == destnode) {
                return true;
            }
        }
        return false;
    }
        public void print () {
         for(LinkedList<Node> currentList: alist){
             for(Node node: currentList){
                 System.out.print(node.Name + " -> ");
             }
             System.out.println(" ");
        }


         
    }

    public void printSFN (int level, int nodeNum) {
        /*for(LinkedList<Node> currentList: alist){
            for(Node node: currentList){
                System.out.print(node.Name + " -> ");
            }

         */
            System.out.print(alist.get(level).get(nodeNum).Name + " ");
            System.out.println(" ");
        }

}
