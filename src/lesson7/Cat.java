package lesson7;

import com.sun.deploy.security.SelectableSecurityManager;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat (Plate p) {
        satiety = p.decreaseFood(appetite);
    };
    public void info (){
        if (satiety)
            System.out.println(name + " сыт");
        else
            System.out.println(name + " голоден");
    }

}
