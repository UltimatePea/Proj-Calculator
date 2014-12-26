/**
 * This class is responsible for a number object 
 * which is crucial in the development of calculator.
 * 
 * This number can either be a integer(long) or a float(double)
 * But it can always give back result;
 * 
 * @author Chen Zhibo
 *
 */
public interface ICalculatorNumber {
	/**
	 * The method for constructing CalculatorNumber instance
	 * number must be ranging from 0-9
	 * @param number
	 */
	public void insertNumber(int number);
	
	/**
	 * If there exists an decimal point already, 
	 * the method callreturns false
	 * @return
	 */
	public boolean canInsertDecimalPoint();
	
	/**
	 * Insert a decimal point
	 * 
	 * @throws IllegalDecimalPointException if <code>canInsertDecimalPoint()</code> evaluates true;
	 * 
	 */
	public void insertDecimalPoint() throws IllegalDecimalPointException;
	
	/**
	 * return the result if this number is added to another number
	 * e.g. (2).addAnotherNumber(3) evaluates 5
	 * @param anotherNumber
	 * @return
	 */
	public ICalculatorNumber addAnotherNumber(ICalculatorNumber anotherNumber);
	
	/**
	 * return the result if this number is subtracted from another number
	 * e.g. (2).subtractAnotherNumber(3) evaluates -1
	 * @param anotherNumber
	 * @return
	 */
	public ICalculatorNumber substractAnotherNumber(ICalculatorNumber anotherNumber);
	
	/**
	 * return the result if this number is multiplied by another number
	 * e.g. (2).multiplyAnotherNumber(3) evaluates 6
	 * @param anotherNumber
	 * @return
	 */
	public ICalculatorNumber multiplyAnotherNumber(ICalculatorNumber anotherNumber);
	
	/**
	 * return the result if this number is divided by another number
	 * e.g. (2).dividedByAnotherNumber(3) evaluates 2/3
	 * @param anotherNumber
	 * @return
	 */
	public ICalculatorNumber dividedByAnotherNumber(ICalculatorNumber anotherNumber);
	
	public String getResult();
	

}
