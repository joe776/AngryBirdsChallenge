package ab.utils;

/**
 * Number of probably minimal shots, the best known score, and the 3-star score for each level.
 */
public enum BestShot {

	LEVEL_01(1, 35900, 32000, 33340, 31210),
	LEVEL_02(1, 62980, 60000, 60880, 60400),
	LEVEL_03(1, 43990, 41000, 42880, 42240),
	LEVEL_04(1, 38970, 28000, 38160, 36770),
	LEVEL_05(1, 71680, 64000, 67630, 65850),
	LEVEL_06(1, 44730, 35000, 32550, 36180),
	LEVEL_07(1, 50760, 45000, 31240, 49120),
	LEVEL_08(1, 59830, 50000, 48270, 57780),
	LEVEL_09(1, 52600, 50000, 51570, 51480),
	LEVEL_10(1, 76280, 55000, 58530, 68740),
	LEVEL_11(1, 63330, 54000, 60420, 59070),
	LEVEL_12(1, 63310, 45000, 63440, 58600),
	LEVEL_13(1, 56290, 47000, 36940, 50360),
	LEVEL_14(1, 85500, 70000, 65790, 65640),
	LEVEL_15(1, 57310, 41000, 48200, 55300),
	LEVEL_16(2, 71850, 64000, 66180, 66550),
	LEVEL_17(1, 57630, 53000, 55150, 54750),
	LEVEL_18(2, 66260, 48000, 57320, 54500),
	LEVEL_19(2, 42870, 35000, 38720, 38460),
	LEVEL_20(2, 65760, 50000, 51440, 56050),
	LEVEL_21(3, 99790, 75000, 71740, 75870);

	private final int minShots;
	private final int highScore;
	private final int threeStarScore;
	private final int score2012;
	private final int score2013;

	private BestShot(int shots, int highScore, int threeStarScore, int score2012, int score2013) {
		this.minShots = shots;
		this.highScore = highScore;
		this.threeStarScore = threeStarScore;
		this.score2012 = score2012;
		this.score2013 = score2013;
	}

	/**
	 * @return the minimum used shots
	 */
	public int getMinShots() {
		return minShots;
	}

	/**
	 * @return the best known human highscore (there are probably better scores here:
	 *         http://www.angrybirdsnest.com/leaderboard/angry-birds/episode/poached-eggs/)
	 */
	public int getHighScore() {
		return highScore;
	}

	/**
	 * @return the score needed for 3 stars
	 */
	public int getThreeStarScore() {
		return threeStarScore;
	}

	/**
	 * @return the best AI score in the 2012 competition
	 */
	public int getScore2012() {
		return score2012;
	}

	/**
	 * @return the best AI score in the 2013 competition
	 */
	public int getScore2013() {
		return score2013;
	}

}
