package po;

import java.util.ArrayList;

import common.enums.TeamName;
import common.mydatastructure.Season;
import common.mydatastructure.team.TeamPerformanceOfOneMatch;

public class OneTeamPerformanceOfOneSeasonPo {
	private TeamName teamName;// 球队名称
	private Season season;// 赛季
	private ArrayList<TeamPerformanceOfOneMatch> listOfPerformanceOfOneMatch;// 球队赛季里每场比赛

	public OneTeamPerformanceOfOneSeasonPo(TeamName teamName, Season season) {
		this.teamName = teamName;
		this.season = season;
		this.listOfPerformanceOfOneMatch = new ArrayList<TeamPerformanceOfOneMatch>();
		this.init();
	}

	private void init() {
		// ///////////////////////////////
		// TODO
	}

	public TeamName getTeamName() {
		return this.teamName;
	}

	public Season getSeason() {
		return this.season;
	}

	public ArrayList<TeamPerformanceOfOneMatch> getListOfPerformanceOfOneMatch() {
		return this.listOfPerformanceOfOneMatch;
	}
}