package Task5;

/**
 * @author Bakhodir Ibragimov
 * */

/*
 Napisać funkcję String reverseWords(String s) zwracającą napis, składający się ze słów napisu s w odwrotnej kolejności.
 Np.  reverseWords("ala ma kota") zwróci "kota ma ala"
 */


String reverseWords(String s){

	def words = s.tokenize()

	return words[-1..0]
}

def letters = "abc def ghi"

println reverseWords(letters)
println reverseWords(/ala ma kota/)