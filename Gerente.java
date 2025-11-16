public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, String cpf, int idade, double salario, String cargo, String departamento) {
        super(nome, cpf, idade, salario, cargo);
        this.departamento = departamento;
    }

    @Override
    public void exibirDadosBasicos() {
        super.exibirDadosBasicos();
        System.out.println("Departamento: " + departamento);
    }
}
