package edu.qs.application.utility;
import java.text.DecimalFormat;

import org.springframework.stereotype.Component;
@Component
public class NumberFormatter {
	

	
	public String formatDecimal(double number, int decimalPlaces) {
        return String.format("%." + decimalPlaces + "f", number);
    }

}
