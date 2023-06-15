// 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

string usuario, senha;

do
{
    Console.Write("Nome de usuário: ");
    usuario = Console.ReadLine();

    Console.Write("Senha: ");
    senha = Console.ReadLine();

    if (senha == usuario)
    {
        Console.WriteLine("A senha não pode ser igual ao nome do usuário");
    }
}
while (senha == usuario);