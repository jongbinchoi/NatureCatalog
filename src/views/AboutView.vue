<template>
  <div class = "head">NatureCatalog</div>
  <section class="contain">
    <MemberCard :profile="profileImage1" :name="items[0].name" :job="items[0].job" :about="items[0].about" ></MemberCard>
    <MemberCard :profile="profileImage2" :name="items[1].name" :job="items[1].job" :about="items[1].about" ></MemberCard>
    <MemberCard :profile="profileImage3" :name="items[2].name" :job="items[2].job" :about="items[2].about" ></MemberCard>
    <MemberCard :profile="profileImage4" :name="items[3].name" :job="items[3].job" :about="items[3].about" ></MemberCard>
    <MemberCard :profile="profileImage5" :name="items[4].name" :job="items[4].job" :about="items[4].about" ></MemberCard>

  </section>
</template>

<script>
import MemberCard from '@/components/MemberCard.vue'

export default {
  components: {
    MemberCard
  },
  data () {
    return {
      profileImage1: require('@/assets/gang.jpg'), // 이미지는 assets 폴더에 넣어두고 가져온다.//
      profileImage2: require('@/assets/jong.png'),
      profileImage3: require('@/assets/kim.jpg'),
      profileImage4: require('@/assets/na.jpg'),
      profileImage5: require('@/assets/lee.png'),
      items: [
        { name: '강연준', job: 'Back-End', about: 'Spring Boot 와 백엔드 개발을 처음 접해서 어려운 부분이 많지만 동료들의 도움으로 잘 해쳐나갔습니다..' },
        { name: '최종빈', job: 'Back-End', about: 'Spring Boot를 처음 공부해보면서 전체적인 구조를 알 수 었던 의미있는 시간이였습니다..' },
        { name: '김재호', job: 'Front-End', about: 'Html을 처음 사용해봐서 어려운 부분이 있었지만 웹페이지를 점차 만들어 가면서 새로운 것들을 배울수 있어서 좋았습니다..' },
        { name: '나우진', job: 'Front-End', about: 'vue를 처음 다루어보아서 어려움이 있었지만 하나하나 해결해나가며 많이 배울 수 있었습니다..' },
        { name: '이도현', job: 'Front-End', about: '다같이 해보는 협업으로 많은 경험을 얻었습니다. 이번기회로 저에게 부족한 기술과 경험을 무엇인지 알 수 있게되었습니다.' }
      ]
    }
  }
}
</script>

<style scoped>
.contain {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: center;
  align-items: center;
  margin-top: 50px;
  margin-bottom: 50px;
}
</style>
