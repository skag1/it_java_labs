public class Programmer extends Employee{

    private int codeLinesWritten = 0;

    public Programmer(String newName, int newAge, int newSalary){
        super(newName, newAge, newSalary);
        super.addEmployee();
    }

    // конструктор по умолчанию (не работает без конструктора по инициализации)
    public Programmer() {
        super("NoName", 0, 0);
        super.addEmployee();
    }

    // переопределение метода работы
    @Override
    public void doWork(){
        System.out.println("I am programming");
        codeLinesWritten++;
    }

    // количество прописанных строчек
    public int getCodeLinesWritten(){
        return codeLinesWritten;
    }
}