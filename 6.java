class  give{
	int side;
	give(int s)
	{
		this.side=s;
	}
	double area(give bs)
	{
		double A=side*side;
		return A;
	}
	public static void main(String args[])
	{
		give bs=new give(3);
		double ar=bs.area(bs);
		System.out.print("area is"+ar);
	}
}