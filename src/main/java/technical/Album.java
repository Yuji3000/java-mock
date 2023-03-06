package technical;

import java.util.List;

import technical.exceptions.MissingImplementationException;

public class Album {

    // Add required fields here (Make sure they are private)

    /**
     * Constructs an Album and assigns values to the artist and name fields
     *
     * @param artist the artist to assign to the artist field
     * @param name   the name to assign to the name field
     */
    public Album(String artist, String name) {
        throw new MissingImplementationException();
    }

    /**
     * Constructs an Album and assigns values to the artist, tracks and name fields.
     * This constructor should assign the provided artist and this album to each
     * track in the passed in tracks list.
     *
     * @param artist the artist to assign to the artist field
     * @param tracks the tracks to assign to the tracks field
     * @param name   the name to assign to the name field
     */
    public Album(String artist, List<Track> tracks, String name) {
        throw new MissingImplementationException();
    }

    /**
     * Getter method for the name of an album
     *
     * @return the name of the album
     */
    public String getName() {
        throw new MissingImplementationException();
    }

    /**
     * Setter method for the name of the album
     *
     * @param name the new name of the album
     */
    public void setName(String name) {
        throw new MissingImplementationException();
    }

    /**
     * Getter method for the artist of an album.
     *
     * @return the artist of the album
     */
    public String getArtist() {
        throw new MissingImplementationException();
    }

    /**
     * Setter method for the artist of the album.
     *
     * @param artist the new artist of the album
     */
    public void setArtist(String artist) {
        throw new MissingImplementationException();
    }

    /**
     * Getter method for the tracks on an album.
     * IMPORTANT: This should return a defensive copy.
     *
     * @return a list of tracks on the album
     */
    public List<Track> getTracks() {
        throw new MissingImplementationException();
    }

    /**
     * Calculate the length of the album by summing the length of each track on this
     * album.
     * IMPORTANT: Remember that a Track is itself an object with a length property.
     *
     * @return the sum of each individual track's length on this album
     */
    public double getAlbumLength() {
        throw new MissingImplementationException();
    }

    /**
     * This method should add the provided track to this album's tracks list. It
     * should not add null values to the list. It should also update the track's
     * artist to match this album's artist and set this album to be the track's
     * album.
     *
     * @param track the track to add to the tracks list
     * @return true if the track was added. false otherwise.
     */
    public boolean addTrack(Track track) {
        throw new MissingImplementationException();
    }

    /**
     * This method should remove the provided track from this album. It should also
     * set the track's artist and album to null if the provided track was in the
     * tracks list.
     *
     * @param track the track to remove from the tracks list
     * @return true if the track was removed. false otherwise.
     */
    public boolean removeTrack(Track track) {
        throw new MissingImplementationException();
    }

    /**
     * BONUS: This method should sort the tracks list based on the rule string
     * passed in:
     * If rule is "length" then sort the tracks in ascending order by their length
     * (in minutes)
     * If rule is "name" then sort the tracks in alphabetical order based on their
     * name
     * Otherwise don't apply any sort to the tracks list
     *
     * @param rule the rule string to determine the sort
     * @return the tracks list after the appropriate sort is applied
     */
    public List<Track> sortBy(String rule) {
        throw new MissingImplementationException();
    }

}
