package com.progressoft.utils.graph.unweighted;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnweightedGraph {

    interface VisitStatus {
        boolean value();
    }

    protected final ArrayList<Integer>[] adjacencyList;

    protected final VisitStatus[] nodeStatus;

    private final static VisitStatus VISITED = () -> true;

    private final static VisitStatus NOT_VISITED = () -> false;

    public UnweightedGraph(int maximumNumberOfNodes) {
        if (maximumNumberOfNodes <= 0)
            throw new InvalidNodesNumberException();
        this.adjacencyList = new ArrayList[maximumNumberOfNodes];
        this.nodeStatus = new VisitStatus[maximumNumberOfNodes];
        initializeGraph(maximumNumberOfNodes);
    }

    public void addDirectedEdge(int from, int to) {
        if (invalidNodeId(from) || invalidNodeId(to))
            throw new InvalidNodeIdException();
        adjacencyList[from - 1].add(to - 1);
    }

    public void clear() {
        for (int i = 0; i < adjacencyList.length; ++i) {
            adjacencyList[i].clear();
            nodeStatus[i] = NOT_VISITED;
        }
    }

    public void visit(int nodeId) {
        nodeStatus[nodeId - 1] = VISITED;
    }

    public boolean visitStatus(int nodeId) {
        return nodeStatus[nodeId - 1].value();
    }

    public Set<Integer> adjacencyOf(int nodeId) {
        Set<Integer> adjacency = new HashSet<>();
        for (int value : adjacencyList[nodeId - 1])
            adjacency.add(value + 1);
        return adjacency;
    }

    public int size() {
        return adjacencyList.length;
    }

    private void initializeGraph(int maximumNumberOfNodes) {
        for (int i = 0; i < maximumNumberOfNodes; ++i) {
            adjacencyList[i] = new ArrayList<Integer>();
            nodeStatus[i] = NOT_VISITED;
        }
    }

    private boolean invalidNodeId(int nodeId) {
        return nodeId <= 0 || nodeId > adjacencyList.length;
    }

    public static class InvalidNodesNumberException extends RuntimeException {
    }

    public static class InvalidNodeIdException extends RuntimeException {
    }
}
