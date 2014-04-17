package com.don.jnitest;

/**
 * 报名要和so文件的相同
 * @author chendong
 *
 */
public class MainActivity {

	 static {
	        System.loadLibrary("AddUtil");
	    }

	    public native int add(int x , int y);
	
}
