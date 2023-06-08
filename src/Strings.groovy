public class Strings{
static void main (String[]args)
{
    def name = "Chaitanya"
    println name
    println "My name is "+name
    println "My name is ".concat(name)
    println "My name is ${name}"
    println "My name is $name"
	println '=========='
	
	def str = / Sky is blue /
	println str
	println '=========='
	def str1 = $/ Sky is blue /$
	println str
	
	def subject = """This is groovy script"""
	println subject
	println subject.length()
	println subject[-0].toLowerCase()
	println subject.isBlank()
	println subject.isEmpty()
println name[1,5,6]
println "substring " + name.substring(4)  +' substring '+ name.substring(1, 4) 

def language = 'Groovy Script '
println language.split(" ")
println language-("Groovy")
println language*3
	
	
}

}