// абстрактный класс
public abstract class Employee {
    // модификатор доступа private не дает нам изменять переменную
    private String name;

    private int age;

    private int salary;

    // статичная переменная, принадлежит классу
    private static int employeeAmount = 0;

    // конструктор по инициализации
    public Employee(String newName, int newAge, int newSalary){
        this.name = newName;
        this.age = newAge;
        this.salary = newSalary;
    }

    public abstract void doWork();

    // геттеры и сеттеры
    // через них мы имеем доступ к приватным переменным
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // перегрузка метода getSalary
    public int getSalary(int monthNum){
        return salary * monthNum;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }

    // метод для считывания количества созданных объектов
    public void addEmployee() {
        employeeAmount++;
    }

    public static int getEmployeeAmount(){
        return employeeAmount;
    }
}