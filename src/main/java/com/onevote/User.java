package com.onevote;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String id;

    @NotNull
    private String name;

    private List<Role> roles;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date createAt;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date modifiedAt;

    private String password;

    public User(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.roles = user.getRoles();
        this.createAt = user.getCreateAt();
        this.modifiedAt = user.getModifiedAt();
        this.password = user.getPassword();
    }
}
