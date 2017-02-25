package designpatterns.buider.mandatory;

/**
 * Builder pattern where the builder forces the order in which
 * the attributes are set.  Also demonstrates how you can make
 * attributes mandatory.
 * @author Jason White
 *
 */
public class Address {

    private String street;
    private String city;
    private String state;
    private int zip;
    
    private Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
    }
    
    public static Street builder() {
        return new Builder();
    }
    
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }


    /**
     * Builder class uses interfaces to force next attribute to set by
     * return the interface of the next method.  This can be used to
     * force an order or to make attributes mandatory.  Mandatory attributes
     * can also be enforced by way of Constructors.
     * @author Jason White
     *
     */
    public static class Builder implements Street, City, State, Zip, Build {
        
        private String street;
        private String city;
        private String state;
        private int zip;
        
        public City street(String street) {
            this.street = street;
            return this;
        }
        
        public State city(String city) {
            this.city = city;
            return this;
        }
        
        public Zip state(String state) {
            this.state = state;
            return this;
        }
        
        public Builder zip(int zip) {
            this.zip = zip;
            return this;
        }
        
        public Address build() {
            return new Address(this);
        }
        
    }
    
    interface Street {
        public City street(String street);
    }
    
    interface City {
        public State city(String city);
    }
    
    interface State {
        public Zip state(String state);
    }
    
    interface Zip {
        public Builder zip(int zip);
    }
    
    interface Build {
        public Address build();
    }
    
    @Override
    public String toString() {
        return "street: " + street + ", " +
               "city: " + city + ", " +
               "state: " + state + ", " +
               "zip: " + zip;
    }
}
