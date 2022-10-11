public class Race {
    public static void main(String[] args) {

        Car porsche = new Car("Porsche", "911", 5.0);
        Car bmw = new Car("BMW", "M6", 3.0);
        Car Mercedes = new Car("Mercedes", "223", 5.5);
        Car kia = new Car("Kia", "Sorento", 2.4);

        Truck volvo = new Truck("Volvo", "FH16", 16.0);
        Truck man = new Truck("Man", "TGL", 11.5);
        Truck kamaz = new Truck("Kamaz", "5490", 9.8);
        Truck isuzu = new Truck("Isuzu", "Forward", 7.8);

        Bus scania = new Bus("Scania", "HigerA80", 11.5,"100-233");
        Bus daewoo = new Bus("daewoo", "BC212MA", 12.2," ");
        Bus paz = new Bus("ПАЗ", "Вектор", 4.4, "90-120");
        Bus solaris = new Bus("Solaris", "Urbino 10", 6.0,"Capa");

        DriverB driverB = new DriverB("Николо Макиавелли", 37);
        driverB.start(bmw);
        DriverC driverC = new DriverC("Нерон Меднобородый", 4);
        driverC.stop(volvo);
        DriverD driverD = new DriverD("Искандер Двурогий", 12);
        driverD.refillCar(paz);
        driverB.printInfo(kia);
        driverC.printInfo(isuzu);
        driverD.printInfo(solaris);
    }
}