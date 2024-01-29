var firstNumber = [8, 12, 6, 20, 10];
var secondNumber = [2, 3, 3, 4, 5];
var numProblems = firstNumber.length;

function start() {
    println("Welcome to my Math Quiz!");
    var type = readLine("Please select (M)ultipliction or (D)ivision:");
    // Call function to print problems
    var score = calculate(type) * 100 / numProblems;
    println("Your score on the test: " + score + "%")
}

/*
This function prints the problems out based on the type that
is passes as a parameter. It returns the number of correct
answers.
*/

function calculate(type){
    var score = 0; // Holds number correct
    var correct; // Holds  correct answer
    for (var i=0; i < numProblems; i++){
        if (type == "M"){
            println(firstNumber[i] + " * " + secondNumber[i]);
            correct = firstNumber[i] * secondNumber[i];
        }
        else{
            println(firstNumber[i] + " / " + secondNumber[i]);
            correct = firstNumber[i] / secondNumber[i];
        }
        println();
        var answer = readInt("Enter your answer: ");
        if (answer == correct){
            println("Correct!");
            score ++;
        }
        else{
            println("Good try!");
        }
        println();
    }
    return score;
}