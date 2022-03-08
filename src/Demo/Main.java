package Demo;

public class Main {

    public static void main(String[] args) {
        new Main().go();

    }

    public void go(){
        GroupMembers member1 =  new GroupMembers();
        member1.name = "Jon";
        member1.cellNumber = 41467254;
        member1.eMail = "jonx1183@stud.kea.dk";

        System.out.println(member1);


    }
}
