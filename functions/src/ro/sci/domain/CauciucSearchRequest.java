package ro.sci.domain;

public class CauciucSearchRequest {
    public String vehicleType;
    public String diameter;

    public CauciucSearchRequest(String vehicleType, String diameter) {
        this.vehicleType = vehicleType;
        this.diameter = diameter;
    }
}
