/**
 * This interfaces encapsulate the logics in computing
 * @author Chen Zhibo
 *
 */
public interface ICalculatorLogic {

	/**
	 * This method simulates a number entered to the calculator
	 * 
	 * @param number
	 */
	public void enterNumber(int number);
	
	/**
	 * This method simulates a operator entered to the calculator
	 * @param operator
	 */
	public void enterOperator(int operator);
	
	/**
	 * This method simulates a function key entered to the calculator
	 * @param functionKey
	 */
	public void enterFunctionKey(int functionKey);
}
