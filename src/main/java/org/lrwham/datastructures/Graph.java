package org.lrwham.datastructures;
import java.util.ArrayList;
public interface Graph<V> {
    public int getSize();
    public ArrayList<V> getVertices();
    public V getVertx(int index);
    public int getIndex(V vertex);
    public ArrayList<V> getNeighbors(int index);
    public int getDegree(int index);
    public void printEdges();
    public void clear();
    public boolean addVertex(V vertex);
    public boolean addEdge(V u, V v);

}
