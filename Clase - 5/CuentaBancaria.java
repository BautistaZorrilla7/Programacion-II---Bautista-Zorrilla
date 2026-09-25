public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor completo
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        setTitular(titular);
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
    }

    // Sobrecarga de constructor (delega en el completo con saldo inicial en 0)
    public CuentaBancaria(String titular, String numeroCuenta) {
        this(titular, numeroCuenta, 0.0);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo");
        }
        this.saldo += monto;
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a extraer debe ser positivo");
        }
        if (monto > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para la extracción");
        }
        this.saldo -= monto;
    }
}