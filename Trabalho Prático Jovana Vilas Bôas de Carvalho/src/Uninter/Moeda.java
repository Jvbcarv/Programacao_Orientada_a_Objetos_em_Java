package Uninter;

import java.util.Objects;

import javax.swing.Spring;

//Classe mãe(herdada)
public abstract class Moeda {
	double valor;
	public double totalSoma;
	

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}


//método para determinar se os objetos são iguais, para que o sistema possa realizar a remoção correta do objeto que o usuário escolher:
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	}

