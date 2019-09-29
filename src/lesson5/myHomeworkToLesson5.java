package lesson5;

public class myHomeworkToLesson5 {
    public static void main(String[] args) {
        Worker persArr[] = new Worker[5];
        persArr[0] = new Worker("Продаван Иван Иваныч", "менеджер", "ProdavanII@email.ru","7123456789", 30000, 28);
        persArr[1] = new Worker("Торгуев Петр Петрович", "менеджер", "TorguevPP@email.ru", "7234567890", 30000, 32);
        persArr[2] = new Worker( "Стимул Павел Павлович", "руководитель отдела продаж" , "StimulPP@email.ru", "72345678901", 50000, 42);
        persArr[3] = new Worker( "Счетовод Людмила Васильевна", "глав.бух", "SchetovodLV@email.ru", "7456789123", 45000, 48);
        persArr[4] = new Worker( "Баринов Алексей Владимирович", "директор", "BarinovAV", "7567891234", 80000, 44);

        for (int i = 0; i < persArr.length ; i++) {
            if (persArr[i].age > 40)
                persArr[i].info();
        }
    }
}
