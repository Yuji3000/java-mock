import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import technical.Album;
import technical.Track;

public class TrackTest {

    @Test
    void constructorWithNameAndLengthTest() {
        Track testTrack = new Track("TestTrack", 2.01);
        assertEquals("TestTrack", testTrack.getTrackTitle());
        assertEquals(2.01, testTrack.getDuration());
    }

    @Test
    void constructorWithNameLengthAndArtist() {
        Track testTrack = new Track("TestTrack", 2.01, "Artist1");
        assertEquals("TestTrack", testTrack.getTrackTitle());
        assertEquals(2.01, testTrack.getDuration());
        assertEquals("Artist1", testTrack.getArtist());
    }

    @Test
    void constructorWithNameLengthArtistAndAlbum() {
        Album album = new Album("Test", "Test");
        Track testTrack = new Track("TestTrack", 2.01, album, "Artist1");
        assertEquals("TestTrack", testTrack.getTrackTitle());
        assertEquals(2.01, testTrack.getDuration());
        assertEquals("Artist1", testTrack.getArtist());
        assertEquals(album, testTrack.getAlbum());
    }

    @Test
    void getNameTest() {
        Track testTrack = new Track("TestTrack", 2.01);
        assertEquals("TestTrack", testTrack.getTrackTitle());
    }

    @Test
    void setNameTest() {
        Track testTrack = new Track("TestTrack", 2.01);
        testTrack.setTrackTitle("Track1");
        assertEquals("Track1", testTrack.getTrackTitle());
    }

    @Test
    void getLengthTest() {
        Track testTrack = new Track("TestTrack", 2.01);
        assertEquals(2.01, testTrack.getDuration());
    }

    @Test
    void setLengthTest() {
        Track testTrack = new Track("TestTrack", 2.01);
        assertEquals(2.01, testTrack.getDuration());
        testTrack.setDuration(1.00);
        assertEquals(1.00, testTrack.getDuration());
    }

    @Test
    void getAlbumTest() {
        Album album = new Album("Test", "Test");
        Track testTrack = new Track("TestTrack", 2.01, album, "Artist1");
        assertEquals(album, testTrack.getAlbum());
    }

    @Test
    void setAlbumTest() {
        Album album = new Album("Old", "Test");
        Track testTrack = new Track("TestTrack", 2.01, album, "Artist1");
        assertEquals(album, testTrack.getAlbum());
        Album newAlbum = new Album("New", "Test");
        testTrack.setAlbum(newAlbum);
        assertEquals(newAlbum, testTrack.getAlbum());
    }

    @Test
    void getArtistTest() {
        Track testTrack = new Track("TestTrack", 2.01, "Artist");
        assertEquals("Artist", testTrack.getArtist());
    }

    @Test
    void setArtistTest() {
        Track testTrack = new Track("TestTrack", 2.01, "Artist");
        assertEquals("Artist", testTrack.getArtist());
        testTrack.setArtist("New Artist");
        assertEquals("New Artist", testTrack.getArtist());
    }

}
