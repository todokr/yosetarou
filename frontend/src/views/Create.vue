<template>
  <div class="create">
    <div class="container">
      <div class="step">
        <sui-step-group ordered>
          <sui-step active>
            <sui-step-content>
              <sui-step-title>デザインを選ぶ</sui-step-title>
            </sui-step-content>
          </sui-step>
          <sui-step>
            <sui-step-content>
              <sui-step-title>基本情報を入力する</sui-step-title>
            </sui-step-content>
          </sui-step>
          <sui-step>
            <sui-step-content>
              <sui-step-title>みんなでメッセージを書く</sui-step-title>
            </sui-step-content>
          </sui-step>
          <sui-step>
            <sui-step-content>
              <sui-step-title>寄せ書きを贈る</sui-step-title>
            </sui-step-content>
          </sui-step>
        </sui-step-group>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
  .create {
    margin-top: 40px;
  }
</style>
