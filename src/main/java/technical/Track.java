package technical;

public class Track {

	private String name;
	private double length;
	private String artist;
	private Album album;

	/**
	 * Constructs a Track assigning values to the name and length fields
	 *
	 * @param name   the name to assign to the name field
	 * @param length the length to assign to the length field
	 */
	public Track(String name, double length) {
		this.name = name;
		this.length = length;
	}

	/**
	 * Constructs a Track assigning values to the name, length and artist fields.
	 *
	 * @param name   the name to assign to the name field
	 * @param length the length to assign to the length field
	 * @param artist the artist to assign to the artist field
	 */
	public Track(String name, double length, String artist) {
		this.name = name;
		this.length = length;
		this.artist = artist;
	}

	/**
	 * Constructs a Track assigning values to the name, length, album, and artist
	 * fields.
	 *
	 * @param name   the name to assign to the name field
	 * @param length the length (in minutes) to assign to the length field
	 * @param album  the album to assign to the album field
	 * @param artist the artist to assign to the artist field
	 */
	public Track(String name, double length, Album album, String artist) {
		this.name = name;
		this.length = length;
		this.artist = artist;
		this.album = album;
	}

	/**
	 * Getter method for the name of the track.
	 *
	 * @return the name of the track
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for the name of the track.
	 *
	 * @param name the new name of the track
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for the length (in minutes) of the track.
	 *
	 * @return the length (in minutes) of the track
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Setter method for the length (in minutes) of the track.
	 *
	 * @param length the new length (in minutes) of the track
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Getter method for the album of the track.
	 *
	 * @return the album of the track
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * Setter method for the album of the track.
	 *
	 * @param album the new album of the track
	 */
	public void setAlbum(Album album) {
		this.album = album;
	}

	/**
	 * Getter method for the artist of the track.
	 *
	 * @return the artist for the track
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Setter method for the artist of the track.
	 *
	 * @param artist the new artist of the track
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

}
