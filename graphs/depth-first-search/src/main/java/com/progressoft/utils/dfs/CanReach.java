package com.progressoft.utils.dfs;

import com.progressoft.utils.graph.unweighted.UnweightedGraph;

import static java.util.Objects.*;

public class CanReach {

    private final UnweightedGraph graph;

    public CanReach(UnweightedGraph graph) {
        if (isNull(graph))
            throw new InvalidGraphException();
        this.graph = graph;
    }

    public boolean execute(int from, int to) {
        if (invalidNodeId(from) || invalidNodeId(to))
            throw new InvalidNodeIdException();
        return dfs(from, to);
    }

    private boolean dfs(int src, int target) {
        graph.visit(src);
        boolean canReach = src == target;
        for (int child : graph.adjacencyOf(src))
            if (!graph.visitStatus(child))
                canReach |= dfs(child, target);
        return canReach;
    }

    private boolean invalidNodeId(int nodeId) {
        return nodeId <= 0 || nodeId > graph.size();
    }

    public static class InvalidGraphException extends RuntimeException {
    }

    public static class InvalidNodeIdException extends RuntimeException {
    }
}
