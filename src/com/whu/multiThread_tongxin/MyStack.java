/**
 * 
 */
package com.whu.multiThread_tongxin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class MyStack {
	
	private List list=new ArrayList();
	
	synchronized public void push()
	{
		try {
			if(list.size()==1)
				this.wait();
			list.add("anyString= "+Math.random());
			this.notify();
			System.out.println("push= "+list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	synchronized public String pop(){
		String returnValue="";
		try {
		
			if(list.size()==0)
			{
				System.out.println("pop操作为： "+Thread.currentThread().getName()+" 线程成wait状态");
				this.wait();
			}
			
			returnValue=" "+list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop= "+list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;
		
	}
	
	
	
}
