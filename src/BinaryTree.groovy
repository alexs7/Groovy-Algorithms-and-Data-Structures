class BinaryTree{

    MNode root;

    def addNode(k, v){

        def newNode = new MNode(key: k, value: v)

        if(!root){
            root = newNode
        }else{
            MNode currentNode = root
            MNode parent

            while(true){
                parent = currentNode
                if(k < currentNode.key) {
                    currentNode = currentNode.leftNode
                    if(!currentNode){
                        parent.leftNode = newNode
                        return
                    }
                } else {
                    currentNode = currentNode.rightNode
                    if(!currentNode){
                        parent.rightNode = newNode
                        return
                    }
                }
            }
        }
    }

    def inOrderTraversal(MNode node, boolean silent){
        if(node){
            inOrderTraversal(node.leftNode, silent)
            silent == false ?: println("MNode ${node.dump()}")
            inOrderTraversal(node.rightNode, silent)
        }
    }


}