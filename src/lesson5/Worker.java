package lesson5;

public class Worker {
    private  String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Worker(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info (){
        System.out.println("ФИО: " + fullName + ", должность: " + position + ", email: " + email + ", телефон: " + phoneNumber + ", должность: " + salary + ", возраст: " + age);
    }
}
