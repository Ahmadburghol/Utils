package com.progressoft.utils.graph.unweighted;

import java.util.ArrayList;

public class UnweightedGraph {

    protected ArrayList<Integer> [] adjacencyList;

    public UnweightedGraph(int maximumNumberOfNodes) {
        if(maximumNumberOfNodes<=0)
            throw new InvalidNodesNumberException();
        initializeAdjacencyList(maximumNumberOfNodes);
    }

    public void addDirectedEdge(int from, int to) {
        if(invalidNodeId(from) || invalidNodeId(to))
            throw new InvalidNodeIdException();
        adjacencyList[from-1].add(to-1);
    }

    public void clear() {
        for(int i = 0; i< adjacencyList.length; ++i)
            adjacencyList[i].clear();
    }

    private void initializeAdjacencyList(int maximumNumberOfNodes) {
        adjacencyList = new ArrayList[maximumNumberOfNodes];
        for(int i = 0; i< adjacencyList.length; ++i)
            adjacencyList[i] = new ArrayList<Integer>();
    }

    private boolean invalidNodeId(int nodeId) {
        return nodeId <= 0 || nodeId > adjacencyList.length;
    }

    public static class InvalidNodesNumberException extends RuntimeException{
    }

    public static class InvalidNodeIdException extends RuntimeException{
    }
}
