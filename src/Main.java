//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание №1 ");


        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(" Ф.И.О сотрудника - " + fullName);
        System.out.println("");

        System.out.println(" Задание №2");


        System.out.println(" Ф.И.О. сотрудника для отчета - " + fullName.toUpperCase());
        System.out.println(" ");

        System.out.println(" Задание №3 ");


        fullName = fullName.replace(" Ivanov ", " Иванов ");
        fullName = fullName.replace(" Ivanovich ", " Семёнович ");
        fullName = fullName.replace(" Ivan ", " Семён ");
        fullName = fullName.replace('ё', 'е');
        System.out.println(" Данные Ф.И.О. сотрудника - " + fullName);
    }
}