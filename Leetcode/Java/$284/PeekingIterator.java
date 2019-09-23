package $284;

import java.util.Iterator;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:42 PM 9/23/19.
 */
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) {
            this.next = iterator.next();
        }

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer res = this.next;
        if (this.iterator.hasNext()) {
            this.next = this.iterator.next();
        } else {
            this.next = null;
        }
        return res;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}
