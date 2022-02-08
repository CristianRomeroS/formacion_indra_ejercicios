package herencia.ejerc1;

public abstract class Empleado {

		public String nombre;
		public int edad;
		public int salario;
		public final int plus = 300;
		
		//CONSTRUCTOR
		public Empleado(String nombre, int edad, int salario) {
			
			this.nombre = nombre;
			this.edad = edad;
			this.salario = salario;
			
		}
		//GETTERS & SETTERS
		public String getNombre() {return nombre;}

		public void setNombre(String nombre) {this.nombre = nombre;}

		public int getEdad() {return edad;}

		public void setEdad(int edad) {this.edad = edad;}

		public int getSalario() {return salario;}

		public void setSalario(int salario) {this.salario = salario;}

		
		//METODO PLUS
		
		public abstract  void plus();
}
