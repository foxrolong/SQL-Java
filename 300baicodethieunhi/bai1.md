1. Tổng hai
Dễ
Chủ đề
biểu tượng khóa cao cấp
Các công ty
Gợi ý
Cho một mảng các số nguyên nums và một số nguyên target, hãy trả về chỉ số của hai số đó sao cho tổng của chúng bằng target .

Bạn có thể giả định rằng mỗi đầu vào sẽ có chính xác một giải pháp và bạn không được sử dụng cùng một phần tử hai lần.

Bạn có thể trả lời theo bất kỳ thứ tự nào.

 

Ví dụ 1:

Đầu vào: nums = [2,7,11,15], target = 9
 Đầu ra: [0,1]
 Giải thích: Vì nums[0] + nums[1] == 9, nên ta trả về [0, 1].
Ví dụ 2:

Đầu vào: nums = [3,2,4], target = 6
 Đầu ra: [1,2]
Ví dụ 3:

Đầu vào: nums = [3,3], target = 6
 Đầu ra: [0,1]
 

Hạn chế:

2 
<= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Chỉ có một đáp án đúng duy nhất.
 

Câu hỏi tiếp theo:  Bạn có thể nghĩ ra thuật toán nào có độ phức tạp thời gian nhỏ hơn không?O(n2)