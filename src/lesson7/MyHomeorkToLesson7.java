package lesson7;

public class MyHomeorkToLesson7 {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Vasya",15),
                    new Cat ("Barsik",15),
                    new Cat("Kuzya",20),
                    new Cat("Tolstyak",35),
                    new Cat("Shustriy",20)};
        Plate plate = new Plate(60);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].info();
        }
    }
}
