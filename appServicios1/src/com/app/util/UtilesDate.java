package com.app.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final  class UtilesDate {
	private UtilesDate() { } 
    private static class SingletonHolder {
            private static final UtilesDate INSTANCE = new UtilesDate();
    }

    public static UtilesDate getInstance() {
            return SingletonHolder.INSTANCE;
    }

	public  String fechaHoraActual(){
		return new StringBuilder().append(fechaActual()).append(" ").append(horaActual()).toString();
	}
	public   String fechaActual(){//dd/MM/yyyy
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date()); 
		StringBuilder fecha = new StringBuilder();
		fecha.append((calendar.get(Calendar.DAY_OF_MONTH)+"").length()==1?"0"+calendar.get(Calendar.DAY_OF_MONTH):calendar.get(Calendar.DAY_OF_MONTH));
		fecha.append("/");
		fecha.append((calendar.get(Calendar.MONTH)+"").length()==1?"0"+(calendar.get(Calendar.MONTH)+1):(calendar.get(Calendar.MONTH)+1));
		fecha.append("/");
		fecha.append(calendar.get(Calendar.YEAR));
		return fecha.toString();
	}
	public   String horaActual(){//HH:mm:ss
		DateFormat df = new SimpleDateFormat("HH:mm:ss"); 
		return df.format(new Date());
	}
	
	
}
