package top.zdhunter.driverFriend.bean.result;

import lombok.Data;
import top.zdhunter.driverFriend.enums.ETaskState;

import java.time.LocalDateTime;

/**
 * @author zhangdehua
 * @date 2020-02-11
 */
@Data
public class TaskResult {
    private String taskId;
    private String issueId;
    private String issueName;
    private String companyId;
    private String companyName;
    private String cargoKind;
    private float cargoWeight;
    private LocalDateTime taskDeadline;
    private String destinationCity;
    private String destinationAddress;
    private String remark;
    private ETaskState taskState;
}
