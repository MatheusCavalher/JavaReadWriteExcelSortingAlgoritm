package Main;
import java.io.File;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteExcel {
	public void Write(int[] vetorDesordenado, int[] vetorOrdenado) throws WriteException {
		try {
			String filename = "ordenacao2.xls";

			WritableWorkbook workbook = Workbook.createWorkbook(new File(filename));
			WritableSheet sheet = workbook.createSheet("First Sheet", 0);
			WritableCellFormat cellFormat = new WritableCellFormat();
			cellFormat.setAlignment(Alignment.CENTRE);

			for (int i = 0; i < 1000; i++) {
				jxl.write.Label label = new jxl.write.Label(0, i, String.valueOf(vetorDesordenado[i]), cellFormat);
				sheet.addCell(label);
			}
			
			for (int i = 0; i < 1000; i++) {
				jxl.write.Label label2 = new jxl.write.Label(1, i, String.valueOf(vetorOrdenado[i]), cellFormat);
				sheet.addCell(label2);
			}
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}