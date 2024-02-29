// Função para obter a data atual no formato "mo-dd-yyyy, mm/dd/yyyy" 
function obterDataFormato1() 
{ 
    let hoje = new Date(); 
    let mes = hoje.toLocaleString('default', { month: 'short' }); 
    let dia = hoje.getDate(); 
    let ano = hoje.getFullYear(); return `${mes}-${dia}-${ano}, ${mes}/${dia}/${ano}`; 
} 

// Função para obter a data atual no formato "dd-mo-yyyy, dd/mm/yyyy" 
function obterDataFormato2() 
{ 
    let hoje = new Date(); 
    let mes = hoje.toLocaleString('default', { month: 'short' }); 
    let dia = hoje.getDate(); 
    let ano = hoje.getFullYear(); return `${dia}-${mes}-${ano}, ${dia}/${mes}/${ano}`; 
} 

// Exibir a data atual em ambos os formatos 

console.log(obterDataFormato1()); 
console.log(obterDataFormato2());
