<template>
  <div class="row">
        <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
            <br>
            <h1>报送项目年度培训计划</h1>
            <button @click="addProcess" class="btn btn-d btn-lg btn-button-style btn-rd">+</button>
        </div>
    </div>
    <PGC6 :formArray="formArray1" :url="url" :head="'项目名称'" :isShowButton="false"/>   
    <div v-for="(process, index) in processes" :key="index">
        <PGC6 :formArray="formArray2" :url="url" :head="head" />    
    </div>
    </template>
    <script>
    import PGC6 from '@/components/ProjectGroup/PGC6.vue';
    export default {
      components: {
        PGC6
      },
      data() {
        return {
          url:"#",
          head: "培训计划",
          formArray1: [
            { label: "项目名称", value: "", type: "text" },
          ],
          formArray2: [
            { label: "序号", value: "", type: "text" },
            { label: "培训计划名称", value: "", type: "text" },
            { label: "授课人", value: "", type: "text" },
            { label: "计划日期", value: "", type: "date" },
            { label: "备注", value: "", type: "textarea" },
          ],
          processes: []
        };
      },
      methods:{
        addProcess() {
            // 添加新工序逻辑
            this.processes.push({});
            console.log('Add process');
        }
      }
    };
    </script>
    <style scoped>
    /* 引入的样式文件 */
    @import '@/assets/css/bootstrap.min.css';
    @import '@/assets/css/style.css';
    </style>
    