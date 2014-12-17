/**
 * Object must implement this to communicate with the view.
 * 
 * @author Chen Zhibo
 *
 */
public interface ICalculatorViewDelegate {
	
	
	/**
	 * When a key is hit, view's should implement this method.
	 * 
	 * 
	 * @param key
	 */
	public void didHitButton(int key);
	
}
