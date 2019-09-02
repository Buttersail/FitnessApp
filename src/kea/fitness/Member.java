package kea.fitness;

public class Members extends Employees{

    private String memberType;
    private int fee;

    public void createMember(String memberType, int fee) {
        this.memberType = memberType;
        this.fee = fee;

    }
}
