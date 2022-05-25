num_attempts = 0
number = rand(1..10)

found = false
until found
  print "Adivina el número de 1 a 10 que estoy pensando: "
  guess = gets.chomp.to_i

  if guess == number
    puts "Muy bien! Lo lograste en #{num_attemps} intentos!"
    found = true
  else
    puts "Lo siento! No es el número, intenta nuevamente."
    num_attempts += 1
  end
end