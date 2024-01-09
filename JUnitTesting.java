package lab11;

		public class JUnitTesting {
			public int square (int x) {
			return x*x;
			}
			public int countA(String word)
			{
			int count = 0;
			for (int i=0; i <word.length();i++)
			{
			if(word.charAt(i)=='b' || word.charAt(i)=='B')
			{
			count++;
			}
			}
			return count;
			}
			
		public static void main(String[] args) {

}
}
