package ss10_dsa_to_java.exercise;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;

    private Object elements[] = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        ensureCapa();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);
        Object removeIndex = new Object[index];
        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[size--] = null;
        return (E) removeIndex;
    }

    public int size() {
        return size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = o;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            Object[] newElement = new Object[newCapacity];
            System.arraycopy(elements, 0, newElement, 0, size);
            elements = newElement;
        }
    }

    public E get(int i) {
        checkIndex(i);
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void findAll() {
        for (Object value : elements) {
            System.out.println(value);
        }
    }
}
