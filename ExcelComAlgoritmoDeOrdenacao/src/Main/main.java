package Main;
import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class main {
	public static void main(String[] args) throws IOException, BiffException {
		ReadExcel ExcelRead = new ReadExcel();
		WriteExcel WriteExcel = new WriteExcel();
		QuickSort quickSort = new QuickSort();
		BubbleSort bubblesort = new BubbleSort();
		
		int[] vetorDesordenado;
		int[] vetorOrdenado;
		
		vetorDesordenado = ExcelRead.Read();
		
		quickSort.ordena(vetorDesordenado, 0, vetorDesordenado.length - 1);

		for (int i = 0; i < vetorDesordenado.length; i++) {
			System.out.println(" " + vetorDesordenado[i]);
		}
		
		vetorOrdenado = bubblesort.ordena(vetorDesordenado);
		
		try {
			WriteExcel.Write(ExcelRead.Read(), vetorOrdenado);
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
