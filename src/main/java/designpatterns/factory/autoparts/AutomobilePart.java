package designpatterns.factory.autoparts;

public abstract class AutomobilePart {
    
    private final String description;
    
    public AutomobilePart(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
    
}
