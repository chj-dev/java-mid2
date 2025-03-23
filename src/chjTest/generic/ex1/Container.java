package chjTest.generic.ex1;

public class Container<T> {
    private T item = null;

    public void setItem(T data) {
        item = data;
    }

    public T getItem() {
        return item;
    }

    public Boolean isEmpty() {
        return item == null;
    }
}
