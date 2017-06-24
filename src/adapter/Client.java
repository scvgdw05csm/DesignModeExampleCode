package adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        LogModel lml = new LogModel();
        lml.setLogId("001");
        lml.setOperateUser("admin");
        lml.setOperateTime("2010-03-02 10:08:18");
        lml.setLogContent("this is a test");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml);

        // example1
        /*LogFileOperateApi logFileApi = new LogFileOperate("");
        logFileApi.writeLogFile(list);
        List<LogModel> readLog = logFileApi.readLogFile();
        System.out.println("readLog:" + readLog);*/

        // example2
        /*LogFileOperateApi logFileApi = new LogFileOperate("");
        LogDbOperateApi api = new Adapter(logFileApi);
        api.createLog(lml);
        List<LogModel> readLog = api.getAllLog();
        System.out.println("readLog:" + readLog);*/

        // example3
        /*LogFileOperateApi logFileApi = new LogFileOperate("");
        LogDbOperateApi dbLogApi = new LogDbOperate();
        LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(logFileApi, dbLogApi);
        LogDbOperateApi dbLogApi2 = new TwoDirectAdapter(logFileApi, dbLogApi);
        dbLogApi2.createLog(lml);
        List<LogModel> allLog = dbLogApi2.getAllLog();
        System.out.println("allLog=" + allLog);
        fileLogApi2.writeLogFile(list);
        fileLogApi2.readLogFile();*/

        // example4
        LogDbOperateApi api = new ClassAdapter("");
        api.createLog(lml);
        List<LogModel> readLog = api.getAllLog();
        System.out.println("readLog:" + readLog);
    }
}
