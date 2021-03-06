package by.grsu.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tasks")
public class Task implements Serializable {

    @Id
    @Column(name = "task_id")
    private long taskId;

    @OneToOne
    @JoinColumn(name = "host_id", referencedColumnName = "host_id")
    private Host hostByHostId;

    @Column(name = "part_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long partId;

    @Column(name = "life_data")
    private String lifeData;

    public Task() {
    }


    public Host getHostByHostId() {
        return hostByHostId;
    }

    public void setHostByHostId(Host hostByHostId) {
        this.hostByHostId = hostByHostId;
    }

    public long getTaskId() {
        return taskId;
    }


    public long getPartId() {
        return partId;
    }


    public String getLifeData() {
        return lifeData;
    }


    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }

    public void setLifeData(String lifeData) {
        this.lifeData = lifeData;
    }
}
