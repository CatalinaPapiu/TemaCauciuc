package ro.sci.controller;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.CauciucSearchRequest;
import ro.sci.service.ValidationService;

public class CauciucController {
    private ValidationService validationService = new ValidationService();

    public Cauciuc handleCauciucSearchRequest(CauciucSearchRequest searchRequest) {
        Cauciuc cauciuc = this.validationService.validate(searchRequest);
        return cauciuc;

    }
}
