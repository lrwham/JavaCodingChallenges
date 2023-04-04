package org.lrwham.datastructures;

public class BinaryTreeNode <T extends Comparable<T>>{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(){
        data = null;
        left = null;
        right = null;
    }

    public BinaryTreeNode(T data){
        this.data = data;
        left = null;
        right = null;
    }
}
