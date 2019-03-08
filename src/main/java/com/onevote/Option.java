package com.onevote;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class Option extends BaseModel {

    private String id;

    @NotNull
    private String name;

    private Boolean isActive = true;

    @NotNull
    private String voteId;

    private Set<User> voter;

    public Option() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public Set<User> getVoter() {
        return voter;
    }

    public void setVoter(Set<User> voter) {
        this.voter = voter;
    }

    @Override
    public String toString() {
        return "Option{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", voteId='" + voteId + '\'' +
                ", voter=" + voter +
                '}';
    }
}
