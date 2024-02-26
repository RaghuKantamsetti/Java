package org.collectionstasks.java;

import java.io.*;

import java.util.*;

public class SerializationsArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(1);
		list.add(2) ;
		list.add(3);
		try {
		FileOutputStream fout=new FileOutputStream("f.txt");
	    ObjectOutputStream out = new ObjectOutputStream(fout);
	    out.writeObject(list);
	    out.flush();
	    System.out.println("success");
	    out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
		    ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		    ArrayList s=(ArrayList)in.readObject();
		    System.out.println(s);
		    in.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

}
