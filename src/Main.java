public class Main {
    private static Employee[] employers = new Employee[10];
    public static void main(String[] args) {
        employers[0] = new Employee("Петров Александр Иванович", 3, 21000);
        employers[1] = new Employee("Иванов Михаил Илларионович", 1, 39000);
        employers[2] = new Employee("Светлый Николай Николаевич", 1, 37000);
        employers[3] = new Employee("Баринов Василий Иванович", 1, 17000);
        employers[4] = new Employee("Мотин Матвей Матвеевич", 2, 45000);
        employers[5] = new Employee("Полежайкин Алексей Александрович", 1, 33000);
        employers[6] = new Employee("Робертов Илья Павлович", 2, 28000);
        employers[7] = new Employee("Анциферов Денис Петрович", 3, 27000);
        employers[8] = new Employee("Золотов Даниил Данилович", 1, 31000);
        employers[9] = new Employee("Мешков Степан Степанович", 3, 33000);

        printAllEmployees();
        System.out.println(calculateAllSalary());
        printMinSalaryEmployee();
        printMaxSalaryEmployee();
        System.out.println(calculateAvgSalary());

        System.out.println(employers[0].getSalary());
        indexateSalary(10);
        System.out.println(employers[0].getSalary());


    }


    public static void indexateSalary(int percent) {
        for (int i = 0; i < employers.length; i++) {
            employers[i].setSalary(employers[i].getSalary()+(employers[i].getSalary()/100*percent));
        }
    }

    public static void printAllEmployees() {
        for (int i = 0; i < employers.length; i++) {
            if (employers[i] != null) {
                System.out.println(employers[i]);
            }
        }
    }

    public static int calculateAllSalary() {
        int sum = 0;
        for (int i = 0; i < employers.length; i++) {
            sum += employers[i].getSalary();
        }
        return sum;
    }

    public static double calculateAvgSalary() {
        return calculateAllSalary()/employers.length;
    }

    public static void printMinSalaryEmployee() {
        int minSalary = employers[0].getSalary();
        int id = 0;
        for (int i = 0; i < employers.length; i++) {
            if (employers[i].getSalary() < minSalary) {
                minSalary = employers[i].getSalary();
                id = employers[i].getId();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+employers[id-1].toString());
    }

    public static void printMaxSalaryEmployee() {
        int maxSalary = employers[0].getSalary();
        int id = 0;
        for (int i = 0; i < employers.length; i++) {
            if (employers[i].getSalary() > maxSalary) {
                maxSalary = employers[i].getSalary();
                id = employers[i].getId();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: "+employers[id-1].toString());
    }
}