package com.progressoft.utils.graph.unweighted;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnweightedGraphTest {

    @Test
    public void canCreateAGraph() {
        new UnweightedGraph(100);
    }

    @Test(expected = UnweightedGraph.InvalidNodesNumberException.class)
    public void creatingGraphWithNegativeNumberOfNodes_thenShouldThrowException() {
        new UnweightedGraph(-1);
    }

    @Test(expected = UnweightedGraph.InvalidNodesNumberException.class)
    public void creatingGraphWithZeroNumberOfNodes_thenShouldThrowException() {
        new UnweightedGraph(0);
    }

    @Test(expected = UnweightedGraph.InvalidNodeIdException.class)
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodesAndFirstNodeIsZero_thenShouldThrowException() {
        UnweightedGraph graph = new UnweightedGraph(100);
        graph.addDirectedEdge(0,5);
    }

    @Test(expected = UnweightedGraph.InvalidNodeIdException.class)
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodesAndFirstNodeIsNegative_thenShouldThrowException() {
        UnweightedGraph graph = new UnweightedGraph(100);
        graph.addDirectedEdge(-1,5);
    }

    @Test(expected = UnweightedGraph.InvalidNodeIdException.class)
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodesAndSecondNodeIsZero_thenShouldThrowException() {
        UnweightedGraph graph = new UnweightedGraph(100);
        graph.addDirectedEdge(5,0);
    }

    @Test(expected = UnweightedGraph.InvalidNodeIdException.class)
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodesAndSecondNodeIsNegative_thenShouldThrowException() {
        UnweightedGraph graph = new UnweightedGraph(100);
        graph.addDirectedEdge(5,-1);
    }

    @Test(expected = UnweightedGraph.InvalidNodeIdException.class)
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodesAndFirstNodeIsGreaterThanGraphSize_thenShouldThrowException() {
        UnweightedGraph graph = new UnweightedGraph(100);
        graph.addDirectedEdge(101,5);
    }

    @Test(expected = UnweightedGraph.InvalidNodeIdException.class)
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodesAndSecondNodeIsGreaterThanGraphSize_thenShouldThrowException() {
        UnweightedGraph graph = new UnweightedGraph(100);
        graph.addDirectedEdge(5,101);
    }

    @Test
    public void creatingGraph_whenAddDirectedEdgeBetweenTwoNodes_thenTheEdgeShouldBeExists() {
        UnweightedGraphSpy graphSpy = new UnweightedGraphSpy(100);
        graphSpy.addDirectedEdge(5,10);
        assertTrue(graphSpy.isEdgeExists(5,10));
    }

    @Test
    public void creatingGraphWithEdgeBetweenFiveAndTen_whenClear_thenTheEdgeShouldBeRemoved() {
        UnweightedGraphSpy graphSpy = new UnweightedGraphSpy(100);
        graphSpy.addDirectedEdge(5,10);
        graphSpy.clear();
        assertFalse(graphSpy.isEdgeExists(5,10));
    }

}
