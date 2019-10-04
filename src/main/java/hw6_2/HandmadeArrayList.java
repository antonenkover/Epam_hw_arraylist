package hw6_2;

public class HandmadeArrayList<T> {

    private int size;
    private Object[] array = new Object[8];

    public void add(T object) {
        if (size == array.length * 3 / 4) {
            addsize();
        }
        array[size] = object;
        size++;
    }

    public T getElement(int index) {
        return (T) array[index];
    }

    public int getSize() {
        return size;
    }

    public void addsize() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int length() {
        return array.length;
    }

}
