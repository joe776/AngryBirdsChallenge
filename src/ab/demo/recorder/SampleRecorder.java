package ab.demo.recorder;

import java.awt.Point;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

/**
 * Helps to write game samples to a CSV file.
 */
public class SampleRecorder implements AutoCloseable {

	private static final String[] MAPPING = { "id", "level", "shot", "angle", "velocity", "impact", "addedScore",
			"totalScore" };

	private final CsvBeanWriter writer;

	/**
	 * Create a new sample recorder that appends samples to the specified file in CSV format.
	 * 
	 * @param file
	 *            the file to write to
	 * @throws IOException
	 *             if writing to the specified file is not possible
	 */
	public SampleRecorder(String file) throws IOException {
		writer = new CsvBeanWriter(new BufferedWriter(new FileWriter(file, true)),
				CsvPreference.TAB_PREFERENCE);
	}

	/**
	 * Append a new record to the file.
	 * 
	 * @param id
	 *            a unique ID for the current game (e.g. the timestamp when it was started)
	 * @param level
	 *            the level currently played
	 * @param shot
	 *            the number of shot which this is
	 * @param angle
	 *            the angle of the shot
	 * @param velocity
	 *            the velocity of the shot
	 * @param impact
	 *            the point of impact
	 * @param addedScore
	 *            the score added by this shot
	 * @param totalScore
	 *            the total score after this shot
	 * @throws IOException
	 *             if writing to the specified file is not possible
	 */
	public void record(long id, int level, int shot, double angle, double velocity, Point impact, int addedScore,
			int totalScore)
			throws IOException {
		writer.write(new Sample(id, level, shot, angle, velocity, impact, addedScore, totalScore), MAPPING);
		writer.flush();
	}

	@Override
	public void close() throws IOException {
		writer.close();
	}

	private static class Sample {

		private final long id;
		private final int level;
		private final int shot;
		private final double angle;
		private final double velocity;
		private final Point impact;
		private final int addedScore;
		private final int totalScore;

		public Sample(long id, int level, int shot, double angle, double velocity, Point impact, int addedScore,
				int totalScore) {
			this.id = id;
			this.level = level;
			this.shot = shot;
			this.angle = angle;
			this.velocity = velocity;
			this.impact = impact;
			this.addedScore = addedScore;
			this.totalScore = totalScore;
		}

		public long getId() {
			return id;
		}

		public int getLevel() {
			return level;
		}

		public int getShot() {
			return shot;
		}

		public double getAngle() {
			return angle;
		}

		public double getVelocity() {
			return velocity;
		}

		public Point getImpact() {
			return impact;
		}

		public int getAddedScore() {
			return addedScore;
		}

		public int getTotalScore() {
			return totalScore;
		}

	}

}
