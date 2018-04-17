package ua.olebas.prometheus.lessons;

public class Box {

    private int x;
    private int y;
    private int z;

    public Box() {

    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("\n");
    }

    public void change(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getVolume() {
        return x * y * z;
    }
}
