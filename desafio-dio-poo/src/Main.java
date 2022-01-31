import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("curso java");
		curso.setDescricao("descricao curso java");
		curso.setCargaHoraria(8);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao(" Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(curso1);
		System.out.println(mentoria);
		
	}

}
