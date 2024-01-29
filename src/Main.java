public class Main {

    public static void main(String[] args){
        String fullName = getFullName("Иванов", "Иван", "Иванович");
        printFullNameToUpperCase(fullName);
        replace("Иванов Семён Семёнович");
    }

    public static String getFullName(String lastName, String firstName, String middleName) {
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника: " + fullName);
        return fullName;
    }

    public static void printFullNameToUpperCase(String fullName) {
        String str = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + str);
    }

    public static void replace(String fullName) {
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}