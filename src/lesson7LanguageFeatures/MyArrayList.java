package lesson7LanguageFeatures;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private Object[] list;
    private int capacity;
    private int length;

    public MyArrayList() {
        this(3);

    }
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        list = new Object[capacity];
    }

    private void ensureCapacity() {
        if (length >=  capacity) {
            capacity = (int) (capacity * 1.5);
            Object[] tmp = new Object[capacity];

            for (int i = 0; i < list.length; i++) {
                tmp[i] = list[i];
            }
            list = tmp;
        }
    }

    public void add(T item) {
        ensureCapacity();
        list[length++] = item;
    }

    public T get(int index) {
        if (index >= length) {
            throw new IndexOutOfBoundsException("");
        }
        return (T) list[index];
    }

    public T remove(int index) {
        T removedElement = get(index);

        length--;
        for (int i = index; i < length; i++) {
            list[i] = list[i + 1];
        }
        return removedElement;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<T> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < length;
        }

        @Override
        public T next() {
            return get(cursor++);
        }
    }
}
