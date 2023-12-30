public class Manager extends Employee{
    private int clientsLeftToServe;

    private int servedClients = 0;

    public Manager(String newName, int newAge, int newSalary, int newClientsLeftToServe){
        super(newName, newAge, newSalary);
        this.clientsLeftToServe = newClientsLeftToServe;
        super.addEmployee();
    }

    // конструктор по умолчанию (не работает без конструктора по инициализации)
    public Manager(){
        super("NoName", 0, 0);
        this.clientsLeftToServe = 0;
        super.addEmployee();
    }
    
    // переопределение метода работы
    @Override
    public void doWork(){
        if(clientsLeftToServe > 0){
            System.out.println("I am managing");
            clientsLeftToServe--;
            servedClients++;
        }
        else System.out.println("No clients left to manage");
    }

    // количество обслуженных клиентов
    public int getServedClients(){
        return servedClients;
    }
}