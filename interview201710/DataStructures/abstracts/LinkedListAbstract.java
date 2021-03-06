package interview201710.DataStructures.abstracts;

import interview201710.DataStructures.LinkedListNode;
import interview201710.DataStructures.iterators.LinkedListIterator;

import java.util.*;

public abstract class LinkedListAbstract<E> implements Iterable<E> {
  public LinkedListNode<E> head;
  public LinkedListNode<E> tail;
  protected int size;

  public abstract void add(E data);
  public abstract E remove(E data);
  public abstract E removeByIndex(int index);
  public abstract void insert(int index, E data);
  public abstract boolean lookup(E data);
  public abstract E get(int index);

  public void addAll(LinkedListAbstract<E> ll) {
    for(E data : ll) add(data);
  }

  public int size() {
    return this.size;
  }

  public Iterator<E> iterator() {
    return new LinkedListIterator(this.head);
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    for(E data : this) {
      str.append(data);
      str.append(", ");
    }
    return str.toString();
  }
}
