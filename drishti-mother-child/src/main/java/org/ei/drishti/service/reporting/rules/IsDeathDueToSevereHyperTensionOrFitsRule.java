package org.ei.drishti.service.reporting.rules;

import org.ei.drishti.util.SafeMap;
import org.springframework.stereotype.Component;

import static org.ei.drishti.common.AllConstants.ECCloseFields.HYPERTENSION_FITS_VALUE;
import static org.ei.drishti.common.AllConstants.ECCloseFields.MATERNAL_DEATH_CAUSE_FIELD_NAME;

@Component
public class IsDeathDueToSevereHyperTensionOrFitsRule implements IRule {

    @Override
    public boolean apply(SafeMap reportFields) {
        return HYPERTENSION_FITS_VALUE.equalsIgnoreCase(reportFields.get(MATERNAL_DEATH_CAUSE_FIELD_NAME));
    }
}

