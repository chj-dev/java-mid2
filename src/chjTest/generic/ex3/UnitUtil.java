package chjTest.generic.ex3;

import chjTest.generic.ex3.unit.BioUnit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T unit1, T unit2) {
        if(unit1.getHp() > unit2.getHp()){
            return unit1;
        }

        return unit2;
    }
}
