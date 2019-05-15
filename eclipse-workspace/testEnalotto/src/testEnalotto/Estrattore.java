package testEnalotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Estrattore {
	
	{
	Set<Integer>n=new HashSet();
	List<Integer> n2=new ArrayList();
	
		for(int i=0;i<6;i++) {
			if(!n.add((int)Math.random()*90+1)){
				i--;
			}
		}
		n2.addAll(n);
		Collections.sort(n2);
		return n2;
	}
}
