package designpatterns.buider.optional;

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
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        
        private String street;
        private String city;
        private String state;
        private int zip;
        
        public Builder street(String street) {
            this.street = street;
            return this;
        }
        
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        
        public Builder state(String state) {
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

    @Override
    public String toString() {
        return "street: " + street + ", " +
               "city: " + city + ", " +
               "state: " + state + ", " +
               "zip: " + zip;
    }
    
}
