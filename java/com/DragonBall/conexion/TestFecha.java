package com.DragonBall.conexion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd");
		String fechastr="2023/04/21";
		try {
			Date fecha=sf.parse(fechastr);
			System.out.println(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
