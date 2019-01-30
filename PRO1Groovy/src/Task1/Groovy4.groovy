package Task1

import javax.swing.JOptionPane

/**
 * @author Bakhodir Ibragimov
 * */

/*
 Napisać pogram przekształcający liczby na ich słowne odpowiedniki.
 Np. po wprowadzeniu liczby 147 winniśmy uzyskać jeden - cztery - siedem.
 */


def num = JOptionPane.showInputDialog("number:")

try{
	num as int
}catch(Exception e){
	return
}

def result = ""

for(char c in num){
	switch(c){
		case '1':
			result +="one-"
			break;
		case '2':
			result +="two-"
			break;
		case '3':
			result +="tree-"
			break;
		case '4':
			result +="four-"
			break;
		case '5':
			result +="five-"
			break;
		case '6':
			result +="six-"
			break;
		case '7':
			result +="seven-"
			break;
		case '8':
			result +="eight-"
			break;
		case '9':
			result +="nine-"
			break;
		case '0':
			result +="zero-"
			break;
	}
}

println result[0..-2]
