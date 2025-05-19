package builderPattern.service;

import builderPattern.domain.Engine;
import builderPattern.domain.GPSNavigator;
import builderPattern.domain.TripComputer;
import builderPattern.enums.CarType;
import builderPattern.enums.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
