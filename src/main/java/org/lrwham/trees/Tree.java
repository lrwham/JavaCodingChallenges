// from the textbook

package org.lrwham.trees;
import java.util.Collection;

public interface Tree<E> extends Collection<E> {
    // return true if found
    public boolean search(E e);

    // Insert element, return true for success
    public boolean insert(E e);

    // delete element and return true for success
    public boolean delete(E e);

    public int getSize();
    public default void inorder(){}
    public default void postorder(){}
    public default void preorder(){}


    @Override
    public default boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public default boolean contains(Object e){
        return search((E)e);
    }

    @Override
    public default boolean add(E e){
        return insert(e);
    }

    @Override
    public default boolean remove(Object e){
        return delete((E)e);
    }

    @Override
    public default int size(){
        return getSize();
    }

    @Override
    public default boolean containsAll(Collection<?> c){
        // left as an exercise
        return false;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c){
        // left as an exercise
        return false;
    }

    @Override
    public default boolean removeAll(Collection<?> c){
        // left as an exercise
        return false;
    }

    @Override
    public default boolean retainAll(Collection<?> c){
        // left as an exercise
        return false;
    }

    @Override
    public default Object[] toArray(){
        // left as an exercise
        return null;
    }

    @Override
    public default <T> T[] toArray(T[] array){
        // left as an exercise
        return null;
    }

}
