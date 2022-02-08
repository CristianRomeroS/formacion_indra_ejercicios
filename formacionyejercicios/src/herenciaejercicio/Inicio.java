package herenciaejercicio;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombres=new String[3];
		nombres[0]="jose";
		nombres[1]="jose2";
		nombres[2]="jose3";
		
		Alumno alum=new Alumno(nombres,23,"hombre","nada","todos","a");
		System.out.println(alum.toString());
	}

}
