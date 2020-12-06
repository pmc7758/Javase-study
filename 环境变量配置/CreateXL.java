import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.FileOutputStream;
public class CreateXL {
    /** Excel �ļ�Ҫ��ŵ�λ�ã��ٶ���F����*/
    public static String outputFile = "F:\\test.xls";
    public static void main(String argv[]) {
        try {
            // �����µ�Excel ������
            HSSFWorkbook workbook = new HSSFWorkbook();
            // ��Excel�������н�һ����������Ϊȱʡֵ
            // ��Ҫ�½�һ��Ϊ"Ч��ָ��"�Ĺ����������Ϊ��
            // HSSFSheet sheet = workbook.createSheet("Ч��ָ��");
            HSSFSheet sheet = workbook.createSheet();
            // ������0��λ�ô����У���˵��У�
            HSSFRow row = sheet.createRow((short)0);
            //������0��λ�ô�����Ԫ�����϶ˣ�
            HSSFCell cell = row.createCell((short)0);
            // ���嵥Ԫ��Ϊ�ַ�������
            
            // �ڵ�Ԫ��������һЩ����
            cell.setCellValue("����ֵ");
            // �½�һ����ļ���
            FileOutputStream fOut = new FileOutputStream(outputFile);
            // ����Ӧ��Excel ����������
            workbook.write(fOut);
            fOut.flush();
            // �����������ر��ļ�
            fOut.close();
            System.out.println("�ļ�����...");
        } catch (Exception e) {
            System.out.println("������ xlCreate() : " + e);
        }
    }
}