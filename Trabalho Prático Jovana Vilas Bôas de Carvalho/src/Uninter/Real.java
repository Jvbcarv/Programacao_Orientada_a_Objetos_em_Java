package Uninter;

import java.util.Objects;

//Classe filha(herdeira)
public class Real extends Moeda {
	double valor;
	
	public Real(double valor) {
		super(valor);
		this.valor = valor;
	}

//apresentação do objeto e seu atributo na lista:
	@Override
	public String toString() {
		return "Real [valor = " + valor + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(valor);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
}
