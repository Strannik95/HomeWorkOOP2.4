public class Bus extends Transport implements Competitiv {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Начало движения - автобус");
    }

    @Override
    void finishMove() {
        System.out.println("Конец движения - автобус");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус заправка, замена колес");
    }

    @Override
    public void bestTime() {
        System.out.println("Автобус, лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус разгон до максимальной скорости");
    }
}