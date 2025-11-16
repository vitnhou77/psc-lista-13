public class TesteHeranca {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("João da Silva", "000.111.222-33", 25);
        Funcionario f = new Funcionario("Maria Oliveira", "111.222.333-44", 30, 3500.00, "Analista");
        Gerente g = new Gerente("Pedro Santos", "222.333.444-55", 40, 8000.00, "Gerente", "TI");

        System.out.println("\n--- DADOS DA PESSOA ---");
        p.exibirDadosBasicos();

        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
        f.exibirDadosBasicos();
        System.out.println("Salário anual: R$" + f.calcularSalarioAnual());

        System.out.println("\n--- DADOS DO GERENTE ---");
        g.exibirDadosBasicos();
        System.out.println("Salário anual: R$" + g.calcularSalarioAnual());
    }
}
