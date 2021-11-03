package run;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class mainListas
{
	// Generic method to partition a list into sublists of size `n` each
	// in Java using `List.subList()` (The final list might have fewer items)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static<T> List[] partition(List<T> list, int n)
	{
		// get the size of the list
		int size = list.size();

		// Calculate the total number of partitions `m` of size `n` each
		int m = size / n;
		if (size % n != 0) {
			m++;
		}

		// create `m` empty lists and initialize them using `List.subList()`
		List<T>[] partition = new ArrayList[m];
		for (int i = 0; i < m; i++)
		{
			int fromIndex = i*n;
			int toIndex = (i*n + n < size) ? (i*n + n) : size;

			partition[i] = new ArrayList(list.subList(fromIndex, toIndex));
		}

		// return the lists
		return partition;
	}

	// Program to partition a list into multiple sublists in Java
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		BigDecimal tamanio = new BigDecimal(100);
		
		// source list
		List<String> list = new ArrayList<>(
				Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J","L","M","O","P","A", "B", "C", "D", "E", "F", "G", "H", "I", "J","L","M","O","P","L","M","O","P","A", "B", "C", "D", "E", "F", "G", "H", "I", "J","L","M","O","P","A", "B", "C", "D", "E", "F", "G", "H", "I", "J","L","M","O","P","L","M","O","P","O"));
		BigDecimal y = new BigDecimal(list.size());
		BigDecimal j = new BigDecimal(6);
        BigDecimal x = y.divide(j, MathContext.DECIMAL128);
        System.out.println("result: " + x + ".");
        tamanio = x.setScale(0, BigDecimal.ROUND_UP);
		System.out.println("tamanio: " + tamanio + ".");

		// partition the list into partitions of a given size
		List<String>[] partition = partition(list, tamanio.intValue());

		// print the partitions
		for (int i = 0; i < partition.length; i++) {
			System.out.println("Partition " + (i + 1) + ": " + partition[i]);
		}
	}
}