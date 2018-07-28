<template>
<div class="home">
  <div class="masthead">
    <h1 class="read">結婚祝い・お誕生日祝い・送別に。<br>yosetarouなら素敵な「寄せ書き」がすぐに簡単にプレゼントできます。</h1>

    <ul id="slider">
      <li><img alt="寄せ書き例" src="http://placekitten.com/g/200/200"/></li>
      <li><img alt="寄せ書き例" src="http://placekitten.com/g/200/200"/></li>
      <li><img alt="寄せ書き例" src="http://placekitten.com/g/200/200"/></li>
      <li><img alt="寄せ書き例" src="http://placekitten.com/g/200/200"/></li>
      <li><img alt="寄せ書き例" src="http://placekitten.com/g/200/200"/></li>
      <li><img alt="寄せ書き例" src="http://placekitten.com/g/200/200"/></li>
    </ul>
  </div>

  <div class="container">
    <ul class="menu">
      <li><router-link to="menu/print">プリントしてお届け</router-link></li>
      <li><router-link to="menu/pdf">PDFでダウンロード</router-link></li>
      <li><router-link to="menu/web">Webでお届け</router-link></li>
    </ul>
  </div>
</div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'home',
  components: {
    HelloWorld
  }
}
</script>

<style lang="scss">

  .container {
  width: 980px;
  margin: 0 auto;
  }
.masthead {
  padding: 60px 0;

  .read {
    font-weight: normal;
    font-size: 32px;
}

#slider {
margin-top: 60px;
li {
display: inline-block;
margin: 0 10px;
}
}
  }

  .menu {
  li {
  display: inline-block;

  a {
  padding: 20px;
  }
  }
  }
</style>
