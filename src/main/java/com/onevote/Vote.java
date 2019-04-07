package com.onevote;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Vote extends BaseModel{

    private String id;

    @NotNull
    private String title;

    private String note;

    private Set<Option> options;

    private boolean isPublic = true;

    private boolean isActive = true;

    private boolean isExpire;

    private LocalDate Expiration;

}
