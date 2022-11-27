package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeWithStep implements Iterable<Integer>{
    private final int start;
    private final int end;
    private final int step;

    public RangeWithStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIteratorWithStep(start);
    }

    private class RangeIteratorWithStep implements Iterator<Integer> {

        private int next;

        public RangeIteratorWithStep(int next) {
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
            Integer element = next;
            next += step;
            return element;
        }
    }
}
