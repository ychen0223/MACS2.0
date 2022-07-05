
import java.util.*;
public class Graph {
    static ArrayList<LinkedList<Node>> alist;
    LinkedList<Node> Visited = new LinkedList<>();
    static ArrayList<String> beenthere = new ArrayList<>();
    Node current;
    Node next;
    static int i = 1; //dst
    static int x = 0; //src
    static Stack<Integer> lastvaildnode = new Stack<>();
    Stack<Node> stack;
    static ArrayList<String> holder = new ArrayList<>();

    Graph() {
        alist = new ArrayList<>();
        LinkedList<Node> Visited = new LinkedList<>();

    }

    public void addtoHolder() {
        holder.add("Emotion");
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node destnode = alist.get(dst).get(0);
        currentList.add(destnode);
    }

    public ArrayList<String> BFS(String emotion) {
        ArrayList<String> visitedpath = new ArrayList();
        for (LinkedList<Node> currentList : alist) {
            for (Node node : currentList) {
                if (node.Name == emotion) {
                    visitedpath.add(node.Name);
                    return visitedpath;
                } else if (node.Name != emotion && visitedpath.contains(node.Name)) {

                } else {
                    visitedpath.add(node.Name);
                }
            }
        }
        return visitedpath;
    }

    // Under-construction!
    //int i = 1; //dst
    //int x = 0; //src
    public static void dfs(String Emotion) {
        System.out.println("Key word is " + Emotion);
        System.out.println("searching in progress" + i + "," + x + "," + lastvaildnode);
        if (!GetNode(x, 0).getName().equalsIgnoreCase(Emotion)) {
            System.out.println("Current node name is " + GetNode(x, 0).getName());
            if (nochildren(x) == false) {
                if (checkEdge(x, i) == true) {
                    if (!holder.contains(GetNode(x, 0).getName())) {
                        if(!holder.contains(GetNode(i, 0).getName())){
                            holder.add(GetNode(x, 0).getName());
                            beenthere.add(GetNode(x, 0).getName());
                            System.out.println("holder is: " + holder);
                            System.out.println("beenthere is: " + beenthere);
                            lastvaildnode.add(x);
                            x = i;

                            i++;
                            Graph.dfs(Emotion);
                        }else{

                            i = x;
                            i++;
                            System.out.println("The children has no more children but the parents still do" + i + "," + x + "," + lastvaildnode);
                            Graph.dfs(Emotion);
                        }
                    } else {//we have already visited this node;

                        System.out.println("the node has been visited" + i + "," + x + "," + lastvaildnode);
                        x = lastvaildnode.pop();
                        i = x;
                        i++;
                        Graph.dfs(Emotion);
                    }
                } else {//there's no vaild edges from parents to the children;

                    i++;
                    System.out.println("there's no vaild edges from parents to the children" + i + "," + x + "," + lastvaildnode);
                    Graph.dfs(Emotion);
                }
            } else { //At leef, need to go back to the last visited node;
                holder.add(GetNode(x, 0).getName());
                x = lastvaildnode.pop();
                i = x;
                i++;

                System.out.println("The children has no more children" + i + "," + x + "," + lastvaildnode);
                Graph.dfs(Emotion);
            }
        }
        else { //if there's a match


            holder.add(GetNode(x, 0).getName());

            System.out.println("your got your match!" + i + "," + x + "," + lastvaildnode);

            System.out.println(holder);

        }
    }



		/*Stack<Node> stack = new Stack<Node>();
        stack.push(GetNode(0,0));
        System.out.println(stack.get(0).Name);
        System.out.println(checkEdge(0,0));

        System.out.println(current.Name);
        System.out.println(next.Name);

            /*while(!stack.isEmpty()) {
    				 node = stack.pop();
    				if(node.isvisited == false && node.getName() != Emotion) {

        				System.out.println(node.Name + " ");
        				node.visited();

    				}
    				if(node.isvisited == true && node.Name != Emotion) {
    					continue;
    				}

    				List<Node> adjacent = node.getAdj();
    				for(int i = 0; i < adjacent.size(); i++) {
    					Node n = adjacent.get(i);
    					if(n.isvisited == false && node.getName()== Emotion) {
    						stack.push(n);
    					}
    				}
    		}
    	}

    			 */


        public static boolean nochildren(int src){
        LinkedList<Node> currentList = alist.get(src);
        if(currentList.size() == 1)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean checkEdge(int src, int dst) {
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

    public static Node GetNode(int level, int nodeNum) {
        /*for(LinkedList<Node> currentList: alist){
            for(Node node: currentList){
                System.out.print(node.Name + " -> ");
            }

         */
            return alist.get(level).get(nodeNum);
        }

}
