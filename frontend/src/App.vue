<template>
<div id="app">
  <header id="header">
    <small class="schedule">ただいまプリント版をご利用いただくと<b>2018/7/30(月)</b>に発送</small>
    <nav id="gnav">
      <ul>
        <li class="logo"><router-link to="/"><img alt="yosetarou" src="./assets/logo.png"/></router-link></li>
        <li><router-link to="create-board">新しく寄せ書きを作る</router-link></li>
        <li><router-link to="guide">ご利用ガイド</router-link></li>
        <li><router-link to="faq">よくある質問</router-link></li>
        <li><router-link to="signin">ログイン・新規登録</router-link></li>
      </ul>
    </nav>
  </header>
  <nav id="designs">
    <ul>
      <li><router-link to="design/all">すべてのデザイン</router-link></li>
      <li><router-link to="design/farewell">送別・卒業・引退</router-link></li>
      <li><router-link to="design/marrige">ご結婚祝い</router-link></li>
      <li><router-link to="design/birthday">お誕生日祝い</router-link></li>
      <li><router-link to="design/thanks">おめでとう・ありがとう</router-link></li>
      <li><router-link to="design/baby">出産お祝い</router-link></li>
    </ul>
  </nav>
  <div id="content">
    <router-view/>
  </div>
  <div class="payment">
    <ul class="payment-items">
      <li>
        <h3>お支払について</h3>
        <p>A erat nam at lectus? Quis auctor elit sed vulputate mi sit amet mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin libero nunc, consequat!
          Scelerisque fermentum dui faucibus in ornare quam viverra orci sagittis eu volutpat odio facilisis mauris sit amet massa vitae tortor condimentum lacinia quis vel. Amet commodo nulla facilisi nullam vehicula.
          Morbi quis commodo odio aenean sed adipiscing diam donec adipiscing tristique risus nec feugiat in. Donec et odio pellentesque diam volutpat commodo sed egestas egestas fringilla phasellus faucibus scelerisque eleifend.
          Mi ipsum, faucibus vitae aliquet nec, ullamcorper sit amet risus nullam eget felis eget nunc lobortis mattis aliquam faucibus purus! Duis at consectetur lorem donec massa sapien, faucibus et molestie.
          Leo a diam sollicitudin tempor id eu nisl nunc mi ipsum, faucibus vitae aliquet nec, ullamcorper sit amet risus nullam eget felis eget nunc. Hendrerit lectus a molestie lorem ipsum.</p>
      </li>
      <li>
        <h3>お届けについて</h3>
        <p>Accumsan sit amet nulla facilisi morbi tempus iaculis urna, id volutpat lacus laoreet non curabitur gravida arcu ac. Massa sapien, faucibus et molestie ac, feugiat sed lectus vestibulum mattis ullamcorper.
        Ullamcorper morbi tincidunt ornare massa, eget egestas purus viverra accumsan in nisl nisi, scelerisque eu ultrices vitae, auctor. Egestas integer eget aliquet nibh praesent tristique magna sit amet purus gravida.
        Tincidunt ornare massa, eget egestas purus! Nisl pretium fusce id velit ut tortor pretium viverra suspendisse potenti nullam ac tortor vitae purus faucibus ornare suspendisse sed nisi lacus, sed viverra.</p>
      </li>
    </ul>
  </div>
  <footer id="footer">
    <ul class="footer-menu">
      <li><router-link to="/">menu</router-link></li>
      <li><router-link to="/">menumeny</router-link></li>
      <li><router-link to="/">menuニュー</router-link></li>
      <li><router-link to="/">menu</router-link></li>
      <li><router-link to="/">menumeny</router-link></li>
      <li><router-link to="/">menuメニュー</router-link></li>
    </ul>
    <small class="copy">&copy; 2018 オンライン寄せ書き yosetarou</small>
  </footer>
</div>
</template>

<style lang="scss">
@import url(https://fonts.googleapis.com/css?family=Lato:400,700);
@import url(http://fonts.googleapis.com/earlyaccess/notosansjp.css);
#app {
  font-family: Lato, "Noto Sans JP", "游ゴシック Medium", "游ゴシック体", "Yu Gothic Medium", YuGothic, "ヒラギノ角ゴ ProN", "Hiragino Kaku Gothic ProN", "メイリオ", Meiryo, "ＭＳ Ｐゴシック", "MS PGothic", sans-serif;
  background: url('./assets/bg.png') left top repeat;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
  margin-top: 0;
  font-size: 14px;
  line-height: 1.8;
  padding-top: 80px;
}
#header {
  background: #fff;
  position: fixed;
  top: 0;
  left: 0;
  height: 80px;
  width: 100%;

  .schedule {
    display: block;
    padding: 2px 0;
    text-align: center;
    color: #fff;
    background-color: #333;

    b {
      margin: 0 3px;
      font-size: 120%;
    }
  }
}

ul, li {
  margin: 0;
  padding: 0;
}

body a {
  color: #444;
}

#gnav, #designs {
  border-bottom: 1px #ddd solid;
  background: #fff;
  text-align: center;

  ul {
    display: table;
    width: 890px;
    margin: 0 auto;
  }

  li {
    display: table-cell;
    font-weight: bold;

    &.logo {
      width: 60px;
      img {
        height: 40px;
        vertical-align: middle;
      }
    }

    a {
      display: inline-block;
      height: 50px;
      line-height: 50px;
      vertical-align: middle;
    }
  }
}

.container {
  display: block;
  width: 980px;
  margin: 0 auto;
}

.payment {
  padding: 40px 0;
  background: #fff;

  ul {
    @extend .container;
    display: table;
  }

  li {
    display: table-cell;
    width: 50%;
    padding: 0 20px;
  }
}

#footer {
  background: #fff;
  text-align: center;

  .footer-menu {
    li {
      display: inline-block;
      margin: 0 10px;
    }
  }

  .copy {
    margin-top: 40px;
    display: block;
  }
}
</style>
