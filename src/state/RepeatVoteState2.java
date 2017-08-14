package state;

public class RepeatVoteState2 implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("do not vote repeatedly 2");
        if (((VoteManager2)voteManager).getMapVoteCount().get(user) >= 4) {
            ((VoteManager2)voteManager).getMapState().put(user, new SpiteVoteState2());
        }
    }
}
