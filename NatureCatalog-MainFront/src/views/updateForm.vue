<template>
    <form class="container" action="/articles/update" method="post"> <!--action : 어디로 보낼지 method: 어떻게보낼지  -->
    <input name="id" type="hidden" value="{{id}}"><!--id가 몇 번인 article을 수정하는지 알려 줘야함. 근데 화면에 표시할 필요없어 hidden-->
    <div class="mb-3">
        <lable class="form-label">제목</lable>
        <input type="text" class="form-control" name="title" value="{{title}}"><!--name 이라는 dto와 동일한 필드명넣어줘야함, 그래야지 값이 들어옴-->
    </div>
    <div class="mb-3">
        <lable class="form-label">내용</lable>
        <textarea   class="form-control" rows="3" name="content"> </textarea>
    </div>
    <button type="submit" class="btn btn-primary">submit</button>
    <a href="/articles/{{id}}">Back</a>
</form>
</template>