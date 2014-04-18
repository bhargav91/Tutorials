class HashImpl
	def unique
		primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]	 
		starting_byte = ?a.ord
		primes_product = 1
		str = "abcdefghijklmnopqrstuvwxyz".downcase
		str.each_byte do |byte|	
			current_prime = primes[byte - starting_byte]			
			if primes_product % current_prime == 0	
				puts "Not unique"
				exit 
			else
				primes_product = primes_product * current_prime	
			end
		end	 
		puts "Unique"
	end
end

obj = HashImpl.new
obj.unique