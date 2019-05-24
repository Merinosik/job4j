package ru.job4j.calculate;

/**
 * Вывод строки в консоль.
 *
 * @author Andrey Tatuev (andrejtatuev@gmail.com)
 * @version $Id$
 * @since 5/24/2019
 */
public class Calculate {
	/**
	 * Main.
	 * @param args - args.
	 */
	public static void main(String[] args) {

		System.out.println("Hello World");

	}
	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}