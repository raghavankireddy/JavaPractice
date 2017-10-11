package abstractExample;

public interface Ominvore {

	public void eatPlants();

	public void eatMeat();


	public default double getTemperature() {
		return 10.0;
	}
}
