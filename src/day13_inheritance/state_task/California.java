package day13_inheritance.state_task;

public class California extends State{
    public California(String politicalParty, String governor, String senator, int population) {
        super("FL", politicalParty, governor, senator, population);
    }
}
