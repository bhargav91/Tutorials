class UniqueChecker2
	def check_unique(str)
		boolean_array = Array.new(256) #boolean array representing all ASCII characters
		for i in 0..255
			boolean_array << false #initialize array with all boolean values
		end		
		for i in 0..str.length-1 
			val= str[i].ord			#str[i].ord returns ASCII value of that character
			if(boolean_array[val])  #if its already true
				print "String does not have all unique characters!" #we have a duplicate character, return false
				return false      
			end
			boolean_array[val] = true	#et boolean value representing that character to be true	
		end
		return true # all characters in string was unique..!
	end
end
obj = UniqueChecker2.new
if(obj.check_unique("bhargav"))
	print "string has all unique characters!"
end
	