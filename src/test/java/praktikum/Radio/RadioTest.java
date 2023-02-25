package praktikum.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void currentRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationCenterTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationMinusTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(-1);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationOverMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeMinTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void volumeMaxTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void volumeCenterTest() {
        Radio radio = new Radio();
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }
    @Test
    public void getVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.setVolume(15);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void volumeMinusTest() {
        Radio radio = new Radio();
        radio.setVolume(2);
        radio.setVolume(-1);
        assertEquals(2, radio.getVolume());
    }

    @Test
    public void volumeOverTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.setVolume(11);
        assertEquals(10, radio.getVolume());
    }
    @Test
    public void getVolumeOverTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.setVolume(-1);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void nextVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.nextVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void nextVolumeMaxTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void nextVolumeOverTest() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.nextVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void prevVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.prevVolume();
        assertEquals(4, radio.getVolume());
    }

    @Test
    public void prevVolumeMinTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void prevVolumeMaxTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.prevVolume();
        assertEquals(9, radio.getVolume());
    }
    @Test
    public void nextRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStationMinTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStationMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void prevRadioStationMinTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationCenterTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }
}