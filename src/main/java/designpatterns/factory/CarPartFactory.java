package designpatterns.factory;

import designpatterns.factory.autoparts.body.AutomobileBody;
import designpatterns.factory.autoparts.body.CarBody;
import designpatterns.factory.autoparts.frame.AutomobileFrame;
import designpatterns.factory.autoparts.frame.CarFrame;

public class CarPartFactory extends AutomobilePartFactory {

    @Override
    public AutomobileFrame getFrame() {
        return new CarFrame();
    }

    @Override
    public AutomobileBody getBody() {
        return new CarBody();
    }

}
