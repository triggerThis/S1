package com.sprhib.transaction;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;



public class PointcutService implements IPointcutService, java.io.Serializable {
    
  
    
    public boolean test() throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        //支付业务实现
        return true;
    }

	public boolean test(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean test(Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	public void test(Map map, int i) {
		// TODO Auto-generated method stub
		
	}

	public void test(Set<TestMap> set) {
		// TODO Auto-generated method stub
		
	}

	public void test(Stack<Map> list) {
		// TODO Auto-generated method stub
		
	}

}
