package designpatterns.factory;

import java.util.LinkedList;
import java.util.List;

import designpatterns.factory.autoparts.AutomobilePart;
import designpatterns.factory.autoparts.body.AutomobileBody;
import designpatterns.factory.autoparts.engine.AutomobileEngine;
import designpatterns.factory.autoparts.engine.EngineType;
import designpatterns.factory.autoparts.engine.V6Engine;
import designpatterns.factory.autoparts.engine.V8Engine;
import designpatterns.factory.autoparts.extra.AddonType;
import designpatterns.factory.autoparts.extra.Alarm;
import designpatterns.factory.autoparts.extra.Bluetooth;
import designpatterns.factory.autoparts.extra.CDPlayer;
import designpatterns.factory.autoparts.extra.Navigation;
import designpatterns.factory.autoparts.extra.Sunroof;
import designpatterns.factory.autoparts.frame.AutomobileFrame;
import designpatterns.factory.autoparts.wheel.AlloyWheel;
import designpatterns.factory.autoparts.wheel.AutomobileWheel;
import designpatterns.factory.autoparts.wheel.PremiumWheel;
import designpatterns.factory.autoparts.wheel.WheelType;

public abstract class AutomobilePartFactory {
    
    public abstract AutomobileFrame getFrame(); 
    public abstract AutomobileBody getBody();
    
    
    public List<AutomobileWheel> getWheelSet(WheelType type) {
        
        List<AutomobileWheel> wheels = new LinkedList<AutomobileWheel>();
        
        if(WheelType.PREMIUM == type) {
            wheels.add(new PremiumWheel());
            wheels.add(new PremiumWheel());
            wheels.add(new PremiumWheel());
            wheels.add(new PremiumWheel());
            return wheels;
        }
            
        if(WheelType.ALLOY == type) {
            wheels.add(new AlloyWheel());
            wheels.add(new AlloyWheel());
            wheels.add(new AlloyWheel());
            wheels.add(new AlloyWheel());
            return wheels;
        }
        return null;
    }
    
    
    public AutomobileEngine getEngine(EngineType type) {
        
        if(EngineType.V6 == type) 
            return new V6Engine();
        
        if(EngineType.V8 == type) 
            return new V8Engine();
        
        return null;
    }
    
    
    public AutomobilePart getAddon(AddonType type) {
        
        if(AddonType.SUNROOF == type)
            return new Sunroof();
        
        if(AddonType.ALARM == type)     
            return new Alarm();
        
        if(AddonType.BLUETOOTH == type) 
            return new Bluetooth();
        
        if(AddonType.CDPLAYER == type)  
            return new CDPlayer();
        
        if(AddonType.NAVIGATION == type)
            return new Navigation();
        
        return null;
    }
}
