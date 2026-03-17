/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
        // Map to store original -> clone mapping
   HashMap<Node, Node> map=new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node==null)return null;
        map.clear();
        // create clone of starting node
       Node cloneNode=new Node(node.val);
       map.put(node,cloneNode);

        // DFS
        dfs(node,cloneNode);
       

       return cloneNode;
    }

    private void dfs(Node node, Node cloneNode) {
        
         for(Node neighbor:node.neighbors){
            // if neighbor not cloned yet
           if(!map.containsKey(neighbor)){
              Node newClone=new Node(neighbor.val);
              map.put(neighbor,newClone);
              cloneNode.neighbors.add(newClone);
              dfs(neighbor,newClone);
            } else {
                // already cloned → just connect
                cloneNode.neighbors.add(map.get(neighbor));
                
            }
        }
    }

}