<template>
    <br>
    <form @submit.prevent="handleProcessSubmit" novalidate>
        <div class="form-group">
            <label for="processName">工序名称</label>
            <input id="processName" v-model="processForm.name" class="form-control" required />
        </div>
        <div class="form-group">
            <label for="processSummary">工序概述</label>
            <textarea id="processSummary" v-model="processForm.summary" class="form-control" rows="4"
                required></textarea>
        </div>
        <div class="form-group">
            <label class="label-style">上传证明文件</label>
            <button @click="uploadFile" class="btn btn-d btn-lg btn-上传-style">上传</button>
        </div>
        <button class="bloc-button btn btn-d btn-lg btn-block btn-保存-style" type="submit">
            保存
        </button>
    </form>

</template>

<script>
export default {
    data() {
        return {
            processForm: {
                name: '',
                summary: ''
            }
        };
    },
    methods: {

        handleProcessSubmit() {
            // 处理工序表单提交
            console.log('Process Form:', this.processForm);
            // 清空表单
            this.processForm = {
                name: '',
                summary: ''
            };
        },
        uploadFile() {
            // 上传文件逻辑
            console.log('Upload file');
        }
    }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>