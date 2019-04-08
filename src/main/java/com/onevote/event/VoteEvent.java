package com.onevote.event;

import com.onevote.Action;
import com.onevote.Vote;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class VoteEvent {
    private Action action;
    private Vote vote;
}
