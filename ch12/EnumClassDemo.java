class EnumClassDemo {
    public static void main(String[] args) {
        for (var transport : TransportClass.values()) {
            System.out.println("Speed of " + transport + " is " + transport.getSpeed() + "km/h");
        }
    }
}

enum TransportClass {
    Car(120), Train(80), Airplane(600);

    private int speed;

    TransportClass(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }
}