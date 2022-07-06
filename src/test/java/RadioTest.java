import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @Test
    public void shouldCreateRadio() {
        Radio radio = new Radio(15);
        int actual1 = radio.getStationNumber();
        assertEquals(14, actual1);

        int actual2 = radio.getVolume();
        assertEquals(45, actual2);

    }

    @Test
    public void shouldCreateRadioWOParameters() {
        Radio radio = new Radio();
        int actual1 = radio.getStationNumber();
        assertEquals(9, actual1);

        int actual2 = radio.getVolume();
        assertEquals(45, actual2);

    }

    //    ПЕРЕКЛЮЧЕНИЕ СТАНЦИЙ
    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationSetCurrent.csv")
    public void StationNumberSetCurrentTest(int currentStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(currentStation);

        int actual = radio.getStationNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationSet.csv")
    void StationNumberSetTest(int currentStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(currentStation);

        int actual = radio.setNumber(currentStation);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationPrev.csv")
    void StationNumberPrevTest(int currentStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(currentStation);
        radio.pressPrev();

        int actual = radio.getStationNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataStationNext.csv")
    void StationNumberNextTest(int currentStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(currentStation);
        radio.pressNext();
        int actual = radio.getStationNumber();

        assertEquals(expected, actual);
    }

    // РЕГУЛИРОВКА ГРОМКОСТИ
    @ParameterizedTest
    @CsvFileSource(resources = "/testDataVolumeSetCurrent.csv")
    void StationVolCurrentSetTest(int currentVolume, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataVolumeUp.csv")
    void StationVolUpTest(int currentVolume, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(currentVolume);

        int actual = radio.volumeUp(currentVolume);
        ;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testDataVolumeDown.csv")
    void StationVolDownTest(int currentVolume, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(currentVolume);

        int actual = radio.volumeDown(currentVolume);
        ;

        assertEquals(expected, actual);
    }


}




