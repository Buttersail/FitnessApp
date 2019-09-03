package kea.fitness;

public class Member extends Person {

    private MemberType memberType;
    enum MemberType {
        FULL, BASIC
    }

    public Member(String name, String cpr, MemberType memberType) {
        super(name, cpr);
        this.memberType = memberType;

    }

    public void printMemberInformation() {
        if (this.memberType == MemberType.BASIC) {
            System.out.println(name + "\t" + cpr + "\t" + "Basic" + "\t\t" + 199);
        } else if (this.memberType == MemberType.FULL) {
            System.out.println(name + "\t" + cpr + "\t" + "Full" + "\t\t" + 299);
        } else {
            System.out.println("Unknown");
        }
    }

}
