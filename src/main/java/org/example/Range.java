package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {

    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(start);
    }

    private class RangeIterator implements Iterator<Integer> {

        private int next;

        public RangeIterator(int next) {
            this.next = next;
        }

        @Override
        public boolean hasNext() {
            return next <= end;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return next++;
        }
    }
}