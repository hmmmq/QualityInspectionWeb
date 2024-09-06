<template>
    <div class="container-div-style">
      <a href="javascript:void(0);"
         class="btn btn-d btn-lg btn-上一页-style"
         @click="goToPreviousPage"
         :disabled="currentPage === 1">
        上一页
      </a>
      <label class="text-lg-center label-1-38-style">
        {{ currentPage }} / {{ totalPages }}
      </label>
      <a href="javascript:void(0);"
         class="btn btn-d btn-lg btn-下一页-style float-lg-right"
         @click="goToNextPage"
         :disabled="currentPage === totalPages">
        下一页
      </a>
    </div>
  </template>
  
  <script>
  export default {
    props: {
      currentPage: {
        type: Number,
        required: true
      },
      totalPages: {
        type: Number,
        required: true
      }
    },
    methods: {
      goToPreviousPage() {
        if (this.currentPage > 1) {
          this.$emit('update:currentPage', this.currentPage - 1);
        }
      },
      goToNextPage() {
        if (this.currentPage < this.totalPages) {
          this.$emit('update:currentPage', this.currentPage + 1);
        }
      }
    }
  };
  </script>
  
  <style scoped>
  /* 引入的样式文件 */
  @import "@/assets/css/bootstrap.min.css";
  @import "@/assets/css/style.css";
  </style>
  