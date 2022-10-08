public class Car extends Transport implements Competitiv {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Начало движения -  авто");
    }

    @Override
    void finishMove() {
        System.out.println("Конец движения - авто");
    }


    @Override
    public void pitStop() {
        System.out.println("Авто - на запрвке, замена колес");

    }

    @Override
    public void bestTime() {
        System.out.println("Авто - лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Авто - разгон до максимальной скорости");
    }
}
