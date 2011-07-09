package com.tinkerpop.blueprints.pgm;

/**
 * @author Joshua Shinavier (http://fortytwo.net)
 */
public interface WeightedCloseableSequence<T> extends CloseableSequence<T> {
    float currentWeight();
}
