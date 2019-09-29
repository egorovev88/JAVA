package lesson6.animals;

public class Animal {
    String name ;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    private int currentRunDistance;
    private int currentJumpHeight;
    private int currentSwimDistance;

    public Animal (){

    }
    public Animal(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.currentRunDistance = maxRunDistance;
        this.currentJumpHeight = maxJumpHeight;
        this.currentSwimDistance = maxSwimDistance;
    }

    public void run (int distance){
        this.currentRunDistance -= distance;
        if (this.currentRunDistance >= 0 )
            System.out.println(this.name + " пробежал " + distance + " метров");
        else
            System.out.println(this.name + " не осилил забег на " + distance + " метров");
    }

    public void jump (int height){
        this.currentJumpHeight -= height;
        if (this.currentJumpHeight >= 0 )
            System.out.println(this.name + " прыгнул " + height + " метров");
        else
            System.out.println(this.name + " не осилил прыжок на " + height + " метров");
    }

    public void swim (int distance){
        this.currentSwimDistance -= distance;
        if (this.currentSwimDistance >= 0 )
            System.out.println(this.name + " проплыл " + distance + " метров");
        else
            System.out.println(this.name + " не осилил заплыв на " + distance + " метров");
    }

    public void relax (){
        this.currentRunDistance = this.maxRunDistance;
        this.currentJumpHeight = this.maxJumpHeight;
        this.currentSwimDistance = this.maxSwimDistance;
    }
}
