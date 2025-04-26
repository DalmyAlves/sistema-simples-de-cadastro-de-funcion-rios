public class Gerente extends Funcionario {
    private double bonusExtra;

    public Gerente(String nome, double salario ,double bonusExtra) {
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }

    public double getBonusExtra() {
        return bonusExtra;
    }

    public void setBonusExtra(double bonusExtra) {
        this.bonusExtra = bonusExtra;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10 + bonusExtra;
    }

    @Override
    public String exibirDados() {
        return "Nome " + nome + "Salário: R$ " + salario + "Bônus Extra: R$ " + bonusExtra + "Bônus Total: R$ " + calcularBonus();
    }
}
