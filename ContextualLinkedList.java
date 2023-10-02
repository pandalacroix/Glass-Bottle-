import java.util.ListIterator;
/**
 * A linked list interface using a list iterator as its context for most operations
 * to make the implementation simple, the methods at the interface level are all accessors.
 * any modifications to the list must go through the list iterator
 */
public interface ContextualLinkedList<E> {
    /**
     * Returns the number of elements in this list.
     * @returns the number of elements in this list
     */
    public int size();
    /**
     * Returns <code>true</code> if this list contains to elements.
     * @return <code>true</code> if this list contains no elements
     */
    public boolean isEmpty();
    /**
     * returns<code>true</code> if this list contains the specified element.
     * @param o element whose presence in this list is to be tested
     * @return <code>true</code> if this list contains the specified element
     */
    public boolean contains(Object o);
    /**
     * Returns a list iterator over the elements in this list (in proper sequence),
     * stating at the specified position in the list.
     *
     * @param atHead if <code>true</code>, the cursor position of the list
     *               iterator will be positioned before the head so that the first element returned will be the head
     *               (by a call to <code>next</code>); otherwise the cursor position of the list iterator will be positioned
     *               after the tail so that the first element returned will be the tain(by a call to <code>previos</code>)
     * @return a ListIterator of the elements in this list (in proper sequence), starting at the specified position in the list
     */
    public ListIterator<E> listIterator(boolean atHead);
}
