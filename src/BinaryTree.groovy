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

    public MNode findNode(int nodeKey){
        MNode currentNode = root;

        while( nodeKey != currentNode.key ){
            if(nodeKey < currentNode.key){
                currentNode = currentNode.leftNode
            }
            if(nodeKey > currentNode.key){
                currentNode = currentNode.rightNode
            }
            if(currentNode == null){ // not found
                return null
            }
        }

        return currentNode
    }


    def inOrderTraversal(MNode node, boolean silent){
        if(node){
            inOrderTraversal(node.leftNode, silent)
            silent == false ?: println("MNode ${node.key}")
            inOrderTraversal(node.rightNode, silent)
        }
    }

    def preOrderTraversal(MNode node, boolean silent){
        if(node){
            silent == false ?: println("MNode ${node.key}")
            preOrderTraversal(node.leftNode, silent)
            preOrderTraversal(node.rightNode, silent)
        }
    }

    def postOrderTraversal(MNode node, boolean silent){
        if(node){
            postOrderTraversal(node.leftNode, silent)
            postOrderTraversal(node.rightNode, silent)
            silent == false ?: println("MNode ${node.key}")
        }
    }


}