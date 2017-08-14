package state;

public class NormalVoteState2 implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("vote success 2");
        ((VoteManager2)voteManager).getMapState().put(user, new RepeatVoteState2());
    }
}
