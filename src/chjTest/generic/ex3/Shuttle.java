package chjTest.generic.ex3;

import chjTest.generic.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T unit = null;

    public void in(T data) {
        unit = data;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
