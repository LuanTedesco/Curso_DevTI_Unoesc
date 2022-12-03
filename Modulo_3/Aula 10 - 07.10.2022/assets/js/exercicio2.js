let nota1, nota2, nota3, media

nota1 = 5
nota2 = 5
nota3 = 5

media = (nota1 + nota2 + nota3) / 3

if (media >= 7) {
  console.log(`Sua nota é ${media}, você está aprovado`)
} else if (media < 7 && media >= 4) {
  console.log(`Sua nota é ${media}, você está em recuperação`)
} else {
  console.log(`Sua nota é ${media}, você está reprovado`)
}
