import java.util.ArrayList;

public class EntendendoForIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++) {
			System.out.println(i);	
		}

		ArreyList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(1, "André"));
		alunos.add(new Aluno(2, "Juca"));
		alunos.add(new Aluno(3, "zé"));
		
		for(Aluno aluno:alunos) {
			System.out.println(aluno.getNome());
			
		}
		
	}
	

}
