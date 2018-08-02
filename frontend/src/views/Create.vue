<template>
<div class="create">
  <div class="container">
    <Step />
  </div>
  </div>
</template>

<script>
import Step from '@/components/Step.vue'

export default {
  name: 'Create',
  components: {
    Step
  },
}
</script>

<style lang="scss" scoped>
  .create {
    margin-top: 40px;
  }
</style>
