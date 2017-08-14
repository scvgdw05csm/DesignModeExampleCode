package state;

public class SpiteVoteState2 implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("spite vote 2");
        if (((VoteManager2)voteManager).getMapVoteCount().get(user) >= 7) {
            ((VoteManager2)voteManager).getMapState().put(user, new BlackVoteState());
        }
    }
}
