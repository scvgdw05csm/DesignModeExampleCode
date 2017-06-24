package adapter;

import java.util.List;

public class LogDbOperate implements LogDbOperateApi {

    @Override
    public void createLog(LogModel lm) {
        System.out.println("now in LogDbOperate createLog, lm=" + lm);
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println("now in LogDbOperate updateLog, lm=" + lm);
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("now in LogDbOperate removeLog, lm=" + lm);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }

}
