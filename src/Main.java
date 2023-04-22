public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Sergey Vesnin", 5, 100_050);
        employees[1] = new Employee("Alina Kabaeva", 3, 220_000);
        employees[2] = new Employee("Anna Vobla", 5, 300_000);
        employees[3] = new Employee("Lisa Ivanova", 3, 10_000);
        employees[4] = new Employee("Abram Skolin", 4, 12_000);
        employees[5] = new Employee("Piter Parker", 2, 100_500);
        employees[6] = new Employee("Egor Pronin", 1, 110_500);
        employees[7] = new Employee("Irina Maxova", 2, 170_000);
        employees[8] = new Employee("Ivan Porov", 5, 750_000);
        employees[9] = new Employee("Sergey Smirnoff", 3, 91_000);
        printAllEmployees();
        System.out.println(countSalary());
        printEmployees();
        System.out.println(countAverageSalary());
        System.out.println(countMinSalary());
        System.out.println(countMaxSalary());

    }
    public static void printAllEmployees (){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        }
     public static int countSalary (){
        int sum = 0;
         for (int i = 0; i < employees.length; i++) {
sum = sum + employees[i].getSalary();
         }
         return sum;
     }
     public static void printEmployees (){
         for (int i = 0; i < employees.length; i++) {
             System.out.println(employees[i].getFullname());
         }
     }
     public static int countAverageSalary (){
        int averageSalary = countSalary() / employees.length;
        return averageSalary;
     }
     public static int countMinSalary (){
        int minSalary = employees[0].getSalary();
         for (int i = 0; i < employees.length; i++) {
             if (employees[i].getSalary() < minSalary) {
                 minSalary = employees [i].getSalary();
             }
         }
         return minSalary;
     }
    public static int countMaxSalary (){
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees [i].getSalary();
            }
        }
        return maxSalary;
    }
}