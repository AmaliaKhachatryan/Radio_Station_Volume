package praktikum.Radio;

public class Radio {
    private int currentRadioStation;
    private int volume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0 || newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public void nextVolume() {
        int nextVolume = volume + 1;
        if (nextVolume > 10) {
            return;
        }
        setVolume(nextVolume);
    }

    public void prevVolume() {
        int prevVolume = volume - 1;
        if (prevVolume < 0) {
            return;
        }
        setVolume(prevVolume);
    }

    public void nextRadioStation() {
        int prevStation = currentRadioStation + 1;
        if (prevStation > 9) {
            setCurrentRadioStation(0);
        }
        setCurrentRadioStation(prevStation);
    }

    public void prevRadioStation() {
        int prevStation = currentRadioStation - 1;
        if (prevStation < 0) {
            setCurrentRadioStation(9);
        }
        setCurrentRadioStation(prevStation);
    }
}
