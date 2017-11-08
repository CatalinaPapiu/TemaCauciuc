package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.CauciucSearchRequest;

public class ValidationService {
    private CauciucService cauciucService = new CauciucService();

    public Cauciuc validate(CauciucSearchRequest searchRequest) {
        Cauciuc validCauciuc = null;

        if (searchRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciucType(searchRequest.vehicleType);

            if (cauciuc != null && isDiameterMatching(searchRequest.diameter, cauciuc)) {
                validCauciuc = cauciuc;
            }
        }

        return validCauciuc;
    }

    private boolean isDiameterMatching(String diam, Cauciuc cauciuc) {
        return diam != null && diam.equals(cauciuc.wheelDiameter);
    }
}
