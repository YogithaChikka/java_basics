class  HackerEarth_StringPalindrome
{
	public static void main(String[] args) 
	{
		String s = "aba";
		System.out.println(s.length());
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			reverse += s.charAt(i);
		}
		if (reverse.equals(s))
		{
			System.out.println("YES");
		}
		else 
		{
			System.out.println("NO");
		}
	}
}
