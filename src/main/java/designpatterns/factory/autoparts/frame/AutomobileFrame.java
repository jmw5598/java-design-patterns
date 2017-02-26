package designpatterns.factory.autoparts.frame;

import designpatterns.factory.autoparts.AutomobilePart;

public abstract class AutomobileFrame extends AutomobilePart {
    public AutomobileFrame(String description) {
        super(description);
    }
}
