public interface Vehicles {
    void changeGear();
    void applyBreak();
    void speedUp();
}
class Bicycle implements Vehicles{
    @Override
    public void applyBreak() {
        System.out.println("break applied");
    }

    @Override
    public void changeGear() {
        System.out.println("gear changed");
    }

    @Override
    public void speedUp() {
        System.out.println("100m/s");
    }

}
class Cars implements Vehicles{
    @Override
    public void speedUp() {
        System.out.println("5Km/s");
    }

    @Override
    public void changeGear() {
        System.out.println("changed gear");
    }

    @Override
    public void applyBreak() {
        System.out.println("applied break");
    }

}
class Bike implements Vehicles {
    @Override
    public void applyBreak() {
        System.out.println("break applied");
    }

    @Override
    public void speedUp() {
        System.out.println("6Km/s");
    }

    @Override
    public void changeGear() {
        System.out.println("gear changed");
    }

}
class Main{
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.applyBreak();
        b1.changeGear();
        b1.speedUp();
        Cars c=new Cars();
        c.applyBreak();
        c.changeGear();
        c.speedUp();
        Bicycle b=new Bicycle();
        b.applyBreak();
        b.changeGear();
        b.speedUp();

    }
}
