<template>
<div class="home">
  <div class="masthead">
  <h1 class="read">結婚祝い・お誕生日祝い・送別に。<br>yosetarouなら <b>素敵な「寄せ書き」</b>が<b>すぐ</b>に<b>簡単</b>にプレゼントできます。</h1>

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

.masthead {
  padding: 60px 0;
  text-align: center;

  .read {
    font-weight: normal;
    font-size: 32px;
    line-height: 1.6;

    b {
      font-size: 120%;
    }
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
  display: table;
  table-layout: fixed;
  width: 100%;

  li {
    display: table-cell;

    & + li {
      padding-left: 40px;
    }

    a {
      color: #000;
      font-size: 18px;
      display: block;
      background: #fda;
      text-align: center;
      padding: 20px;
      border-radius: 4px;
      transition-duration: 0.4s;

      &:hover {
        background: darken(#fda, 10%)
      }
    }
  }
}

</style>
