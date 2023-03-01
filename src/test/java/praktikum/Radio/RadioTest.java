package praktikum.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void getMinRadioStationsConstructorTest() {
        Radio radio = new Radio(25);
        assertEquals(0, radio.getMinAmountOfRadioStations());
    }

    @Test
    public void getMaxAmountOfRadioStationsConstructorTest() {
        Radio radio = new Radio(25);
        assertEquals(24, radio.getMaxAmountOfRadioStations());
    }

    @Test
    public void maxAmountOfRadioStationsTest() {
        Radio radio = new Radio(25);
        assertEquals(24, radio.getMaxAmountOfRadioStations());
    }

    @Test
    public void nextRadioStationConstructorTest() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(48);
        radio.nextRadioStation();
        assertEquals(49, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStationMinConstructorTest() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(radio.getMinAmountOfRadioStations());
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStationMaxConstructorTest() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(radio.getMaxAmountOfRadioStations());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMinConstructorTest() {
        Radio radio = new Radio(66);
        radio.setCurrentRadioStation(radio.getMinAmountOfRadioStations());
        radio.prevRadioStation();
        assertEquals(65, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMaxConstructorTest() {
        Radio radio = new Radio(44);
        radio.setCurrentRadioStation(43);
        radio.prevRadioStation();
        assertEquals(42, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationCenterConstructorTest() {
        Radio radio = new Radio(33);
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void getAmountOfRadioStationsConstructorTest() {
        Radio radio = new Radio(10);
        assertEquals(10, radio.getAmountOfRadioStations());
    }

    @Test
    public void AmountOfRadioStationsConstructorTest() {
        Radio radio = new Radio(25);
        assertEquals(24, radio.getMaxAmountOfRadioStations());
    }

    @Test
    public void getMaxVolumeConstructorTest() {
        Radio radio = new Radio();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void getMinVolumeConstructorTest() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void currentRadioStationConstructorTest() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationMaxConstructorTest() {
        Radio radio = new Radio(8);
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationCenterConstructorTest() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(10);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationMinusConstructorTest() {
        Radio radio = new Radio(5);
        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(-1);
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationOverMaxConstructorTest() {
        Radio radio = new Radio(6);
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(10);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeMinConstructorTest() {
        Radio radio = new Radio(6);
        radio.setVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void volumeMaxConstructorTest() {
        Radio radio = new Radio(15);
        radio.setVolume(100);
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void volumeCenterConstructorTest() {
        Radio radio = new Radio(25);
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void volumeConstructorTest() {
        Radio radio = new Radio(30);
        radio.setVolume(25);
        radio.setVolume(-1);
        assertEquals(25, radio.getVolume());
    }

    @Test
    public void getVolumeConstructorTest() {
        Radio radio = new Radio(55);
        radio.setVolume(0);
        radio.setVolume(101);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void volumeMinusConstructorTest() {
        Radio radio = new Radio(30);
        radio.setVolume(20);
        radio.setVolume(-1);
        assertEquals(20, radio.getVolume());
    }

    @Test
    public void volumeOverConstructorTest() {
        Radio radio = new Radio(44);
        radio.setVolume(100);
        radio.setVolume(101);
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void getVolumeOverConstructorTest() {
        Radio radio = new Radio(21);
        radio.setVolume(100);
        radio.setVolume(-1);
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void nextVolumeConstructorTest() {
        Radio radio = new Radio(25);
        radio.setVolume(0);
        radio.nextVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void nextVolumeMaxConstructorTest() {
        Radio radio = new Radio(3);
        radio.setVolume(100);
        radio.nextVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void nextVolumeOverConstructorTest() {
        Radio radio = new Radio(58);
        radio.setVolume(99);
        radio.nextVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void prevVolumeConstructorTest() {
        Radio radio = new Radio(15);
        radio.setVolume(5);
        radio.prevVolume();
        assertEquals(4, radio.getVolume());
    }

    @Test
    public void prevVolumeMinConstructorTest() {
        Radio radio = new Radio(25);
        radio.setVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void prevVolumeMaxConstructorTest() {
        Radio radio = new Radio(58);
        radio.setVolume(100);
        radio.prevVolume();
        assertEquals(99, radio.getVolume());
    }

    ///////////////////////////////////////////////////////////////////////////////////
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
        radio.setVolume(101);
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
        radio.setVolume(100);
        radio.setVolume(101);
        assertEquals(100, radio.getVolume());
    }
    @Test
    public void getVolumeOverTest() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.setVolume(-1);
        assertEquals(100, radio.getVolume());
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
        radio.setVolume(100);
        radio.nextVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void nextVolumeOverTest() {
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.nextVolume();
        assertEquals(56, radio.getVolume());
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
        radio.setVolume(100);
        radio.prevVolume();
        assertEquals(99, radio.getVolume());
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
        radio.setCurrentRadioStation(radio.getMaxAmountOfRadioStations());
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

    @Test
    public void getAmountOfRadioStations5Test() {
        Radio radio = new Radio();
        assertEquals(10, radio.getAmountOfRadioStations());
    }

    @Test
    public void getMaxAmountOfRadioStationsTest() {
        Radio radio = new Radio();
        assertEquals(10, radio.getAmountOfRadioStations());
    }

    @Test
    public void getAmountOfRadioStationsTest() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxAmountOfRadioStations());
    }

    @Test
    public void getMaxVolumeTest() {
        Radio radio = new Radio();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void getMinVolumeTest() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void getMinRadioStationsTest() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinAmountOfRadioStations());
    }

    @Test
    public void setMaxAmountOfRadioStationsTest() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxAmountOfRadioStations());
    }
}