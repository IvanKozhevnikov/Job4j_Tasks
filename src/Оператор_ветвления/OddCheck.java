package Оператор_ветвления;

public class OddCheck {
    public static void main(String[] args) {
        System.out.println(check(3));
    }
    public static boolean check(int num) {
        if ((num % 2) != 0)
            return true;
        return false;
    }
}
