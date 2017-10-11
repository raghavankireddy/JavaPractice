package abstractExample;

public interface HasFins {

	public default int getNumberOfFins() {
		return 4;
	}

	public default double getLongestFins() {
		return 4.0;
	}

	public default boolean doFinsHaveScales() {
		return true;
	}

}
