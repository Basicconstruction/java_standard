package Chapter3_standard.interfacee.driver;

public class IBMdriver implements UserDriver{
    @Override
    public void drive() {
        System.out.println("IBM driver.All right reserved.IBM co.");
    }
}
