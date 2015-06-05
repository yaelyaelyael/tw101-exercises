package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
        leftChild = null;
        rightChild = null;
    }


    //recursively finds the correct place to add a new node and adds it
    public void add(String nameOfNewNode) {

        int difference = nameOfNewNode.compareTo(name);

        if (difference <= 0) {
            this.leftChild = addToSubtree(nameOfNewNode, this.leftChild);
        }
        else if (difference > 0) {
            this.rightChild = addToSubtree(nameOfNewNode, this.rightChild);
        }
    }

    //adds new node to subtree
    private Node addToSubtree (String nameOfNewNode, Node newRoot) {
        if (newRoot == null) {
            return new Node(nameOfNewNode);
        }

        int difference = nameOfNewNode.compareTo(newRoot.name);

        if (difference <= 0) {
            newRoot.leftChild = addToSubtree(nameOfNewNode, newRoot.leftChild);
        }
        else if (difference > 0) {
            newRoot.rightChild = addToSubtree(nameOfNewNode, newRoot.rightChild);
        }
        return newRoot;
    }


    //returns the names of all of the nodes in alphabetical order
    public List<String> names() {
        ArrayList<String> nameList = new ArrayList<String>();
        return subtreeNames(this, nameList);
    }

    //returns the names of subtree nodes in alphabetical order
    public ArrayList<String> subtreeNames(Node root, ArrayList<String> nameList) {
        if (root != null) {
            subtreeNames(root.leftChild, nameList);
            nameList.add(root.name);
            subtreeNames(root.rightChild, nameList);
        }
        return nameList;
    }

}
