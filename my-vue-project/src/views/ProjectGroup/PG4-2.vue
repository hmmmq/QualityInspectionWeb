<template>
    <div class="row">
          <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
              <br>
              <h1>报送项目年度质量小组活动计划</h1>
              <button @click="addProcess" class="btn btn-d btn-lg btn-button-style btn-rd">+活动计划</button>

          </div>
      </div>
      <PGC6 :formArray="formArray1" :url="url" :head="head1" :isShowButton="false"/>   
      <div v-for="(process, index) in processes" :key="index">
          <PGC6 :formArray="formArray2" :url="url" :head="head2" />    
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
            head1: "",
            head2: "活动计划",
            formArray1: [
              { label: "QC小组名称", value: "", type: "text" },
              { label: "注册号", value: "", type: "text" },
              { label: "组长姓名", value: "", type: "text" },
              { label: "小组人数", value: "", type: "text" },
              { label: "小组成员", value: "", type: "text" },
            ],
            formArray2: [
              { label: "课题名称", value: "", type: "text" },
              { label: "目标值", value: "", type: "text" },
              { label: "活动轮次", value: "", type: "text" },
              { label: "参加者", value: "", type: "date" },
              { label: "活动时间日期", value: "", type: "textarea" },
              { label: "活动安排", value: "", type: "textarea" },
              { label: "现状分析", value: "", type: "textarea" },
              { label: "可行性论证", value: "", type: "textarea" },
              { label: "经济技术效果", value: "", type: "textarea" },
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
      