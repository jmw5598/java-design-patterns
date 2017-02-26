package designpatterns.factory.autoparts.wheel;

import java.util.List;

public class WheelSet {
    private List<AutomobileWheel> wheels;
    
    public WheelSet(List<AutomobileWheel> wheels) {
        this.wheels = wheels;
    }
    
    @Override
    public String toString() {
        return wheels.toString();
    }
}
