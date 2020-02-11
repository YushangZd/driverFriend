package top.zdhunter.driverFriend.service;

import top.zdhunter.driverFriend.bean.param.ChangeTaskParam;
import top.zdhunter.driverFriend.bean.param.TaskParams;
import top.zdhunter.driverFriend.bean.result.TaskResult;
import top.zdhunter.driverFriend.enums.ETaskState;

/**
 * @author zhangdehua
 * @date 2020-02-11
 */
public interface ITaskService {
    void addTask(TaskParams params, String issueId);
    void changeTask(ChangeTaskParam param);
    void changeTaskState(String taskId, ETaskState toBeState);
    TaskResult getTaskById(String taskId);
}
