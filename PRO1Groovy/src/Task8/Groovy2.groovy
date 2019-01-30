package Task8;

import javax.swing.JOptionPane

/**
 * @author Bakhodir Ibragimov
 */

/*
 Wypisać listę liczb posortowanych w porządku rosnącym. Z listy wejściowej  utworzyć oddzielną listę liczb mniejszych od zera.
 Pomoc: zastosuj  sort i findAll
 */

def nums = JOptionPane.showInputDialog("Lista:").tokenize()*.toInteger()
println "before sorting: " +  nums
nums.sort()
println "after sorting: " + nums

def selectedNums = nums.findAll {it < 0}

println "smaller than 0: $selectedNums"