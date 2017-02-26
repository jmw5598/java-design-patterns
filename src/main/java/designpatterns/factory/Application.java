package designpatterns.factory;

import designpatterns.factory.autoparts.engine.EngineType;
import designpatterns.factory.autoparts.extra.AddonType;
import designpatterns.factory.autoparts.wheel.WheelType;

public class Application {
    
    public static void main(String[] args) {
        
        /** BUILDING A CAR WITH CarPartFactory() */
        AutomobilePartFactory factory = new CarPartFactory();
        System.out.println(
            Automobile.builder()
                      .frame(factory.getFrame())
                      .body(factory.getBody())
                      .engine(factory.getEngine(EngineType.V6))
                      .wheels(factory.getWheelSet(WheelType.PREMIUM))
                      .addon(factory.getAddon(AddonType.SUNROOF))
                      .addon(factory.getAddon(AddonType.NAVIGATION))
                      .addon(factory.getAddon(AddonType.BLUETOOTH))
                      .addon(factory.getAddon(AddonType.ALARM))
                      .addon(factory.getAddon(AddonType.CDPLAYER))
                      .build()
        );
        
        System.out.println();
        
        /** BUILDING A TRUCK WITH TruckPartFactory() */
        factory = new TruckPartFactory();
        System.out.println(
            Automobile.builder()
                      .frame(factory.getFrame())
                      .body(factory.getBody())
                      .engine(factory.getEngine(EngineType.V8))
                      .wheels(factory.getWheelSet(WheelType.ALLOY))
                      .addon(factory.getAddon(AddonType.ALARM))
                      .addon(factory.getAddon(AddonType.CDPLAYER))
                      .build()
        );
        
    }
    
}
