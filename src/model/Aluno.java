package model;

public class Aluno {
	
	private Integer codigo=0;//auto-numerico só se for statico
	private String nome;
	private String disciplina;
	private Double nota1=0.;
	private Double nota2=0.;
	private Double media=0.;
	private String status;
	
	public Aluno() {
		
	}
	
	public Aluno(Integer codigo, String nome, String disciplina, Double nota1, Double nota2) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", media=" + media + ", status=" + status + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Aluno gerarMedia() {
		this.media = (this.nota1 + this.nota2)/2;
		return this;
	}
	
	public Aluno gerarStatus() {
		this.status = (this.media >= 7)?"aprovado":"reprovado";
		return this;
	}
	
	public static void main(String[] args) {
		
		// Alimentando pelo construtor
		Aluno a = new Aluno(100, "Anderson", "java", 8.5, 10.);
		System.out.println(a);
		
		// Alimentando um a um atraves do set
		Aluno aluno = new Aluno();
		aluno.setCodigo(10);
		aluno.setNome("Jose");
		aluno.setDisciplina("Java");
		aluno.setNota1(8.);
		aluno.setNota2(9.);
		System.out.println(aluno);
		
		//Gerando media e status com cascade
		Aluno a1 = new Aluno(20, "Toph", "JAVA", 10., 7.)
				.gerarMedia()
				.gerarStatus();
		
		System.out.println(a1);
	}
	
}
