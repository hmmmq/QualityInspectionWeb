<template>
     <div class="form-group">
            <label class="label-style">上传证明文件</label>
            <button @click="uploadFile" class="btn btn-d btn-lg btn-上传-style">上传</button>
        </div>
</template>
<script>
export default ({
    setup() {
        const uploadFile = () => {
            // 上传文件逻辑
            console.log('Upload file');
        }

        return {
            uploadFile
        }
    },
})
</script>
<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>