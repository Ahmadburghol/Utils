package com.progressoft.utils;

public class Graph {

    public Graph(int maximumNumberOfNodes) {
        if(maximumNumberOfNodes<0)
            throw new InvalidNodesNumber();
    }

    public static class InvalidNodesNumber extends RuntimeException{
    }
}
