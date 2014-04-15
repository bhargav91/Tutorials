class FindLargest
	def find_largest(a, *nums) #*nums is variable argument
		largest = a			   #assume the first nuumber is the largest
		nums.each do |num|     #for each num in nums
			if(num > largest)  #if current number is larger than largest
				largest = num; #assign num to largest
			end
		end
		return largest;
	end
end
obj = FindLargest.new
print "The largest number is: ", obj.find_largest(2,3,4,1,5,10,7)