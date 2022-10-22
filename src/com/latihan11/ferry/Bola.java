package com.latihan11.ferry;

public class Bola extends Lingkaran{
    final double PHI = 3.14;

    public double volume(){
        double vBola = 4/3*jariJari*jariJari*jariJari;
        return vBola;
    }
    public double luas(){
        double luasBola = 4 * super.luas();
        return luasBola;
    }
}
