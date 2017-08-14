package state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager2 extends VoteManager {

    private Map<String, VoteState> mapState = new HashMap<String, VoteState>();
    
    public Map<String, VoteState> getMapState() {
        return mapState;
    }
    
    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }
    
    @Override
    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);
        
        VoteState state = mapState.get(user);
        if (state == null) {
            state = new NormalVoteState2();
        }
        state.vote(user, voteItem, this);
    }
}
