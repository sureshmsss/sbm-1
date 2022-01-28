package ss.it.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class MyData3 {
	public MyData3() {
		System.out.println("0-param of " + this.getClass());
	}

}
