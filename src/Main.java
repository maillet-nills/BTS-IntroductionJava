//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Exercice 1
    char letter = 'a';
    int number = 0;
    long long_number = 1111111111;
    float float_number = 0.5F;
    double double_number = 1111111111.1111111111;
    boolean bool_variable = true;
    String str = "hello, world";

    System.out.println(letter);
    System.out.println(number);
    System.out.println(long_number);
    System.out.println(float_number);
    System.out.println(double_number);
    System.out.println(bool_variable);
    System.out.println(str);

    // Exercice 2
    String nom = "Dupont";
    String prenom = "Pierre";
    int anneeDeNaissance = 2002;
    String nomComplet = prenom + " " + nom;
    System.out.println(nomComplet + " est né en " + anneeDeNaissance + " il a donc 24 ans.");

    // Exerccice 3
    int a = 2;
    int b = 2;

    if (a == b){
        System.out.println(a + " = " + b);
    }else {
        System.out.println("a et b sont différents");
    }

    // Exercice 4
    /* 1) false
    *  2) true
    *  3) false
    *  4) true
    *  5) false
    *  6) true */

    // Exercice 5
    a = 3;
    b = 11;
    int c = 5;

    if (a == b && b == c){
        System.out.println("Les trois variables sont égales");
    }else {
        System.out.println("Les trois variables ne sont pas identiques");
    }

    // Exercice 6
    for (int i = 0; i < 11; i++){
        System.out.println(i);
    }

    // Exercice 7
    int i = 0;
    while (i < 11){
        System.out.println(i);
        i++;
    }
}
