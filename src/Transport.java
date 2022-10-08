public abstract class Transport {
    private String brand;
    private  String model;
    private double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            System.out.println("Некоректные данные");
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            System.out.println("Некорректные данные");
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            System.out.println("Некорректные данные");
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    abstract void startMove();

    abstract void finishMove();


}
