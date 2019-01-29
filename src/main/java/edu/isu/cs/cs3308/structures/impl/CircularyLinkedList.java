package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.List;

public class CircularyLinkedList<E> implements List<E> {

    protected Node<E> head;
    protected Node<E> tail;
    protected int size;

    List<E> cll;

    public CircularyLinkedList(){
        cll = new SinglyLinkedList<>();
        if(!this.isEmpty()) this.tail.setNextNode(this.head);
    }

    /**
     * @return first element in the list or null if the list is empty.
     */
    @Override
    public E first() {
        return cll.first();
    }

    /**
     * @return last element in the list or null if the list is empty.
     */
    @Override
    public E last() {
        return cll.last();
    }

    /**
     * Adds the provided element to the end of the list, only if the element is
     * not null.
     *
     * @param element Element to be added to the end of the list.
     */
    @Override
    public void addLast(E element) {
        cll.addLast(element);

    }

    /**
     * Adds the provided element to the front of the list, only if the element
     * is not null.
     *
     * @param element Element to be added to the front of the list.
     */
    @Override
    public void addFirst(E element) {
        cll.addFirst(element);
    }

    /**
     * Removes the element at the front of the list.
     *
     * @return Element at the front of the list, or null if the list is empty.
     */
    @Override
    public E removeFirst() {
        return cll.removeFirst();
    }

    /**
     * Removes the element at the end of the list.
     *
     * @return Element at the end of the list, or null if the list is empty.
     */
    @Override
    public E removeLast() {
        return cll.removeLast();
    }

    /**
     * Inserts the given element into the list at the provided index. The
     * element will not be inserted if either the element provided is null or if
     * the index provided is less than 0. If the index is greater than or equal
     * to the current size of the list, the element will be added to the end of
     * the list.
     *
     * @param element Element to be added (as long as it is not null).
     * @param index   Index in the list where the element is to be inserted.
     */
    @Override
    public void insert(E element, int index) {
        cll.insert(element, index);

    }

    /**
     * Removes the element at the given index and returns the value.
     *
     * @param index Index of the element to remove
     * @return The value of the element at the given index, or null if the index
     * is greater than or equal to the size of the list or less than 0.
     */
    @Override
    public E remove(int index) {
        return cll.remove(index);
    }

    /**
     * Retrieves the value at the specified index. Will return null if the index
     * provided is less than 0 or greater than or equal to the current size of
     * the list.
     *
     * @param index Index of the value to be retrieved.
     * @return Element at the given index, or null if the index is less than 0
     * or greater than or equal to the list size.
     */
    @Override
    public E get(int index) {
        return cll.get(index);
    }

    /**
     * @return The current size of the list. Note that 0 is returned for an
     * empty list.
     */
    @Override
    public int size() {
        return cll.size();
    }

    /**
     * @return true if there are no items currently stored in the list, false
     * otherwise.
     */
    @Override
    public boolean isEmpty() {
        return cll.isEmpty();
    }

    /**
     * Prints the contents of the list in a single line separating each element
     * by a space to the default System.out
     */
    @Override
    public void printList() {
        cll.printList();
    }

    /**
     * Identifies the 0-based index of the given item in the list. If the item does
     * not exist in the list or is null, then returns -1.
     *
     * @param item Item to search for
     * @return 0 based index of the provided item
     */
    @Override
    public int indexOf(E item) {

        if(this.isEmpty()) return -1;
        Node<E> currentNode = head;
        int indexCounter = 0;
        while(currentNode.getData() != item && indexCounter < this.size){
            currentNode = currentNode.getNextNode();
            indexCounter++;
        }
        if(indexCounter > this.size) return -1;
        else return indexCounter;
    }
}
