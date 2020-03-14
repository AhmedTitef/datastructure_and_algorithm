package binarySearchTree;

public class BST {
    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node( key, value );
        if (root == null) {
            root = newNode;
        } else {
            Node current = root; //transvering all over the tree
            Node parent; //parent of the current node;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {   //its parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else { //key is bigger
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin() {
        Node current = root; //we starting from the top of binary tree
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root; //we starting from the top of binary tree
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {

        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        //searching to find the node with the key to delete

        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                //means it is left child
                isLeftChild = true;
                currentNode = currentNode.leftChild;


            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;//we talking about right child
            }

            if (currentNode == null) {//not found
                return false;
            }

            //what if the key is found at the very first(root)
            //then we exit the while loop and proceed

        }

        //after that top code we found the node

        Node nodeToDelete = currentNode;


        //if node is a leaf (has no child)

        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            //
            if (nodeToDelete == root) {
                root = null;

            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }

            //if node has one child that is on the left
        } else if (nodeToDelete.rightChild == null) {//it means root node of this subtree has one side which is the leftchild
            if (nodeToDelete == root) {
                root = nodeToDelete.leftChild;

            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild; //parent node that was the parent of child we wanted to delete we need to change the left child to the parent


            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }

        }
        //if node we want to delete has one child that is on the right
        else if (nodeToDelete.leftChild == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.rightChild;

            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild; //parent node that was the parent of child we wanted to delete we need to change the left child to the parent


            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        } else {  //if node has two children(trickiest)
            Node successor = getSuccessor( nodeToDelete );

            //connect parent of nodetodelete to sucessor instead

            if (nodeToDelete == root) {
                root = successor;

            } else if (isLeftChild) {
                parentNode.leftChild = successor;

            } else {
                parentNode.rightChild = successor;
            }

            successor.leftChild = nodeToDelete.leftChild;  //doing the actual replacement// successor is the min value of that subtree we trying to move

        }


        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        //this method is private since it is only going to be used in one exclusive function

        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;
        Node current = nodeToDelete.rightChild;
        while (current != null){
            successorParent = successor;
        }
        return successor;
    }
}
