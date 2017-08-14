package state;

public class Client {

    public static void main(String[] args) {
        //VoteManager vm = new VoteManager();
        VoteManager vm = new VoteManager2();
        for (int i = 0; i < 8; i++) {
            vm.vote("u1", "A");
        }
    }
}
