package ai.timefold.domain;

import java.util.ArrayList;
import java.util.List;

import ai.timefold.solver.core.api.domain.entity.PlanningEntity;
import ai.timefold.solver.core.api.domain.variable.PlanningListVariable;

@PlanningEntity
public class Santa {

    private Location home;

    @PlanningListVariable
    private List<Visit> visits;

    public Santa() {
    }

    public Santa(Location home) {
        this.home = home;
        this.visits = new ArrayList<>();}

    public Location getHome() {
        return home;
    }

    public void setHome(Location home) {
        this.home = home;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}