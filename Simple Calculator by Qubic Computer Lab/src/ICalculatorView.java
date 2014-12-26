/**
 * This class initiates and puts up the view
 * @author Chen Zhibo
 *
 */
public interface ICalculatorView {

	public ICalculatorViewDelegate delegate = null;
	
	/**
	 * This function is invoked when a view created,
	 * causing the program to add various UI objects
	 * to the user interface.
	 */
	public void init();
	
	
}
