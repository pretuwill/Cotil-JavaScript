<?php function strReverse($str)
{
    $reversed = '';
    $length = strlen($str);
    for ($i = $length - 1; $i >= 0; $i--) {
        $reversed .= $str[$i];
    }
    return $reversed;
} // Teste da função 
$string = "Melhor turma do COTIL";
echo strReverse($string);  
?>