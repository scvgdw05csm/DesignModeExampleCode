package builder;

import java.util.Collection;
import java.util.Map;

public interface Builder {

	public static final String LS = System.getProperty("line.separator");

	public void buildHeader(ExportHeaderModel ehm);
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData);
	public void buildFooter(ExportFooterModel efm);
}
