package adapter;

import java.util.List;

public class ClassAdapter extends LogFileOperate implements LogDbOperateApi {

    public ClassAdapter(String logFilePathName) {
        super(logFilePathName);
    }

    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = readLogFile();
        list.add(lm);
        writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(lm.getLogId())) {
                list.set(i, lm);
                break;
            }
        }
        writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        List<LogModel> list = readLogFile();
        list.remove(lm);
        writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return readLogFile();
    }
    

}
