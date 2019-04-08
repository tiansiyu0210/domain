package com.onevote;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@NoArgsConstructor
public class Option extends BaseModel {

    private String id;

    @NotNull
    private String name;

    private Boolean isActive = true;

    @NotNull
    private String voteId;

    private Set<User> voter;

    private Integer count;

}
