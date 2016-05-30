package cn.smallqian.xfire.hello.impl;

import cn.smallqian.xfire.hello.Hello;

/**
 * cn.smallqian.xfire.hello.impl.HelloImpl
 * @author 钱琦玮 <br/>
 * Create at 2016年5月30日 下午10:40:12
 */
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String Message) {
		System.out.println(Message);
		return "smallqian"+Message;
	}

}
