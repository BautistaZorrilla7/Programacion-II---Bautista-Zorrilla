class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo actual: " + saldo);
    }
}

class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Estudiante", 1500.0);
        cuenta.consultarSaldo();
        cuenta.depositar(500.0);
    }
}