package com.it.bd.utilities;

import com.it.bd.drivers.BaseDriver;

public class commonMethods extends BaseDriver{
	
	public static void timeout () throws InterruptedException {
          Thread.sleep(0);  
	}
    public static void timeout (int time) throws InterruptedException {
              Thread.sleep(time);
		
		
}

}