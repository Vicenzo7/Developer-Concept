package system_design.LLD.Cricbuzz.ScoreUpdater;

import system_design.LLD.Cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    void update(BallDetails ballDetails);
}

