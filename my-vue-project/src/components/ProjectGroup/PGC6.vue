<template>
    <!-- Main container -->
    <div class="page-container">
        <!-- bloc-3 -->
        <div class="bloc l-bloc" id="bloc-3">
            <div class="container bloc-lg">
                <div class="row">
                    <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
                        <h1 class="mg-md">{{ head }}</h1>
                        <form @submit.prevent="handleSubmit" novalidate>
                            <div v-for="(formItem, index) in formArray" :key="index" class="form-group">
                                <label>{{ formItem.label }}</label>
                                <input v-model="formItem.value" class="form-control" :type="formItem.type"
                                    :readonly="formItem.isReadOnly" required />
                            </div>
                            <div v-show="isShowButton" class="text-center">
                                <button class="bloc-button btn btn-d btn-lg btn-block btn-clean" type="submit">
                                    {{ buttonAction }}<span class="special-tag-for-editing-text-with-html"></span>
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- bloc-3 END -->

        <!-- ScrollToTop Button -->
        <a class="bloc-button btn btn-d scrollToTop" @click="scrollToTop">
            <svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" viewBox="0 0 32 32">
                <path class="scroll-to-top-btn-icon" d="M30,22.656l-14-13-14,13" />
            </svg>
        </a>
        <!-- ScrollToTop Button END-->
    </div>
    <!-- Main container END -->
</template>

<script>
export default {

    props: {
        url: String,
        formArray: Array,
        head: String,
        buttonAction: {
            type: String,
            default: '保存' // 默认值为 '保存'
        },
        isShowButton: {
            type: Boolean,
            default: true // 默认值为 true
        }
    },
    mounted() {
    this.formArray.forEach(formItem => {
      if (formItem.isReadOnly === undefined) {
        formItem.isReadOnly = false;
      }
    });
  },
    data() {
        return {
            internalButtonAction: this.buttonAction
        };
    },
    methods: {
        handleSubmit() {
             
        },
        scrollToTop() {
            window.scrollTo({ top: 0, behavior: 'smooth' });
        }
    },

};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>
