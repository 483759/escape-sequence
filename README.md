# escape-sequence

기존 유일한 방탈출 관련 어플 [전x방x출]은 너무 느리다. 그리고 UI 로딩 시 테스트 값이 그대로 노출되는 문제가 있다.
예약 관련도 어플에서 바로 할 순 없을까?

<br>

## 기능적 요구사항

- 내가 설정한 지역의 방탈출 카페를 한 눈에 확인할 수 있다.
- 전국의 방탈출 카페를 검색할 수 있다.
  - 이름, 별점, 지역 등의 조건으로 검색할 수 있어야 한다.
- 방탈출 테마 이름으로 검색할 수 있다.
  - 이름, 분류, 난이도, 지역, 별점 등의 조건으로 검색할 수 있어야 한다.
- 내가 방문한 테마와 카페에 후기/별점을 등록할 수 있다.
  - 지도와 같은 UI로 현황을 한눈에 보여줄 수 있으면 좋겠다.
  - 내가 작성한 후기를 한번에 확인할 수 있어야 한다.
- 달성한 방 개수에 따라 등급을 차등화한다.

<br>

## 비기능적 요구사항

- 기본 화면에서 이동 시 체감 로딩 시간이 길지 않아야 한다.
- 테스트 값이 유저에게 노출되면 안 된다.
- 검색으로 인한 로딩 시간이 소요될 경우 로딩과 관련된 문구/아이콘을 표시해야 한다.
