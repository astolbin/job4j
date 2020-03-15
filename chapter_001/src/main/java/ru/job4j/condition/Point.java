package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

    public double distance(Point that) {
        double distanceX = Math.pow(this.x - that.x, 2);
        double distanceY = Math.pow(this.y - that.y, 2);
        return Math.sqrt(distanceX + distanceY);
    }

    public double distance3d(Point that) {
        double distanceX = Math.pow(this.x - that.x, 2);
        double distanceY = Math.pow(this.y - that.y, 2);
        double distanceZ = Math.pow(this.z - that.z, 2);
        return Math.sqrt(distanceX + distanceY + distanceZ);
    }
}
