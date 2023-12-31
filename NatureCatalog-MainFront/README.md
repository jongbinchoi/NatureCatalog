
![header](https://capsule-render.vercel.app/api
  ?type=waving
  &color=auto&height=960
  &section=header
  &text=NatureCatalog!
  %20render
  &fontSize=90
  &animation=fadeIn
  &fontAlignY=38&desc=Decorate
  %20GitHub
  %20Profile
  %20or
  %20any
  %20Repo
  %20like
  %20me!
  &descAlignY=51
  &descAlign=62)



### 2semester_NatureCatalog
참조(https://codingmomong.tistory.com/621)


## npm vue-cli 설치
```
npm install -g @vue/cli
```


## npm vue-cli project 생성(단 대문자 사용 불가)
```
vue create naturecatalog
```
Manually select features 선택


## npm package 선택
```
Choose Vue version: Vue 버전을 선택 가능
Babel: es6이상, TypeScript로 개발 시 브라우저 버전에 상관없이 자동 전환해주는 기능
TypeScript: TypeScript 개발시 지원해주는 기능
Progressive Web App (PWA) Support: Web App 개발을 지원해주는 기능
Router: Vue Router를 위한 기능
Vuex: Vue에서 상태관리를 위한 기능
CSS Pre-processors: CSS 작성을 위한 CSS 전 처리 기능
Linter / Formatter: JavaScript codding Convention
Unit Testing: 단위 테스트
E2E Testing: end to end Testing, 통합 테스트
```
Babel, vuex, Router, Linter / Formatter <-선택


## vue 버전 선택
```
npm Vue 3.x <-선택
npm Vue 2.x
```


## history mode 설정
```
#Use history mode for router? \
#Requires proper server setup for index fallback in production <-선택
```


## ESLint 표준 가이드 설정
```
ESLint + Aribnb config: Aribnb 만든 표준 가이드, 많이 사용
ESLint + Standard config<-선택
ESLint + Prettier
```


## 코드 오류 체크 타이밍 설정
```
#Lint feature: 코딩 컨벤션이 잘 지켜졌는지 체크하는 시점
#lint on save: 저장할 때마다 체크 <-선택
#lint and fix on commit: commit 할 때마다 체크
```


## package 관리파일 설정
```
In dedicated config files: 별도의 파일로 관리
In dedicated config files
In package.json: package.json 파일에 관리 <-선택
```


## Trailing spaces not allowed 오류
```
VSCode에서 File > Preferences > Settings >  Trim Trailing Whitespace을 검색
체크하기
```