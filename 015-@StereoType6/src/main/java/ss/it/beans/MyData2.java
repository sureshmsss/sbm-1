package ss.it.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class MyData2 {
	public MyData2() {
		System.out.println("0-param of " + this.getClass());
	}

}
