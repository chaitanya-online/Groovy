def myClouser1 = {println "Hai Chay"}
myClouser1.call()

println "=========="


def str = "Hai "
def myClouser2 = {name -> println str + name}

myClouser2.call("Chaitanya")

println "=========="


def mylist = [10,20,30,40,50]
println mylist.any { item -> item >51	 }

println "=========="


println mylist.findAll { item -> item < 31 }

println "=========="

println mylist.find { item -> item == 20 }

println "=========="