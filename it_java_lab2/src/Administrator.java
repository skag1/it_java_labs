public class Administrator extends Manager{
    private int troublesLeftToSolve;

    private int troublesSolved = 0;

    public Administrator(String newName, int newAge, int newSalary, int newClientsLeftToServe, int newTroublesLeftToSolve){
        super(newName, newAge, newSalary, newClientsLeftToServe);
        this.troublesLeftToSolve = newTroublesLeftToSolve;
    }

    public Administrator(){
        super("NoName", 0, 0, 0);
        this.troublesLeftToSolve = 0;
    }

    @Override
    public void doWork(){
        super.doWork();
        if(troublesLeftToSolve > 0){
            System.out.println("I am administrating");
            troublesLeftToSolve--;
            troublesSolved++;
        }
        else System.out.println("No troubles left to administrate");
    }

    public int getTroublesSolved(){
        return troublesSolved;
    }
}