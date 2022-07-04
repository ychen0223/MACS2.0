
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
    public Stack<String> dfs(String Emotion){
    	
		Stack<String> stack = new Stack<>();  
		
    	for(LinkedList<Node> currentlist: alist) {
    		for(Node node: currentlist) {  
    			String start = currentlist.get(0).getName();
    			stack.push(start);
    			
    			
    			while(!stack.isEmpty()) {

    				node.Name = stack.peek();   
    				stack.pop();
    				if(node.isvisited == false && node.Name != Emotion) {
    					stack.push(node.Name);
    					node.visited();
    					//stack.push(node.Name);
    				}
    				if(node.isvisited == true) {
						continue;
					}
    				
    				if(node.isvisited == false && node.Name == Emotion) {
    					System.out.println("Emotion found!");
    					stack.push(node.Name);
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
