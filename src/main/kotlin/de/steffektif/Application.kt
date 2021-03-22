package de.steffektif

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("de.steffektif")
		.start()
}

