package com.kingkonsole.eplmock.entity;

import com.kingkonsole.eplmock.entity.enums.StatusEnum;
import org.mongodb.morphia.annotations.*;

import java.util.Date;

@Entity(value = "fixtures", noClassnameStored = true)
@Indexes({@Index(
        fields = {@Field("date"), @Field("status"), @Field("home_team"), @Field("away_team")}
)})
public class Fixture extends BaseEntity {
    private Date date;
    private String time;
    private StatusEnum status;
    private String result;
    private String link;

    private String home;
    private String away;
    @Reference
    private Team home_team;

    @Reference
    private Team away_team;

    @PreSave
    public void generateLink(){
        this.link = "mylink" + this.getId();
    }

    public Fixture(){
        this.status = StatusEnum.PENDING;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public Team getHome_team() {
        return home_team;
    }

    public void setHome_team(Team home_team) {
        this.home_team = home_team;
    }

    public Team getAway_team() {
        return away_team;
    }

    public void setAway_team(Team away_team) {
        this.away_team = away_team;
    }
}
