package Com.Webshop_GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	
	public String LocalDateAndTime() {
		String Value = LocalDateTime.now().toString().replace(":", "" ).replace(".","").replace("-","" );
		return Value;
		
	}

}
