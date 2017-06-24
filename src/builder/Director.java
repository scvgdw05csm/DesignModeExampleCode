package builder;

import java.util.Collection;
import java.util.Map;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder; 
	}

	public void construct(ExportHeaderModel ehm,
			Map<String, Collection<ExportDataModel>> mapData,
			ExportFooterModel efm) {
		builder.buildHeader(ehm);
		builder.buildBody(mapData);
		builder.buildFooter(efm);
	}
}
