package adapter;

import java.util.List;

public interface LogFileOperateApi {

    public List<LogModel> readLogFile();
    public void writeLogFile(List<LogModel> list);
}
