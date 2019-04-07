package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(TopicsPK.class)
public class Topics {
    private Integer topicId;
    private Integer topicOwner;
    private String topicName;
    private String topicColor;

    @Id
    @Column(name = "topic_id", nullable = false)
    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @Id
    @Column(name = "topic_owner", nullable = false)
    public Integer getTopicOwner() {
        return topicOwner;
    }

    public void setTopicOwner(Integer topicOwner) {
        this.topicOwner = topicOwner;
    }

    @Basic
    @Column(name = "topic_name", nullable = false, length = -1)
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Basic
    @Column(name = "topic_color", nullable = false, length = 9)
    public String getTopicColor() {
        return topicColor;
    }

    public void setTopicColor(String topicColor) {
        this.topicColor = topicColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topics topics = (Topics) o;
        return Objects.equals(topicId, topics.topicId) &&
                Objects.equals(topicOwner, topics.topicOwner) &&
                Objects.equals(topicName, topics.topicName) &&
                Objects.equals(topicColor, topics.topicColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId, topicOwner, topicName, topicColor);
    }
}