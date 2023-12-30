public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Andrey", 20, 0);
        System.out.println(Employee.getEmployeeAmount());

        Manager manager = new Manager("Artyom", 20, 0, 10);
        System.out.println(Employee.getEmployeeAmount());

        Programmer noname = new Programmer();
        System.out.println(Employee.getEmployeeAmount());

        Administrator administrator = new Administrator("Intellij", 0,
                100, 20, 10);
        System.out.println(Employee.getEmployeeAmount());

        programmer.doWork();
        programmer.doWork();
        System.out.println(programmer.getCodeLinesWritten());

        manager.doWork();
        System.out.println(manager.getServedClients());

        int n = 15;
        while (n > 0){
            administrator.doWork();
            n--;
        }
        System.out.println(administrator.getTroublesSolved());
        System.out.println(administrator.getServedClients());
    }
}