<template>
    <PGC9 :head="head" :buttonAction="'提交项目申请'" :isShowButton="true" :requestUrl="url" :requestType="'post'"
        :formArray="formArray" />

    <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
        <div class="form-group">
            <label class="mg-md h3-style">工序</label>
            <button @click="addProcess" class="btn btn-d btn-lg btn-button-style btn-rd">+</button>
            <div class="form-group">
                <label>申请条件</label>
                <p>一：施工合同已签订、开工报告已办理</p>
                <p>二：设计文件、施工图纸能满足开工需要</p>
                <p>三：施工调查及复测工作已完成</p>
                <p>四：图纸会审、技术交底工作按规定进行，特殊作业、关键工序要有作业指导书</p>
                <p>五：实施性施工组织设计已编制、审批</p>
                <p>六：采用的新技术、机具设备、原材料符合要求，并能满足施工需要</p>
                <p>七：施工人员、质量管理人员、机具设备、原材料能满足工程质量要求</p>
                <p>八：已建立有效的项目质量管理保证体系</p>
                <p>九：工地试验室满足工程需要，符合建筑工企业试验室管理的有关规定及相关行业要求，并取得相应资质等级</p>
            </div>
        </div>
    </div>

    <div v-for="(process, index) in processes" :key="index">
        <PGC9 :head="head2" :buttonAction="'提交工序'" :isShowButton="true" :requestUrl="url2" :requestType="'post'"
            :formArray="formArray2" />
    </div>
</template>

<script>
import PGC9 from '@/components/ProjectGroup/PGC9.vue';
// import PGC6 from '@/components/ProjectGroup/PGC6.vue';
export default {
    components: {
        PGC9
    },
    data() {
        return {
            head: "新增项目",
            head2: "新增工序",
            url: "/project",
            url2: "/process",
            formArray: [
                { label: "项目编号", name: "projectId", value: "", type: "number" },
                { label: "项目名称", name: "projectName", value: "", type: "text" },
                { label: "项目概述", name: "projectDescription", value: "", type: "textarea" },
                { label: "开工时间", name: "startDate", value: "", type: "date" },
                { label: "预计完成时间", name: "estimatedCompletionDate", value: "", type: "date" },
                { label: "工程覆盖地区范围", name: "coverageArea", value: "", type: "textarea" }
            ],

            formArray2: [
                { label: "项目编号", name: "projectId", value: "", type: "number" },
                { label: "工序编号", name: "processId", value: "", type: "number" },
                { label: "工序名称", name: "processName", value: "", type: "text" },
                { label: "工序概述", name: "processDescription", value: "", type: "textarea" },
                { label: "上传证明文件", name: "documentPath", value: "", type: "file" },

            ],

            processes: [] // 存储每次添加的 PGC6 组件实例
        };
    },
    methods: {
        scrollToTop() {
            window.scrollTo({ top: 0, behavior: 'smooth' });
        },
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