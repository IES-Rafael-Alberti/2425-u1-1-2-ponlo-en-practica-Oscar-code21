
int main()
{
    char nombre[20];

    printf( "Introduzca su nombre: " );
    scanf( "%s", nombre );
    printf( "Hola %s, Este programa esta hecho en C.", nombre, 161 );

    getch(); /* Pausa */

    return 0;
}