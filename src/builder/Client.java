package builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		ExportHeaderModel ehm = new ExportHeaderModel();
		ehm.setDepId("DepartmentOne");
		ehm.setExportDate("2010-05-18");

		Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
		Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
		ExportDataModel edm1 = new ExportDataModel();
		edm1.setProductId("Product001");
		edm1.setPrice(100);
		edm1.setAmount(80);
		ExportDataModel edm2 = new ExportDataModel();
		edm2.setProductId("Product002");
		edm2.setPrice(99); 
		edm2.setAmount(55);
		col.add(edm1);
		col.add(edm2);
		mapData.put("SaleRecoder", col);

		ExportFooterModel efm = new ExportFooterModel();
		efm.setExportUser("zhang3");

		TxtBuilder txtBuilder = new TxtBuilder();
		Director director = new Director(txtBuilder);
		director.construct(ehm, mapData, efm);
		System.out.println("output to txt:" + Builder.LS + txtBuilder.getResult());

		XmlBuilder xmlBuilder = new XmlBuilder();
		Director director2 = new Director(xmlBuilder);
		director2.construct(ehm, mapData, efm);
		System.out.println("output to xml:" + Builder.LS + xmlBuilder.getResult());
	}
}
