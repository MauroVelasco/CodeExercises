package main

import "fmt"

func main() {
	fmt.Println("** XOR Operation in an Array **")

	fmt.Printf("\nResult: %d", xorOperation(10, 5))
}

func xorOperation(n int, start int) int {
	a := generateArray(n, start)

	return calculateXOR(a)
}

func generateArray(n, start int) []int {
	result := make([]int, 0)

	for i := 0; i < n; i++ {
		temp := start + 2*i
		result = append(result, temp)
	}

	return result
}

func calculateXOR(numbersToCalculate []int) (result int) {
	if len(numbersToCalculate) == 0 {
		return 0
	}

	result = numbersToCalculate[0]
	for i := 1; i < len(numbersToCalculate); i++ {
		result = result ^ numbersToCalculate[i]
	}

	return
}
