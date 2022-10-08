public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "Укажите модель";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 0;
            System.out.println("Укажите объеи двигателя");
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
