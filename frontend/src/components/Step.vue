<template>
  <div class="step">
    <sui-step-group :steps="steps" />
    <p>
      {{ active }}
    </p>
  </div>
</template>
<script>
export default {
  name: 'Step',
  props: ['active'],
  data() {
    return {
      steps: [
        {
          icon: 'truck',
          title: 'デザインを選ぶ',
          active: true
        },
        {
          icon: 'payment',
          title: '基本情報を入力する',
          description: 'Enter billing information',
        },
        {
          disabled: true,
          icon: 'info',
          title: 'メッセージを書く',
        },
        {
          disabled: true,
          icon: 'info',
          title: '支払い方法を選ぶ',
        },
        {
          disabled: true,
          icon: 'info',
          title: '寄せ書きを贈る',
        },
      ],
    };
  },
};
</script>
