package cn.smallqian.xfire.calculator.impl;

import cn.smallqian.xfire.calculator.Calculator;

/**
 * cn.smallqian.xfire.calculator.impl.CalculatorInt
 * @author 钱琦玮 <br/>
 * Create at 2016年5月30日 下午10:13:58
 */
public class CalculatorInt implements Calculator {


	@Override

	public int multabc(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		System.out.println(a+"/"+b+"="+(a/b));
		return a/b;
	}
	
	public long add(long a,long b){
		System.out.println(a+"+"+b+"="+(a+b));
		return a+b;
	}
	@Override
	public int add(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		return a+b;
	}

	
	@Override
	public int sub(int a, int b) {
		System.out.println(a+"-"+b+"="+(a-b));
		return a-b;
	}

}
