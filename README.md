# mvc0927
소스명 : lottoForm.html, TimeVO.java, LottoServlet1.java, LottoServlet2.java, success.jsp, fail.jsp, impossible.jsp
 
[ 1단계 ] 
 
- lottoForm.html : 숫자를 입력하고 클로버이미지 버튼을 클릭하면 core.LottoServlet1 을 요청한다. 
 
- model.domain.TimeVO.java 의 기능  private 타입 멤버변수 – hour, minute  생성자와 getter   - controller.LottoServlet1.java 의 기능 요청 방식 : GET 매핑명 : /lotto1 
 
(1) Query 문자열로 전달되는 로또 번호를 추출한다. (2) 1 부터 6사이의 랜덤값을 추출한다.  (3) 톰캣 콘솔창에 “전달된 값 : X, 추출된 값 : X”를 출력한다. (4) 현재 시간 정보로 TimeVO 객체를 생성하여 응답 용 JSP에게 전달하기 위해 저장한다.(어디에 저장할까요?) (5) 클라이언트에서 전달한 숫자와 동일하면 /jspexam/success.jsp 에 forward  하고  동일하지 않으면 /jspexam/fail.jsp 에 forward 한다. 
 
- 다음 결과가 출력되도록 success.jsp 를 생성한다. (CSS 를 이용하여 다양하게 효과를 준다) 
 
“xx시 xx분에 당첨!! 추카추카” 
 
축하이미지 출력 
 
 
로또 번호를 맞춰 보세요!!! 
 
1부터 6까지의 숫자를 입력 하세요 :  
<input type=”image” src=”…”> → submit 기능이 자동으로 부여됨 
- 다음 결과가 출력되도록 fail.jsp 를 생성한다.   (CSS 를 이용하여 다양하게 효과를 준다) “xx시 xx분에 당첨 실패!! 아쉽아쉽” 
 
위로하는 이미지 출력 
 
로또 응모 링크 
 
 
[ 2단계 ] 
 
- controller.LottoServlet2.java 의 기능 요청 방식 : GET 매핑명 : /lotto2  LottoServlet1.java 를 복사하여 LottoServlet2.java 를 생성한다.  3번까지만 응모 할 수 있게 변경한다. 4번째 응모이면 /jspexam/impossible.jsp 로 forward 한다.   또한 당첨이 되면 그 다음 응모부터는 더 이상 로또 응모를 할 수 없게 /jspexam/impossible.jsp로 forward 한다
