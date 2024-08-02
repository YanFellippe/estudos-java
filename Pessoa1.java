public class Pessoa1 {
    private String nome;
    private int idade;
    private String endereço;
    private int telefone;
    private String email;
    private String CPF;    
    private String sexo;
    private String estadoCivil;
    private String profissão;
    private double salario;
    private String nacionalidade;
    private String filhos;

    public void setNome(String nome) {
        if(nome == null){
            System.out.println("O nome não pode estar vazio ou nulo");
            this.nome = nome;
        } else{
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        } else{
            System.out.println("A idade não pode ser nula ou menor que 0");
            this.idade = idade;
        }
    }

    public void setEndereço(String endereço) {
        if(endereço == null){
            System.out.println("O endereço não pode estar vazio ou nulo");
            this.endereço = endereço;
        } else{
            this.endereço = endereço;
        }
    }

    public void setTelefone(int telefone) {
            this.telefone = telefone;
    }

    public void email(String email) {
        if(email == null || !email.contains("@")){
            System.out.println("O email não está correto ou está incompleto. Coloque o simbolo '@'.");
            this.email = email;
        } else{
            this.email = email;
        }
    }

    public void setCPF(String CPF) {
            if(CPF.replaceAll("\\D", "").length() == 11){
                this.CPF = CPF;
            } else{
                System.out.println("CPF inválido. Deve conter 11 números.");
                this.CPF = CPF;
            }
    }

    public void setSexo(String sexo) {
        if (sexo == null || (!sexo.equals("Masculino") && !sexo.equals("Feminino") && !sexo.equals("Outro"))) {
            System.out.println("Sexo deve ser 'Masculino', 'Feminino' ou 'Outro'.");
            this.sexo = "Outro";
        } else {
            this.sexo = sexo;
        }
    }

    public void setEstadoCivil(String estadoCivil) {
        if (estadoCivil == null || (!estadoCivil.equals("Solteiro") && !estadoCivil.equals("Casado") && !estadoCivil.equals("Divorciado") && !estadoCivil.equals("Viúvo"))) {
            System.out.println("Estado Civil deve ser 'Solteiro', 'Casado', 'Divorciado' ou 'Viúvo'.");
            this.estadoCivil = "Solteiro";
        } else {
            this.estadoCivil = estadoCivil;
        }
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("Salário deve ser um valor positivo.");
            this.salario = salario;
        } else {
            this.salario = salario;
        }
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setFilhos(String filhos) {
        if (filhos == null || !(filhos.matches("\\d+") || filhos.equalsIgnoreCase("Nenhum") || filhos.equalsIgnoreCase("Um") || filhos.equalsIgnoreCase("Dois"))) {
            System.out.println("Filhos deve ser uma string representando um número inteiro não negativo ou termos como 'Nenhum', 'Um', 'Dois', etc.");
            this.filhos = "Nenhum";
        } else {
            this.filhos = filhos;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public int getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getProfissão() {
        return profissão;
    }

    public double getSalario() {
        return salario;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getFilhos() {
        return filhos;
    }

    public static void main(String[] args){
        Pessoa1 pessoa1 = new Pessoa1();
        pessoa1.setNome("Yan");
        pessoa1.setIdade(21);
        pessoa1.setEndereço("Rua dos Ricos, 123");
        pessoa1.setTelefone(696969696);
        pessoa1.email("yan@gmail.com");
        pessoa1.setCPF("12334568801");
        pessoa1.setSexo("Masculino");
        pessoa1.setEstadoCivil("Casado");
        pessoa1.setProfissão("Gerente de TI");
        pessoa1.setSalario(50000);
        pessoa1.setNacionalidade("Brasileiro");
        pessoa1.setFilhos("Dois");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereço());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("CPF: " + pessoa1.getCPF());
        System.out.println("Sexo: " + pessoa1.getSexo());
        System.out.println("Estado Civil: " + pessoa1.getEstadoCivil());
        System.out.println("Profissão: " + pessoa1.getProfissão());
        System.out.println("Salário: " + pessoa1.getSalario());
        System.out.println("Nacionalidade: " + pessoa1.getNacionalidade());
        System.out.println("Filhos: " + pessoa1.getFilhos());
    } 
}