package ai.timefold.solver;

import ai.timefold.solver.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import ai.timefold.solver.core.api.score.stream.Constraint;
import ai.timefold.solver.core.api.score.stream.ConstraintFactory;
import ai.timefold.solver.core.api.score.stream.ConstraintProvider;
import ai.timefold.domain.Santa;
import ai.timefold.geo.DrivingTimeCalculator;
import org.jspecify.annotations.NonNull;

public class SantaConstraintProvider implements ConstraintProvider {
    DrivingTimeCalculator drivingTimeCalculator = DrivingTimeCalculator.getInstance();
    public static final String MINIMIZE_TRAVEL_TIME = "minimizeTravelTime";

    @Override
    public Constraint @NonNull [] defineConstraints(@NonNull ConstraintFactory factory) {
        return new Constraint[]{
                minimizeTravelTime(factory),
        };
    }

    /**
     * Creates a constraint which will reduce the SOFT score by 1 for each second driven by a Santa.
     * NOTE: Normally you'd want to calculate a Distance Matrix before starting the solver.
     */
    Constraint minimizeTravelTime(ConstraintFactory factory) {
        return factory.forEach(Santa.class)
                .penalizeLong(HardSoftLongScore.ONE_SOFT,
                        santa -> drivingTimeCalculator.getTotalDrivingTimeSeconds(santa))
                .asConstraint(MINIMIZE_TRAVEL_TIME);
    }
}
