package ss.it.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalcAmountReplacer implements MethodReplacer {
	public CalcAmountReplacer() {
		System.out.println("0-param of " + this.getClass());
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalcAmountReplacer.reimplement()" + this.getClass());
		// get target class objects
		double pamt = (double) args[0];
		double rate = (double) args[1];
		double time = (double) args[2];

		// write new b.logic to execute (simple interest amount)
		return pamt * rate * time / 100;
	}

}
