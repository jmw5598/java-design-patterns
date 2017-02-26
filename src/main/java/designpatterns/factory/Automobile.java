package designpatterns.factory;

import java.util.LinkedList;
import java.util.List;

import designpatterns.factory.autoparts.AutomobilePart;
import designpatterns.factory.autoparts.body.AutomobileBody;
import designpatterns.factory.autoparts.engine.AutomobileEngine;
import designpatterns.factory.autoparts.frame.AutomobileFrame;
import designpatterns.factory.autoparts.wheel.AutomobileWheel;

public class Automobile {
    
    private final AutomobileFrame frame;
    private final AutomobileBody body;
    private final AutomobileEngine engine;
    private final List<AutomobileWheel> wheels;
    private final List<AutomobilePart> addons;
    
    private Automobile(Builder builder) {
        this.frame = builder.frame;
        this.body = builder.body;
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.addons = builder.addons;
    }
    
    public static Frame builder(){
        return new Builder();
    }
    
    public static class Builder implements Frame, Body, Engine, Wheels, Build{
        
        private AutomobileFrame frame;
        private AutomobileBody body;
        private AutomobileEngine engine;
        private List<AutomobileWheel> wheels;
        private List<AutomobilePart> addons;
        
        public Builder() {
            addons = new LinkedList<AutomobilePart>();
        }
        
        public Body frame(AutomobileFrame frame) {
            this.frame = frame;
            return this;
        }
        
        public Engine body(AutomobileBody body) {
            this.body = body;
            return this;
        }
        
        public Wheels engine(AutomobileEngine engine) {
            this.engine = engine;
            return this;
        }
        
        public Builder wheels(List<AutomobileWheel> wheels) {
            this.wheels = wheels;
            return this;
        }
        
        public Builder addon(AutomobilePart addon) {
            addons.add(addon);
            return this;
        }
        
        public Automobile build() {
            return new Automobile(this);
        }

    }
    
    interface Frame {
        public Body frame(AutomobileFrame frame);
    }
    
    interface Body {
        public Engine body(AutomobileBody body);
    }
    
    interface Engine {
        public Wheels engine(AutomobileEngine engine);
    }
    
    interface Wheels {
        public Builder wheels(List<AutomobileWheel> wheels);
    }
    
    interface Build {
        public Automobile build();
    }
    
    @Override
    public String toString() {
        return "FRAME: " + frame + "\n" +
               "BODY: " + body + "\n" +
               "ENGINE: " + engine + "\n" +
               "WHEELS: " + wheels + "\n" +
               "ADDONS: " + addons;
    }

}
