package designpatterns.factory.autoparts.wheel;

import designpatterns.factory.autoparts.AutomobilePart;

public abstract class AutomobileWheel extends AutomobilePart {
    public AutomobileWheel(String description) {
        super(description);
    }
}
