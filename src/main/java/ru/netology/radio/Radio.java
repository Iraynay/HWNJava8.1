package ru.netology.radio;

public class Radio {

    private int volume;
    private int stationNumber;
//ПЕРЕКЛЮЧЕНИЕ СТАНЦИЙ
    public void setCurrentStationNumber (int currentStationNumber ) {
        if (currentStationNumber > 9) {
            return;
        }
        if (currentStationNumber < 0) {
            return;
        }
        this.stationNumber = currentStationNumber;
    }

    public int getStationNumber() {
        return this.stationNumber;
    }

    public void pressPrev() {
        int newCurrentStationNumber = stationNumber - 1;
        if (stationNumber == 0) {
            newCurrentStationNumber = 9;
        }
        setCurrentStationNumber (newCurrentStationNumber);
    }
    public void pressNext() {
        int newCurrentStationNumber = stationNumber + 1;
        if (stationNumber == 9) {
            newCurrentStationNumber = 0;
        }
        setCurrentStationNumber (newCurrentStationNumber);
    }
    public int setNumber(int setNumber) {
        setCurrentStationNumber (setNumber);
        return stationNumber;
    }

    // РЕГУЛИРОВАНИЕ УРОВНЯ ГРОМКОСТИ ЗВУКА

    public void setCurrentVolume (int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.volume = currentVolume;
    }

    public int getVolume() {
        return this.volume;
    }


    public int volumeUp (int currentVolume){
        int newCurrentVolume = volume + 1;
        if (newCurrentVolume >= 10) {
            newCurrentVolume = 10;
        }
        this.volume = newCurrentVolume;
        return volume;
    }
    public int volumeDown (int currentVolume){
        int newCurrentVolume = volume - 1;
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        this.volume = newCurrentVolume;
        return volume;
    }


}
