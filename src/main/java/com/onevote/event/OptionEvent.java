package com.onevote.event;

import com.onevote.Action;
import com.onevote.Option;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class OptionEvent {
    private Action action;
    private Option option;
}
