package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class Main1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
	
		int c;
		int cc = 0;
		
		br.readLine();
		
		for(int i = 0;i<n;i++) {
			Hashtable<String,Integer>	ht = new Hashtable<String,Integer>();
			ArrayList<String> names = new ArrayList<String>();
			c = 0;
			String line;
			while((line = br.readLine())!=null && !line.isEmpty()) {
				c++;
				if(ht.containsKey(line)) {
					cc = ht.get(line);
					ht.put(line, cc+1);
				}
				else {
					ht.put(line, 1);
					names.add(line);
				}
			}
			
			Collections.sort(names);
			
			for(int j = 0;j<names.size();j++) {
				String key = names.get(j);
				Integer value = ht.get(key);
				System.out.printf("%s %.4f\n", key,(value*1.0/c*100));
			}
            if(i < n-1)
                System.out.println();
		}
		
	}
}
