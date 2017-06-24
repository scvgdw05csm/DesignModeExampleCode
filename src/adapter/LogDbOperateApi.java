package adapter;

import java.util.List;

public interface LogDbOperateApi {

    public void createLog(LogModel lm);
    public void updateLog(LogModel lm);
    public void removeLog(LogModel lm);
    public List<LogModel> getAllLog();
}
