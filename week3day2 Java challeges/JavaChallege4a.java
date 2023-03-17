package Week3day2;

public class JavaChallege4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		
		for(int i=0;i<nums.length;i++)
		{
			int count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
					count++;
			
					
			}
			if(count==1)
			{
				System.out.println(nums[i]);
			}
		}
		

	}

}
