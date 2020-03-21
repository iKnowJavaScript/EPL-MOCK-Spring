package com.kingkonsole.eplmock.entity;

import org.mongodb.morphia.annotations.*;

@Entity(value = "teams", noClassnameStored = true)
@Indexes({@Index(
        fields = {@Field("name")},
        options = @IndexOptions(
                unique = true
        )
)})
public class Team extends BaseEntity {
    private String name;
    private String coach;
    private String stadium;
    private String address;
    private String stadiumCapacity;
    private String founded;
    private String city;

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(String stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
