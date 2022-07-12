
import java.util.*;
import java.util.Random;
public class Graph {
	LinkedList<String> path = new LinkedList<String>();
	boolean found;

    LinkedList<String> pathholder;
    String Message;
	
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
        String holder = "";
        for (LinkedList<Node> currentList : alist) {
            for (Node node : currentList) {
                if (node.Name.equalsIgnoreCase(emotion)) {
                    visitedpath.add(node.Name);
                    return visitedpath;
                } else if (!node.Name.equalsIgnoreCase(emotion) && visitedpath.contains(node.Name)) {

                } else {
                    visitedpath.add(node.Name);
                }
                //holder = node.getResponse();
            }
        }
      //  System.out.println(holder);
        return visitedpath;
    }
    
    private LinkedList<Node> getCorrLinkList(Node node) {
        for(LinkedList<Node> list : alist) {
    		if(list.get(0) == node) {
    			return list;
    		}
    	}
    	return null;//===null
    	
    }
    

    public LinkedList<String> DFS (String emotion) {
    	// set all nodes to unvisited
    	found = false;
    	DFShelper(alist.get(0).get(0), emotion);
    	return path;
    	
    }
    
    public void DFShelper (Node node, String emotion) {  	
    	if(found) {
    		return;
    	}
    	node.visited();
    	path.add(node.Name);
    	if(node.Name.equalsIgnoreCase(emotion)) {

    		//System.out.println("The Depth First Search Path is as follows: "+ path);
            System.out.println("DFS Path: "+ path);

            if(path.contains("Ok Negative")){
                OkBadSuggestion();
            } else if (path.contains("Very Negative")) {
                BadSuggestion();
            } else if (path.contains("Ok Positive")) {
                OkGoodSuggestion();
            } else {
                GoodSuggestion();
            }
            found = true;

    	}
    	LinkedList<Node> currList = getCorrLinkList(node);
		int currListSize = currList.size();
		if(currListSize >  1) {
			for(int i = 1; i < currList.size(); i++) {
				if(!(currList.get(i)).isvisited) {
					DFShelper(currList.get(i), emotion);
				}
				
			}
		}
        //path.removeLast();
		
    }
    
    
    public int rand(){
        Random random = new Random();
        int x = random.nextInt(3);
        return x;
    }

    public void GoodSuggestion(){ //Very Good Suggestion;
        ArrayList<String> news = new ArrayList<>();
        news.add("I am happy for you! Maybe you should go for a hike!");
        news.add("WOOOH, you should drag your friends out for shopping!");
        news.add("Nice! Share your mood with your families and friends!");
        news.add("Ain't that nice! keep up the motivation and go for a run!");
        System.out.println(" ");
        System.out.println(news.get(rand()));
    }

    public void OkGoodSuggestion(){//Good Suggestion;
        ArrayList<String> news = new ArrayList<>();
        news.add("Do a bubble bath! its fun :)");
        news.add("Think about your future! you are on track, stay precision and you are close to your goals!");
        news.add("I see you like Taylor Swift, you should check out her folklore album!");
        news.add("Thinking about past trips, your trip with alex to Hawaii was amazing!");
        System.out.println(" ");
        System.out.println(news.get(rand()));
    }

    public void OkBadSuggestion(){//Ok Negative Suggestion;
        ArrayList<String> news = new ArrayList<>();
        news.add("I know you might not be feeling your best right now, but know that you matter and it will all be okay!");
        news.add("Try going on a walk! It will hopefully clear your mind.");
        news.add("Dont worry, you will get past this. You got it!");
        news.add("Why dont you try going out and try meeting new people? It will help you feel better.");
        System.out.println(" ");
        System.out.println(news.get(rand()));
    }

    public void BadSuggestion(){//Very Negative Suggestion;
        ArrayList<String> news = new ArrayList<>();
        news.add("I hope you feel better soon! here is a stand up show that will bring joy to you!");
        news.add("Hop on computer, your friends are waiting for you!");
        news.add("Go for a run, if you feel better physcally you will feel better mentally too!");
        news.add("Try reading a book, it will take you to a better place mentally!");
        System.out.println(" ");
        System.out.println(news.get(rand()));

    }
    
    

/*
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
