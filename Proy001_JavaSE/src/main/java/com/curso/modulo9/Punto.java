package com.curso.modulo9;

import java.util.Objects;

public class Punto implements Comparable<Punto> {

    private int x;
    private int y;

    public Punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto: x-" + this.x + " y-" + this.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Punto))
            return false;

        return (this.x == ((Punto) obj).getX() && this.y == ((Punto) obj).getY());
    }

    @Override
    public int compareTo(Punto o) {
        if (this.x > o.x)
            return 1;
        else if (this.x < o.x)
            return -1;

        if (this.y > o.y)
            return 1;
        else if (this.y < o.y)
            return -1;

        return 0;

    }

}
