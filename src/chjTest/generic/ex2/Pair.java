package chjTest.generic.ex2;

public class Pair<T, S> {
    private T first = null;
    private S second = null;

    public void setFirst(T data) {
        first = data;
    }

    public void setSecond(S data) {
        second = data;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
