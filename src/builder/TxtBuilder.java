package builder;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void buildHeader(ExportHeaderModel ehm) {
		buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + LS);
	}

	@Override
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
		for (String tblName : mapData.keySet()) {
			buffer.append(tblName + LS);
			for (ExportDataModel edm : mapData.get(tblName)) {
				buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + LS);
			}
		}
	}

	@Override
	public void buildFooter(ExportFooterModel efm) {
		buffer.append(efm.getExprotUser() + LS);
	}

	public StringBuffer getResult() {
		return buffer;
	}
}
