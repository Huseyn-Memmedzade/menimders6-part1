public class Main2 {

    public static void main(String[] args) {

        Car car = new Car();
        car.model = "BMW";
        car.color = "Red";
        car.il = 1996;
        Car car2 = new Car();
        car2.model = "Mercedes";
        car2.color = "Blue";
        car2.il = 1998;

        System.out.println(car.model + " : " + car.color + " : " + car.il);
        System.out.println(car2.model + " : " + car2.color + " : " + car2.il);
    }


}
// Daha Sonra Main2 Klassi yaradilir psvm yaradilir
// Car car = new Car(); ve Car car2 = new Car(); obyekti yaradilir
// Daha Sonra ise Car car = new Car();
//                car.model = "BMW";
//                car.color = "Red";
//                car.il = 1996;
//
//                Car car2 = new Car();
//                car2.model = "Mercedes";
//                car2.color = "Blue";
//                car2.il = 1998;
//
// System.out.println(car.model + " : " + car.color + " : " + car.il);  Capa Verilir
// System.out.println(car2.model + " : " + car2.color + " : " + car2.il); Capa Verilir