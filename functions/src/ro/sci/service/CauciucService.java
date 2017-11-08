package ro.sci.service;

import ro.sci.domain.Cauciuc;

public class CauciucService {
    private Cauciuc[] cauciuce;

    public CauciucService() {
        initLocalCauciuce();
    }

    public Cauciuc findCauciucType(String vehicleType) {
        Cauciuc foundType = null;
        for (Cauciuc cauciuc: cauciuce) {
            if (vehicleType != null && vehicleType.equals(cauciuc.vehicleType)) {
                foundType = cauciuc;
                break;
            }
        }
        return foundType;
    }

    public Cauciuc findCauciucDiam(String diameter) {
        Cauciuc foundDiam = null;
        for (Cauciuc cauciuc: cauciuce) {
            if (diameter != null && diameter.equals(cauciuc.wheelDiameter)) {
                foundDiam = cauciuc;
                break;
            }
        }
        return foundDiam;
    }

    private void initLocalCauciuce() {
        // declaring some test cauciuce products so that we can search through them
        Cauciuc c1 = new Cauciuc("SUV");
        c1.wheelDiameter = "R15";

        Cauciuc c2 = new Cauciuc("truck");
        c2.wheelDiameter = "R20";

        Cauciuc c3 = new Cauciuc("van");
        c3.wheelDiameter = "R17";

        cauciuce = new Cauciuc[]{c1, c2, c3};
    }
}
