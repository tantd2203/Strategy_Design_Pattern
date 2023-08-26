# Strategy_Design_Pattern
<h3> 1.Strategy Pattern là gì? </h3>
<blockquote>Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.</blockquote>
<div > Strategy Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern). Nó cho phép định nghĩa tập hợp các thuật toán, đóng gói từng thuật toán lại, và dễ dàng thay đổi linh hoạt các thuật toán bên trong object. Strategy cho phép thuật toán biến đổi độc lập khi người dùng sử dụng chúng.</div>
<div>Ý nghĩa thực sự của Strategy Pattern là giúp tách rời phần xử lý một chức năng cụ thể ra khỏi đối tượng. Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và lựa chọn thuật toán nào mà chúng ta thấy đúng đắn nhất khi thực thi chương trình</div>
<h3> 2.Demo cấu trúc Strategy Pattern </h3>
<img src="https://github.com/tantd2203/Strategy_Design_Pattern/blob/main/2.png" >
<h3>3.Lợi ích của Strategy Pattern là gì?</h3>
<ul>
  <li>Đảm bảo nguyên tắc Single responsibility principle (SRP) : một lớp định nghĩa nhiều hành vi và chúng xuất hiện dưới dạng với nhiều câu lệnh có điều kiện. Thay vì nhiều điều kiện, chúng ta sẽ chuyển các nhánh có điều kiện liên quan vào lớp Strategy riêng lẻ của nó.</li>
  <li>Đảm bảo nguyên tắc Open/Closed Principle (OCP) : chúng ta dễ dàng mở rộng và kết hợp hành vi mới mà không thay đổi ứng dụng.</li>
  <li>Cung cấp một sự thay thế cho kế thừa.</li>
</ul>
<h3>4. Sử dụng Strategy Pattern khi nào?</h3>
<ul>
  <li>Khi muốn có thể thay đổi các thuật toán được sử dụng bên trong một đối tượng tại thời điểm run-time.
</li>
    <li>Khi có một đoạn mã dễ thay đổi, và muốn tách chúng ra khỏi chương trình chính để dễ dàng bảo trì.
</li>
    <li>Tránh sự rắc rối, khi phải hiện thực một chức năng nào đó qua quá nhiều lớp con.
</li>
    <li>Cần che dấu sự phức tạp, cấu trúc bên trong của thuật toán.</li>
</ul>
