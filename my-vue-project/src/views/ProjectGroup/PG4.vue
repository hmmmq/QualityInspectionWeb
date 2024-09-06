<template>
    <PGC7 :itemList1="itemList1" :head="head" />
    </template>
    <script>
    import PGC7 from '@/components/ProjectGroup/PGC7.vue';
    export default {
      components: {
        PGC7
      },
      data() {
        return {
          head:'计划报送',
          itemList1: [
            { title: "报送项目年度培训计划", href: "/PG4_1" },
            { title: "报送项目年度质量小组活动计划", href: "/PG4_2" }
          ]
        };
      },
    };
    </script>
      
    <style scoped>
    /* 引入的样式文件 */
    @import "@/assets/css/bootstrap.min.css";
    @import "@/assets/css/style.css";
    </style>
    