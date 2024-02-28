// Array para converter o índice do dia numérico para a string correspondente 
const diasDaSemana = ["Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"];

// Função para obter o dia atual no formato "Hoje é: DiaDaSemana" 
function obterDiaAtual() 
{
    let hoje = new Date();
    let diaDaSemana = diasDaSemana[hoje.getDay()]; return "Hoje é: " + diaDaSemana + ".";
}
// Função para obter a hora atual no formato "Hora atual é: Hora AM/PM; Minuto; Segundo" 
function obterHoraAtual() 
{
    let hoje = new Date();
    let hora = hoje.getHours();
    let minuto = hoje.getMinutes();
    let segundo = hoje.getSeconds();
    let periodo = hora >= 12 ? 'PM' : 'AM'; hora = hora % 12; hora = hora ? hora : 12;

    // Trata meia-noite (0 horas) 
    minuto = minuto < 10 ? '0' + minuto : minuto; segundo = segundo < 10 ? '0' + segundo : segundo;
    return "Hora atual é: " + hora + " " + periodo + ": " + minuto + ": " + segundo;
}

// Exibir dia e hora atual 
console.log(obterDiaAtual()); console.log(obterHoraAtual());
