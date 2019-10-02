package lesson7;

public class Plate {
    private int food;

    public Plate (int food){
        this.food = food;
    };

    public void info (){
        System.out.println("food in plate: " + food);
    };
    public boolean decreaseFood (int n){
        if ( food-n>=0 ) {
            food -= n;
            return true;
        }
        else
            return false;
    }


}
