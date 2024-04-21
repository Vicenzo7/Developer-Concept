package system_design.LLD.Cricbuzz.Team;

import system_design.LLD.Cricbuzz.Inning.BallDetails;
import system_design.LLD.Cricbuzz.Inning.OverDetails;
import system_design.LLD.Cricbuzz.Team.player.PlayerDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail){

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
