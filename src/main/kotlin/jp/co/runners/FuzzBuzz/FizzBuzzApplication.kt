package jp.co.runners.FuzzBuzz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FuzzBuzzApplication

fun main(args: Array<String>) {
	runApplication<FuzzBuzzApplication>(*args)
}
