import java.util.List;
import java.util.Map;

// Won't compile
interface OrderCounter {
	// Name maps to list of order numbers
	int totalOrders(Map<String, List<String>> orders);
}