import javax.swing.JOptionPane;

public class SaudacaoJOptionPane {
    public static void main(String[] args) {
        // Caixa de diálogo de entrada para obter o nome do usuário
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?", "Digite seu nome", JOptionPane.QUESTION_MESSAGE);
        
        // Verifica se o usuário cancelou a entrada ou não digitou nada
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não inseriu um nome. Programa encerrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0); // Encerra o programa
        }
        
        // Constrói a mensagem de saudação
        String mensagem = "Olá, " + nome + "! Bom dia!";

        // Exibe uma caixa de diálogo de saída com a mensagem de saudação
        JOptionPane.showMessageDialog(null, mensagem, "Saudação", JOptionPane.INFORMATION_MESSAGE);
    }
}
