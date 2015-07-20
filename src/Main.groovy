//Test the binaryTree Project
binaryTree = new BinaryTree();

binaryTree.addNode(50, "fourth")
binaryTree.addNode(25, "third")
binaryTree.addNode(15, "second")
binaryTree.addNode(30, "first")
binaryTree.addNode(75, "fifth")
binaryTree.addNode(85, "sixth")

println "In Order Traversal"
binaryTree.inOrderTraversal(binaryTree.root, true)
println "Pre Order Traversal"
binaryTree.preOrderTraversal(binaryTree.root, true)
println "Post Order Traversal"
binaryTree.postOrderTraversal(binaryTree.root, true)
println "Search for 50 and 85"
println binaryTree.findNode(50).key
println binaryTree.findNode(85).key