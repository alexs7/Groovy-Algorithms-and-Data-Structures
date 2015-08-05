class MyBinaryTree{

    MNode root;

    public MBinaryTree(){
        root = null;
    }

    public MNode getRoot(){
        return root;
    }

    public void addNodeRecursivelyHelper(int val){
        root = addNodeRecursively(root,val);
    }

    private MNode addNodeRecursively(MNode node, int val){ //Node acts as a pointer here!
        if(!node){
            node = new MNode(val)
        }else{
            if(val <= node.value) {
                node.leftNode = addNodeRecursively(node.leftNode, val)
            }else{
                node.rightNode = addNodeRecursively(node.rightNode, val)
            }
        }

        return node
    }

    public void addNode(int val){
        println "Adding ${val}"
        MNode node = new MNode(val);

        if(root == null){
            root = node;
            return;
        }else{
            MNode newParent = root
            while(true){
              if(node.value < newParent.value){
                if(newParent.leftNode == null){
                    newParent.leftNode = node
                    return;
                }else{
                    newParent = newParent.leftNode
                }
              }else{
                  if(newParent.rightNode == null){
                      newParent.rightNode = node
                      return;
                  }else{
                      newParent = newParent.rightNode
                  }
              }
            }
        }
    }

    public void inOrderTraversal(MNode node){
        if(node) { //because of the children might be null
            inOrderTraversal(node.leftNode)
            println "MNode ${node.value}"
            inOrderTraversal(node.rightNode)
        }
    }

    public void preOrderTraversal(MNode node){
        if(node) { //because of the children might be null
            println "MNode ${node.value}"
            preOrderTraversal(node.leftNode)
            preOrderTraversal(node.rightNode)
        }
    }

    public void postOrderTraversal(MNode node){
        if(node) { //because of the children might be null
            postOrderTraversal(node.leftNode)
            postOrderTraversal(node.rightNode)
            println "MNode ${node.value}"
        }
    }

    private class MNode{
        MNode leftNode;
        MNode rightNode;
        int value;

        public MNode(int val){
            value = val;
        }
    }

};

MyBinaryTree binaryTree = new MyBinaryTree();
binaryTree.addNodeRecursivelyHelper(50)
binaryTree.addNodeRecursivelyHelper(25)
binaryTree.addNodeRecursivelyHelper(15)
binaryTree.addNodeRecursivelyHelper(30)
binaryTree.addNodeRecursivelyHelper(75)
binaryTree.addNodeRecursivelyHelper(85)
println "In Order Traversal"
binaryTree.inOrderTraversal(binaryTree.root)
println "Pre Order Traversal"
binaryTree.preOrderTraversal(binaryTree.root)
println "Post Order Traversal"
binaryTree.postOrderTraversal(binaryTree.root)