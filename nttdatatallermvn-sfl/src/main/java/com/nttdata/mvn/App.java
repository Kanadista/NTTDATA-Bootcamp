package com.nttdata.mvn;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * 
 * @author Sebastian Forte
 */
public class App {

	/**
	 * Metodo principal.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numberArray = { 13, 5, 67, 1, 169 };
		System.out.println(getMaxValue(numberArray));
	}

	/**
	 * Metodo para conseguir maximo valor de un array.
	 * 
	 * @param array
	 * @return int
	 */
	public static int getMaxValue(int[] array) {
		return NumberUtils.max(array);
	}
}
