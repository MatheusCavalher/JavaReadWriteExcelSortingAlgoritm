package Main;
import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {
	public int[] Read() {
		int[] vetor = new int[1000];
		try {
			Workbook workbook = Workbook.getWorkbook(new File(
					"ordenacao.xls"));
			Sheet sheet = workbook.getSheet(0);
			int linhas = sheet.getRows();

			for (int i = 0; i < linhas; i++) {
				Cell a = sheet.getCell(0, i);
				String as1 = a.getContents();
				vetor[i] = Integer.parseInt(as1);

				System.out.println("Linha " + i + ": " + as1);
			}
			workbook.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return vetor;
	}
}