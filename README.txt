# Junit5_test_training

Exercice 1 – Addition simple

Écris une fonction add(a: Int, b: Int): Int.

Teste add(2, 3) == 5

Teste add(-1, 1) == 0

Teste add(0, 0) == 0

Exercice 2 – Division avec exception

Écris une fonction divide(a: Int, b: Int): Int.

Teste divide(10, 2) == 5

Teste que divide(5, 0) lance une IllegalArgumentException

Exercice 3 – Vérifier pair ou impair

Écris une fonction isEven(n: Int): Boolean.

Teste avec plusieurs nombres : 2, 3, 0, -4

Exercice 4 – Classe Calculator

Écris une classe Calculator avec les méthodes :

add(a,b), subtract(a,b), multiply(a,b), divide(a,b)

Teste toutes les méthodes avec plusieurs valeurs

Teste que divide par 0 lance une exception

Exercice 5 – Filtrer une liste

Écris une fonction filterEven(numbers: List<Int>): List<Int>.

Teste qu'une liste retourne seulement une liste de nombre pair

Teste qu’une liste vide retourne une liste vide

Exercice 6 – Factorielle

Écris une fonction factorial(n: Int): Int.

Teste pour n = 0, 5, 10

Teste que n < 0 lance une exception

Exercice 7 – Vérifier un palindrome

Écris une fonction isPalindrome(s: String): Boolean.

Teste "radar", "hello", "", "a"

Exercice 8 – Test paramétré

Écris une fonction square(n: Int): Int.

Crée un test paramétré avec ces cas : (2,4), (3,9), (0,0), (-5,25)

Exercice 9 – Liste d’objets

Crée une classe Person(val name: String, val age: Int).
Écris une fonction filterAdults(people: MutableList<Person>): MutableList<Person> qui retourne uniquement ceux de 18 ans ou plus.

Teste avec plusieurs personnes de différents âges

Exercice 10 – Login et exception personnalisée

Écris une fonction login(username: String, password: String) qui lance une exception InvalidCredentialsException si le mot de passe est incorrect.

Teste que la fonction fonctionne avec les bons identifiants

Teste qu’elle lance l’exception avec des identifiants incorrects