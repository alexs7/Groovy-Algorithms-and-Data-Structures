class BinaryTree{

    Node root;

    def addNode(k,v){

        def newNode = new Node(key: k, value:v)

        if(!root){
            root = newNode
        }else{
            Node currentNode = root
            Node parent

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

}