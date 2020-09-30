/** The purpose of this class is to model a television
 * 
 * @author sabraabraham 09/28/2020
 *
 */


public class Television {

	private final String MANUFACTURER; // brand name
	private final int SCREEN_SIZE; // size of T.V. screen
	
	private boolean powerOn; // holds value true is power on, false if power off
	private int channel; // holds value of the station being shown on T.V.
	private int volume; // holds a number representing loudness
	
	// default constructor
	public Television(String brand, int size) // constructor
	{
		SCREEN_SIZE = size;
		MANUFACTURER = brand;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	// returns brand name
	public String getManufacturer() 
	{
		return MANUFACTURER;
	}
	
	// returns T.V. screen size
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	// returns channel T.V. is displaying
	public int getChannel()
	{
		return channel;
	}
	
	// returns volume
	public int getVolume()
	{
		return volume;
	}
	
	
	public void setChannel(int station)
	{
		channel = station;
	}
	
	public void power() 
	{
		powerOn = !powerOn;
	}
	
	// increases the current volume by 1
	public void increaseVolume()
	{
		volume++;
	}
	
	// decreases current volume by 1
	public void decreaseVolume()
	{
		volume--;
	}
	
	
}
