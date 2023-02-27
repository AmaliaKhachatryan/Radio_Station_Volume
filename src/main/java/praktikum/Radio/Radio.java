package praktikum.Radio;

public class Radio {
    private int amountOfRadioStations = 10;
    private int minAmountOfRadioStations = 0;
    private int maxAmountOfRadioStations = amountOfRadioStations - 1;
    private int currentRadioStation;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMinAmountOfRadioStations() {
        return minAmountOfRadioStations;
    }

    public int getMaxAmountOfRadioStations() {
        return maxAmountOfRadioStations;
    }

    public Radio(int amountOfRadioStations) {
        this.amountOfRadioStations = amountOfRadioStations;
        maxAmountOfRadioStations = amountOfRadioStations - 1;
    }

    public Radio() {
    }

    public int getAmountOfRadioStations() {
        return amountOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minAmountOfRadioStations ||
                newCurrentRadioStation > maxAmountOfRadioStations) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume || newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void nextVolume() {
        int nextVolume = volume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        setVolume(nextVolume);
    }

    public void prevVolume() {
        int prevVolume = volume - 1;
        if (prevVolume < minVolume) {
            return;
        }
        setVolume(prevVolume);
    }

    public void nextRadioStation() {
        int nextStation = currentRadioStation + 1;
        if (nextStation > maxAmountOfRadioStations) {
            setCurrentRadioStation(minAmountOfRadioStations);
        }
        setCurrentRadioStation(nextStation);
    }

    public void prevRadioStation() {
        int prevStation = currentRadioStation - 1;
        if (prevStation < minAmountOfRadioStations) {
            setCurrentRadioStation(maxAmountOfRadioStations);
        }
        setCurrentRadioStation(prevStation);
    }
}

//    public void setMinAmountOfRadioStations(int minAmountOfRadioStations) {
//        this.minAmountOfRadioStations = minAmountOfRadioStations;
//    }
//
//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }
//
//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }
//
//    public void setMaxAmountOfRadioStations(int maxAmountOfRadioStations) {
//        this.maxAmountOfRadioStations=maxAmountOfRadioStations;
//    }
//    public void setAmountOfRadioStations(int amountOfRadioStations) {
//     this. amountOfRadioStations=amountOfRadioStations;
//    }