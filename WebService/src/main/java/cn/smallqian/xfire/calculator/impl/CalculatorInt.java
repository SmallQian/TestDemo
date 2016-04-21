package cn.smallqian.xfire.calculator.impl;

import cn.smallqian.xfire.calculator.Calculator;

/**
 * cn.smallqian.xfire.calculator.impl.CalculatorInt
 * @author Ǯ���� <br/>
 * Create at 2016��4��17�� ����7:04:59
 */
public class CalculatorInt implements Calculator {

	@Override
	public int add(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		System.out.println(a+"-"+b+"="+(a-b));
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		System.out.println(a+"/"+b+"="+(a/b));
		return a/b;
	}

}
