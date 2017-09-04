package com.progressoft.utils.dfs;

import com.progressoft.utils.graph.unweighted.UnweightedGraph;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanReachTest {

    private CanReach canReach;

    @Before
    public void setUp() {
        UnweightedGraph graph = new UnweightedGraph(10);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(2, 3);
        graph.addDirectedEdge(3, 1);
        graph.addDirectedEdge(3, 4);
        graph.addDirectedEdge(5, 10);
        graph.addDirectedEdge(5, 1);
        graph.addDirectedEdge(4, 5);
        canReach = new CanReach(graph);
    }

    @Test(expected = CanReach.InvalidGraphException.class)
    public void creatingCanReachWithNullGraph_thenShouldThrowException() {
        new CanReach(null);
    }


    @Test(expected = CanReach.InvalidNodeIdException.class)
    public void givenCanReach_whenCallingExecuteWithZeroFromNode_thenShouldThrowException() {
        canReach.execute(0, 5);
    }

    @Test(expected = CanReach.InvalidNodeIdException.class)
    public void givenCanReach_whenCallingExecuteWithNegativeFromNode_thenShouldThrowException() {
        canReach.execute(-1, 5);
    }

    @Test(expected = CanReach.InvalidNodeIdException.class)
    public void givenCanReach_whenCallingExecuteWithZeroToNode_thenShouldThrowException() {
        canReach.execute(5, 0);
    }

    @Test(expected = CanReach.InvalidNodeIdException.class)
    public void givenCanReach_whenCallingExecuteWithNegativeToNode_thenShouldThrowException() {
        canReach.execute(5, -1);
    }

    @Test(expected = CanReach.InvalidNodeIdException.class)
    public void givenCanReach_whenCallingExecuteWithFromNodeGreaterThanGraphSize_thenShouldThrowException() {
        canReach.execute(100, 5);
    }

    @Test(expected = CanReach.InvalidNodeIdException.class)
    public void givenCanReach_whenCallingExecuteWithToNodeGreaterThanGraphSize_thenShouldThrowException() {
        canReach.execute(5, 100);
    }

    @Test
    public void givenCanReach_whenCallingExecuteWithSourcemNodeThatCanReachTargetNode_thenShouldReturnTrue() {
        assertTrue(canReach.execute(1, 10));
    }

    @Test
    public void givenCanReach_whenCallingExecuteWithSourcemNodeThatCanReachTargetNode_2_thenShouldReturnTrue() {
        assertTrue(canReach.execute(1, 5));
    }

    @Test
    public void givenCanReach_whenCallingExecuteWithSourcemNodeThatCanReachTargetNode_3_thenShouldReturnTrue() {
        assertTrue(canReach.execute(1, 3));
    }

    @Test
    public void givenCanReach_whenCallingExecuteWithSourcemNodeThatCanReachTargetNode_4_thenShouldReturnTrue() {
        assertTrue(canReach.execute(1, 1));
    }

    @Test
    public void givenCanReach_whenCallingExecuteWithSourcemNodeThatCantReachTargetNode_thenShouldReturnFalse() {
        assertFalse(canReach.execute(1, 9));
    }

}
