package lesson6.animals;

public class Cat extends Animal {

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void swim(int distance) {
        System.out.println(" коты не плавают ");
    }
}