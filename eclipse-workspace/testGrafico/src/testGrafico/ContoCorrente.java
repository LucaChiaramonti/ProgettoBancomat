package testGrafico;

public class ContoCorrente {
	
	private Integer saldo=400;
	
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	public int deposito(int d) {
		if(d>0) {
		saldo=d+saldo;
		}
		return saldo;
	}
	public int prelievo(int p) {
		if (p<saldo) {
			saldo=saldo-p;
		}
		return saldo;
	}
}
