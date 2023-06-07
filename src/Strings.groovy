public class Strings{
static void main (String[]args)
{
    def name = "Chaitanya"
    println name
    println "My name is "+name
    println "My name is ".concat(name)
    println "My name is ${name}"
    println "My name is $name"
	
	def subject = """This is groovy script"""
	println subject
	println subject.length()
	println subject[-0].toLowerCase()
}
}