package builder;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void buildHeader(ExportHeaderModel ehm) {
		buffer.append("<?xml version='1.0' encoding='gb2312'?>" + LS);
		buffer.append("<Report>" + LS);
		buffer.append("    <Header>" + LS);
		buffer.append("        <DepId>" + ehm.getDepId() + "</DepId>" + LS);
		buffer.append("        <EportDate>" + ehm.getExportDate() + "</ExportDate>" + LS);
		buffer.append("    </Header>" + LS);
	}

	@Override
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
		buffer.append("    <Body>" + LS);
		for (String tblName : mapData.keySet()) {
			buffer.append("        <Datas TableName=\"" + tblName + "\">" + LS);
			for (ExportDataModel edm : mapData.get(tblName)) {
				buffer.append("            <Data>" + LS);
				buffer.append("                <ProductId>" + edm.getProductId() + "</ProductId>" + LS);
				buffer.append("                <Price>" + edm.getPrice() + "</Price>" + LS);
				buffer.append("                <Amount>" + edm.getAmount() + "</Amount>" + LS);
				buffer.append("            </Data>" + LS);
			}
			buffer.append("        </Datas>" + LS);
		}
		buffer.append("    </Body>" + LS);
	}

	@Override
	public void buildFooter(ExportFooterModel efm) {
		buffer.append("    <Footer>" + LS);
		buffer.append("        <ExportUser>" + efm.getExprotUser() + "</ExportUser>" + LS);
		buffer.append("    </Footer>" + LS);
		buffer.append("</Report>" + LS);
	}

	public StringBuffer getResult() {
		return buffer;
	}
}
