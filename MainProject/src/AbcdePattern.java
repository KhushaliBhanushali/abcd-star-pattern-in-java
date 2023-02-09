
public class AbcdePattern {

	public static void main(String[] args) {
				
      AbcdePattern pattern = new AbcdePattern();
      pattern.text();
	}

	public void text() {
		int r=5;
		int c=8; 
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String word="";
		for(int i=0; i<r; i++) {
			for(int k=0; k<str.length();k++)
			{
				     if(str.charAt(k)=='A') {	word = A[i];}
				else if(str.charAt(k)=='B') { 	word = B[i];}
				else if(str.charAt(k)=='C') {	word = C[i];}
				else if(str.charAt(k)=='D') {	word = D[i];}
				else if(str.charAt(k)=='E') {	word = E[i];}
				else if(str.charAt(k)=='F') {	word = F[i];}
				else if(str.charAt(k)=='G') {	word = G[i];}
				else if(str.charAt(k)=='H') {	word = H[i];}
				else if(str.charAt(k)=='I') {	word = I[i];}
				else if(str.charAt(k)=='J') {	word = J[i];}
				else if(str.charAt(k)=='K') {	word = K[i];}
				else if(str.charAt(k)=='L') {	word = L[i];}
				else if(str.charAt(k)=='M') {	word = M[i];}
				else if(str.charAt(k)=='N') {	word = N[i];}
				else if(str.charAt(k)=='O') {	word = O[i];}
				else if(str.charAt(k)=='P') {	word = P[i];}
				else if(str.charAt(k)=='Q') {	word = Q[i];}
				else if(str.charAt(k)=='R') {	word = R[i];}
				else if(str.charAt(k)=='S') {	word = S[i];}
				else if(str.charAt(k)=='T') {	word = T[i];}
				else if(str.charAt(k)=='U') {	word = U[i];}
				else if(str.charAt(k)=='V') {	word = V[i];}
				else if(str.charAt(k)=='W') {	word = W[i];}
				else if(str.charAt(k)=='X') {	word = X[i];}
				else if(str.charAt(k)=='Y') {	word = Y[i];}
				else if(str.charAt(k)=='Z') {	word = Z[i];}
				else {continue;}
				for(int j=0; j<c; j++) {
				    if(word.charAt(j) == '1') {
					//System.out.print("*");}
				    System.out.print(str.charAt(k));
				    }else {
				    	System.out.print(" ");
				    }
				
				}
			}
			System.out.println();
		}

	}
	
	String A[]= {"00011000","00100100","01000010","01111110","01000010"};
	String B[]= {"01111000","01000100","01111000","01000100","01111000"};
	String C[]= {"01111100","10000000","10000000","10000000","01111100"};
	String D[]= {"01111100","00100010","00100010","00100010","01111100"};
	String E[]= {"01111110","01000000","01111110","01000000","01111110"};
	String F[]= {"01111110","01000000","01111110","01000000","01000000"};
	String G[]= {"01111000","10000000","10001110","10001000","01111000"};
	String H[]= {"01000010","01000010","01111110","01000010","01000010"};
	String I[]= {"01111100","00010000","00010000","00010000","01111100"};
	String J[]= {"00111110","00000010","00000010","00100010","00011100"};
	String K[]= {"01000010","01000100","01010000","01000100","01000010"};
	String L[]= {"01000000","01000000","01000000","01000000","01111110"};
	String M[]= {"01000001","01010101","01001001","01000001","01000001"};
	String N[]= {"01000001","01100001","01001001","01000011","01000001"};
	String O[]= {"00111100","01000010","01000010","01000010","00111100"};
	String P[]= {"01111100","01000010","01010100","01000000","01000000"};
	String Q[]= {"00111100","01000010","01000010","01001010","00111101"};
	String R[]= {"01111100","01000010","01010100","01000100","01000010"};
	String S[]= {"00111110","01000000","00111100","00000010","00111110"};
	String T[]= {"01111100","00010000","00010000","00010000","00010000"};
	String U[]= {"01000010","01000010","01000010","01000010","00111100"};
	String V[]= {"10000001","01000010","00100100","00010000","00010000"};
	String W[]= {"10000010","10000010","10010010","10101010","10000010"};
	String X[]= {"01000001","00100010","00001000","00100010","01000001"};
	String Y[]= {"01000001","00100010","00010100","00001000","00001000"};
	String Z[]= {"01111110","00000100","00001000","00100000","01111110"};
	
	
}