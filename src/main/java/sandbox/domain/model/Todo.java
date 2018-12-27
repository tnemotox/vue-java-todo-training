package sandbox.domain.model;

import lombok.Getter;

@Getter
public class Todo {

    private VId id;

    private VTaskName taskName;

    private VIsDone isDone;
}
