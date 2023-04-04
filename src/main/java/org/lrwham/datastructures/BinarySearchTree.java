package org.lrwham.datastructures;

import java.util.Random;

public class BinarySearchTree <T extends Comparable<T>>{


    BinaryTreeNode<T> root;
    int size;

    public BinarySearchTree(){
        root = null; // new Node();
        size = 0;
    }

    public BinaryTreeNode<T> find(T data){
        if(root == null) return null;
        
        if(root.data == data) return root;

        BinaryTreeNode<T> currentNode = root;
        //boolean found = false;

        while(true){
            if(currentNode == null) return null;

            if(data.compareTo(currentNode.data) == 0){
                return currentNode;
            }
            else if(data.compareTo(currentNode.data) > 0){
                currentNode = currentNode.right;
            }else{
                currentNode = currentNode.left;
            }

        }
    }

    public BinaryTreeNode<T> findParent(T data){
        if(root == null) return null;
        
        if(root.data == data) return null;

        BinaryTreeNode<T> parentNode = null;
        BinaryTreeNode<T> currentNode = root;
        //boolean found = false;

        while(true){
            if(currentNode == null) return parentNode;

            if(data.compareTo(currentNode.data) == 0){
                return parentNode;
            }
            else if(data.compareTo(currentNode.data) > 0){
                parentNode = currentNode;
                currentNode = currentNode.right;
            }else{
                parentNode = currentNode;
                currentNode = currentNode.left;
            }

        }
    }

    public void remove(T data) {
        BinaryTreeNode<T> parentNode = findParent(data);
        BinaryTreeNode<T> nodeToRemove = parentNode.left.data == data ? parentNode.left : parentNode.right;

        if(nodeToRemove == null){

        }else if(nodeToRemove.left == null){

        }
    }

    public void insert(T data){
        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(data);

        if(root == null){
            root = newNode;
            size += 1;
            return; // early return
        }

        BinaryTreeNode<T> currentNode = root;
        boolean inserted = false;

        while(!inserted){
            if(newNode.data.compareTo(currentNode.data) > 0){
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    size += 1;
                    inserted = true;
                }else{
                    currentNode = currentNode.right;
                }
            } else {
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    size += 1;
                    inserted = true;
                }else{
                    currentNode = currentNode.left;
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Hello, World");

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        Random rng = new Random();

        for(int i = 0; i < 100; i++){
            bst.insert(rng.nextInt());
        }

        bst.insert(12);

        System.out.println(bst.size);

        BinaryTreeNode<Integer> currentNode = bst.root;

        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.right;
        }

        System.out.println(bst.find(12));

    }

}
