package designpatterns.buider.optional;

public class Application {
    
    public static void main(String[] args) {
        System.out.println(
            Address.builder()
                   .street("1234 Marc")
                   .city("Detroit")
                   .state("MI")
                   .zip(48029)
                   .build()
        );
    }
}
