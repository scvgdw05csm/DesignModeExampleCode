package state;

public interface VoteState {

    public void vote(String user, String voteItem, VoteManager voteManager);
}
