public class Truck extends Transport implements Competitiv {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Начало движения - грузовик");
    }

    @Override
    void finishMove() {
        System.out.println("Конец движения - грузовик");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик заправка, меняют колеса");
    }

    @Override
    public void bestTime() {
        System.out.println("Грузовик, лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик разгон до максимальной скорости");
    }
}