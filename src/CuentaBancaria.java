public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, String numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return  "Titular: " + titular + ", Saldo: " + saldo + ", Número de Cuenta: " + numeroCuenta;
    }

    public void depositarDinero(double monto){

        this.saldo += monto;

    }

    public void retirarDinero(double monto){

        this.saldo -= monto;

    }
    public void mostrarInformacion(){

        System.out.println("El nombre del titular es: " + this.titular );
        System.out.println("El saldo es: " + this.saldo );
        System.out.println("El numero de cuenta es:  " + this.numeroCuenta );

    }
}
