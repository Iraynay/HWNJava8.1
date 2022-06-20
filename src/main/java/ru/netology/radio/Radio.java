package ru.netology.radio;

public class Radio {



    private int maxVolume = 100;
    private int minVolume;
    private int stationAmount = 10;
    private int lastStation = stationAmount - 1;
    private int firstStation = 0;
    private int stationNumber = firstStation;
    private int volume = 45;

    public Radio (int maxVol, int minVol, int stationAmount) {
        this.maxVolume = maxVol;
        this.minVolume = minVol;
        this.firstStation = 0;
        this.lastStation = stationAmount - 1;
        this.stationNumber = firstStation;
    }

    public int getStationNumber() {
        return this.stationNumber;
    }

    //ПЕРЕКЛЮЧЕНИЕ СТАНЦИЙ
    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > lastStation) {
            return;
        }
        if (currentStationNumber <firstStation) {
            return;
        }
        this.stationNumber = currentStationNumber;
    }



    public void pressPrev() {
        int newCurrentStationNumber = stationNumber - 1;
        if (stationNumber == 0) {
            newCurrentStationNumber = lastStation;
        }
        setCurrentStationNumber(newCurrentStationNumber);
    }

    public void pressNext() {
        int newCurrentStationNumber = stationNumber + 1;
        if (stationNumber == lastStation) {
            newCurrentStationNumber = 0;
        }
        setCurrentStationNumber(newCurrentStationNumber);
    }

    public int setNumber(int setNumber) {
        setCurrentStationNumber(setNumber);
        return stationNumber;
    }

    // РЕГУЛИРОВАНИЕ УРОВНЯ ГРОМКОСТИ ЗВУКА

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.volume = currentVolume;
    }

    public int getVolume() {
        return this.volume;
    }


    public int volumeUp(int currentVolume) {
        int newCurrentVolume = volume + 1;
        if (newCurrentVolume >= maxVolume) {
            newCurrentVolume = maxVolume;
        }
        this.volume = newCurrentVolume;
        return volume;
    }

    public int volumeDown(int currentVolume) {
        int newCurrentVolume = volume - 1;
        if (newCurrentVolume <= minVolume) {
            newCurrentVolume = minVolume;
        }
        this.volume = newCurrentVolume;
        return volume;
    }


}
