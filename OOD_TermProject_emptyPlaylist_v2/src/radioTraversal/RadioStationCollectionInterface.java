package radioTraversal;

public interface RadioStationCollectionInterface {
	
	public void addRadioStation(RadioStationSong rs);
	
	public void removeRadioStation(RadioStationSong rs);
	
	public RadioStationIteratorInterface iterator(RadioStationTypeEnum type);
}



