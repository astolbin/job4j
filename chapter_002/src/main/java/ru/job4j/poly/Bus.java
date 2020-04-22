package ru.job4j.poly;

public class Bus implements Transport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        double sum = bus.refuel(55);
        System.out.println("Bus refueled for " + sum + " rubles");
        bus.passengers(40);
        bus.drive();
    }

    @Override
    public void drive() {
        System.out.println("Bus go.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Bus took " + count + " passengers");
    }

    @Override
    public double refuel(double volume) {
        return volume * 48.5;
    }
}
