import java.util.ArrayList;
import java.util.List;

public class Medals {
	public static void main(String[] args) {
		final int LENGTH = 3;
		final int MEDALS = 5;
		final int countriesLen = 8;
		final int listsLen = 4;
		int totalNum = 0;
		List<Integer> Totals = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();
		
		List<String> countries = new ArrayList<String>();
		countries.add("Canada");
		countries.add("Italy");
		countries.add("Germany");
		countries.add("Japan");
		countries.add("Kazakhstan");
		countries.add("Russia");
		countries.add("South Korea");
		countries.add("United States");
		
		List<Integer> gold = new ArrayList<Integer>();
		gold.add(0);
		gold.add(0);
		gold.add(0);
		gold.add(1);
		gold.add(0);
		gold.add(3);
		gold.add(0);
		gold.add(1);
		
		List<Integer> silver = new ArrayList<Integer>();
		silver.add(3);
		silver.add(0);
		silver.add(0);
		silver.add(0);
		silver.add(0);
		silver.add(1);
		silver.add(1);
		silver.add(0);
		
		List<Integer> bronze = new ArrayList<Integer>();
		bronze.add(0);
		bronze.add(1);
		bronze.add(1);
		bronze.add(0);
		bronze.add(1);
		bronze.add(1);
		bronze.add(0);
		bronze.add(1);
		
		
		
		for(int i = 0; i < countriesLen ; i++) {
			totalNum = gold.get(i)+silver.get(i)+bronze.get(i);
			total.add(totalNum);
			totalNum = 0;
		}
		
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(gold);
		lists.add(silver);
		lists.add(bronze);
		lists.add(total);
		
		String line = "";
		ArrayList<String>columns=new ArrayList();
		columns.add("Countries");
		columns.add("Gold");
		columns.add("Silver");
		columns.add("Bronze");
		columns.add("Total");
		for (int i = 0; i< MEDALS;i++) {
			System.out.printf("%7s",columns.get(i));
			
		}
		System.out.println();
		//System.out.println("Country      Gold      Silver      Bronze      Total");
		for(int i = 0; i < countriesLen ; i++) {
			
			line =countries.get(i)+ "     " +gold.get(i)+ "    " +silver.get(i)+ "    " +bronze.get(i)+ "    " +total.get(i);
			System.out.printf("%35s%n",line);
			//System.out.println();
		}
	
		for (int i = 0; i < listsLen; i++) {
		  for(int j = 0; j < countriesLen; ++j) {
			  
			  totalNum += lists.get(i).get(j);
		  }
		  Totals.add(totalNum);
		  totalNum = 0;
		}
		System.out.printf("%18s","Totals    ");
		System.out.print(Totals);

}
}
