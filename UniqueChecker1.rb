require 'set'

class UniqueChecker 
	def check_unique(str)
		char_array = str.split(//)	#convert string to character array	
		s1 = Set.new #get a new hash set
		char_array.each do |i| #for i in char_array
			if(s1.add?(i.downcase) == nil)	#see if we can add i to set			
				print i, " is repeated!"    #if we can't, print character which is repeated and return false
				return false
			end		
		end		
	end
end
obj = UniqueChecker.new
if(obj.check_unique("bhargav")) 
	print "string has all unique characters!"
end
