abstract class Driver<T extends Transport & Competitiv> {
    private  String name;
    private  char license;
    private int experience;

    protected Driver(String name, Character license, Integer experience) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.out.println("Некорректные данные");
        } else {
            this.name = name;
        }
        if (license != 'C' && license != 'B' && license != 'D') {
            System.out.println("Некорректные данные");
        } else {
            this.license = license;
        }
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public Character getLicense() {
        return license;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        if (experience <= 0) {
            System.out.println("Некорректные данные");
        } else {
            this.experience = experience;
        }
    }

    public void start(T transport) {
        System.out.println(name + " запускает " + transport.getBrand());
    }

    public void stop(T transport) {
        System.out.println(name + " останавливает " + transport.getBrand());
    }

    public void refillCar(T transport) {
        System.out.println(name + " заправляет " + transport.getBrand());
    }

    public void printInfo(T transport) {
        System.out.println("Водитель " + name + " управляет " + transport.getBrand() +
                ' ' + transport.getModel() + " и будет участвовать в заезде");
    }

}
