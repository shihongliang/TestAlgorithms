/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class ThreadA1 extends Thread{
	
	private Service service;

	/**
	 * @param service
	 */
	public ThreadA1(Service service) {
		super();
		this.service = service;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		service.setUsernamePassword("a", "aa");
	}
	
}
