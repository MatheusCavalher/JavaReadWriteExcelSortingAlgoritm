package Main;
public class BubbleSort {
	public int[] ordena(int[] vet) {
		int aux = 0;
		int i = 0;
		for (i = 0; i < 1000; i++) {
			for (int j = 0; j < 999; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		return vet;
	}
}