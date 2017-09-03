package com.progressoft.utils;

import org.junit.Test;

public class GraphTest {

    @Test
    public void canCreateAGraph() {
        new Graph(100);
    }

    @Test(expected = Graph.InvalidNodesNumber.class)
    public void creatingGraphWithNegativeNumberOfNodes_thenShouldThrowException() {
        new Graph(-1);
    }

}
