package ss.it.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class DiscountReplacer implements MethodReplacer {
	public DiscountReplacer() {
		System.out.println("0-param of " + this.getClass());
	}

	@Override
	public Object reimplement(Object target, Method targetmethod, Object[] targetmethodargs) throws Throwable {
		System.out.println("DiscountReplacer.reimplement()");
		// get the target objects
		double price = (double) targetmethodargs[0];
		double discount = (double) targetmethodargs[1];
		return price-((price/100)*25);
	}

}
