package com.tinkerpop.blueprints.pgm.oupls.sail;

import com.tinkerpop.blueprints.pgm.IndexableGraph;
import com.tinkerpop.blueprints.pgm.impls.datomic.DatomicGraph;

import java.util.UUID;

/**
 * @author Joshua Shinavier (http://fortytwo.net)
 */
public class DatomicGraphSailTest extends GraphSailTest {
    @Override
    protected IndexableGraph createGraph() {
        return new DatomicGraph("datomic:mem://tinkerpop"+ UUID.randomUUID());
    }
}
