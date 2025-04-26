public class Funcionario {
    protected String nome;
    protected double salario;
    private double salarioTotal;

    public Funcionario() {
        this.nome = "Funcionário Padrão";
        this.salario = 0.0;
        this.salarioTotal = 0.0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    public double calcularBonus(double percentualExtra) {
        return salario * (0.10 + percentualExtra);
    }


    public String exibirDados() {
        System.out.println("---------------------------");
        return "Nome: " + nome + " Salário: R$ " + salario + " Bônus: R$ " + calcularBonus();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
