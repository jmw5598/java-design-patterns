package designpatterns.factory;

import designpatterns.factory.autoparts.body.AutomobileBody;
import designpatterns.factory.autoparts.body.TruckBody;
import designpatterns.factory.autoparts.frame.AutomobileFrame;
import designpatterns.factory.autoparts.frame.TruckFrame;

public class TruckPartFactory extends AutomobilePartFactory {

    @Override
    public AutomobileFrame getFrame() {
        return new TruckFrame();
    }

    @Override
    public AutomobileBody getBody() {
        return new TruckBody();
    }

}
