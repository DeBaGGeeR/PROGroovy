package Task6;

/**
 * @author Bakhodir Ibragimov
 */
/*

def text = "1994-02-012003-13-12 abs20a3002-q-wj 3029-30-01"
def regex = "\\d{4}-\\d{2}-\\d{2}"



def matcher = text =~ regex

// The first way:
println 'first way'
matcher.each{ println it }

// The second way:
println 'second way'
for(match in matcher){
	println match
}

//The third way:
println 'third way'
text.eachMatch(regex){println it}