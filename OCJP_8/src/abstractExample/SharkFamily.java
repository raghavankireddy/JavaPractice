package abstractExample;

public interface SharkFamily extends HasFins {

	public default int getNumberOfFins() {
		return 8;
	}

	public double getLongestFins();

	public default boolean doFinsHaveScales() {
		return false;
	}
}
