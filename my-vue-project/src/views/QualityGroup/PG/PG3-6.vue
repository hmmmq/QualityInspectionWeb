<template>
  <PGC6 :formArray="formArray" :url="url" :head="head" :isShowButton="false" />
</template>

<script>
import PGC6 from '@/components/ProjectGroup/PGC6.vue';
export default {
  components: {
    PGC6
  },
  data() {
    return {
      head: "查看更新工程质量责任追溯档案",
      url: "#",
      formArray: [
        { label: "建档时间", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "责任人姓名", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "职务", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "专业", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "联系方式", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "身份证号码", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "责任时间-上岗时间", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "责任时间-离岗时间", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "主要负责内容", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "任职期间工作评价", value: "rgegaerg", type: "text", isReadOnly: true },
        { label: "第几年", value: "1", type: "number", isReadOnly: true },
      ]
    };
  }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>