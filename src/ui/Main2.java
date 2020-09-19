package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import datastructure.HashTable;
import datastructure.Node;

public class Main2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
	
		int c;
		int cc = 0;
		
		br.readLine();
		
		for(int i = 0;i<n;i++) {
			HashTable<String,Integer> ht = new HashTable<String,Integer>();
			ArrayList<String> names = new ArrayList<String>();
			c = 0;
			String line;
			while((line = br.readLine())!=null && !line.isEmpty()) {
				c++;
				if(ht.tableRetrieve(line)!=null) {
					cc = ht.tableRetrieve(line).getObject();
					Node<String,Integer> node = new Node<String,Integer>(line,cc+1);
					ht.tableInsert(node);
				}
				else {
					Node<String,Integer> node = new Node<String,Integer>(line,1);
					ht.tableInsert(node);
					names.add(line);
				}
				
			}
			
			Collections.sort(names);
			
			for(int j = 0;j<names.size();j++) {
				String key = names.get(j);
				Integer value = ht.tableRetrieve(key).getObject();
				System.out.printf("%s %.4f\n", key,(value*1.0/c*100));
			}
            if(i < n-1)
                System.out.println();
		}
		
	}
}
