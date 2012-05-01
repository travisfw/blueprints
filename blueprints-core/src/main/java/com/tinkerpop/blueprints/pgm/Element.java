package com.tinkerpop.blueprints.pgm;

import java.io.InputStream;

/**
 * An element is the base class for both vertices and edges.
 * An element has an identifier that must be unique to its inheriting classes (vertex or edges).
 * An element can maintain a collection of key/value properties.
 * Keys are always strings and values can be any object.
 * Particular implementations can reduce the space of objects that can be used as values.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public abstract interface Element {

    /**
     * Return the object value associated with the provided string key.
     *
     * @param key the key of the key/value property
     * @return the object value related to the string key
     */
    public Iterable<InputStream> getProperty(InputStream key);

    /**
     * Return all the keys associated with the element.
     *
     * @return the set of all string keys associated with the element
     */
    public Iterable<InputStream> getPropertyKeys();

    /**
     * Assign a key/value property to the element.
     * If a value already exists for this key, then the previous key/value is overwritten.
     *
     * @param key   the string key of the property
     * @param value the object value o the property
     */
    public void setProperty(InputStream key, InputStream value);

    /**
     * Unassigns a key/value property from the element.
     * The values of the removed properties are returned.
     *
     * @param key the key of the property to remove from the element
     * @return the values associated with that key prior to removal
     */
    public Iterable<InputStream> removeProperty(InputStream key);

    /**
     * Unassigns a key/value property from the element.
     *
     * @param key the key of the property to remove from the element
     * @param val the value to remove
     */
    public void removeProperty(InputStream key, InputStream val);

    /**
     * An identifier that is unique to its inheriting class.
     * All vertices of a graph must have unique identifiers.
     * All edges of a graph must have unique identifiers.
     *
     * @return the identifier of the element
     */
    public Object getId();

}
