package interview201710.DataStructures.iterators;

import interview201710.DataStructures.abstracts.LinkedListIteratorAbstract;
import interview201710.DataStructures.LinkedListNode;

import java.util.*;

public class LinkedListIterator<E extends Comparable<E>> extends LinkedListIteratorAbstract<E> {

  public LinkedListIterator(LinkedListNode<E> head) {
    this.nextNode = head;
  }

  public boolean hasNext() {
    return this.nextNode != null;
  }

  public E next() {
    if(!hasNext()) throw new NoSuchElementException();
    LinkedListNode<E> curr = this.nextNode;
    this.nextNode = this.nextNode.next;
    return (E)curr.data;
  }
}
