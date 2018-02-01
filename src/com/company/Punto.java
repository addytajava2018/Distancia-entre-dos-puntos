package com.company;
public class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double Distanciax_y(Punto p) {
        double dist = Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2);
        dist = Math.sqrt(dist);
        return dist;
    }
}

