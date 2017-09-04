package com.progressoft.utils.graph.unweighted;

public class UnweightedGraphSpy extends UnweightedGraph {

    public UnweightedGraphSpy(int maximumNumberOfNodes) {
        super(maximumNumberOfNodes);
    }

    public boolean isEdgeExists(int from,int to) {
        return adjacencyList[from-1].contains(to-1);
    }

    public boolean isNodeVisited(int nodeId) {
        return nodeStatus[nodeId-1].value();
    }
}
