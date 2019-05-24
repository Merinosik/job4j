package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 * @author Andrey Tatuev (andrejtatuev@gmail.com)
 * @version $Id$
 * @since 5/25/2019
 */
 public class CalculateTest {
 /**
 * Test echo
 */
 
 @Test
  public void whenTakeNameThenThreeEchoPlusName () {
	  String input = "Andrey Tatuev";
	  String expect = "Echo, echo, echo : Andrey Tatuev";
	  Calculate calc = new Calculate();
	  String result = calc.echo(input);
	  assertThat(result, is(expect));
  }
 }
 