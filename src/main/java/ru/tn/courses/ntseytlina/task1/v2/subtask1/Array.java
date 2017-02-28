package ru.tn.courses.ntseytlina.task1.v2.subtask1;

import java.util.Iterator;

public class Array {
    private int [] array;
    private int size;

    public Array (int size) {
        this.size = size;
        array = new int[size];
    }

    public void fill () {
        for (int i = 0; i < this.size; i++) {
            array [i] = (int) ( Math.random() * 10 );
        }
    }

    public void setValue (int i, int value) {
        array [i] = value;
    }

    @Override
    public String toString() {
        String str = "Array: [ ";
        Iterator<Integer> iterator = new ArrayIteratorImpl();
        while (iterator.hasNext()) {
            str += iterator.next();
            if (iterator.hasNext()) {
                str += ", ";
            }
        }
        str += " ]";
        return str;
    }

    public Array getIndexesOfZeroElements () {
        Iterator<Integer> iterator = iterator();

        int counter = 0;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp == 0) {
                counter++;
            }
        }

        Array indexesArray = new Array(counter);
        iterator = iterator();
        int i = 0, j = 0;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp == 0) {
                indexesArray.setValue(i, j);
                i++;
            }
            j++;
        }

        return indexesArray;
    }

    public ArrayIteratorImpl iterator () {
        return new ArrayIteratorImpl();
    }

    public interface ArrayIterator extends Iterator<Integer> {

    }

    public class ArrayIteratorImpl implements ArrayIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            int value = array[index];
            index++;
            return value;
        }
    }
}
