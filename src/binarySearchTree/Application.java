package binarySearchTree;

public class Application {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10, "ten");
        tree.insert(20, "twenty");
        tree.insert(15, "fifteen");


        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);



    }
}
