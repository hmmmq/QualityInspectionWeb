<template>
  <div class="page-container">
    <!-- bloc-0 -->
    <div class="bloc l-bloc" id="bloc-0">
      <div class="container bloc-lg">
        <div class="row row-style">
          <div class="col-md-6 col-lg-12">
            <form @submit.prevent="handleLogin" novalidate>
              <h1 class="mg-md">
                登录/注册
              </h1>
              <div class="form-group">
                <label>
                  用户名<br>
                </label>
                <input v-model="username" class="form-control" required />
              </div>
              <div class="form-group">
                <label>
                  密码<br>
                </label>
                <input v-model="password" class="form-control" type="password" required />
              </div>
              <div class="form-group">
                <label>
                  角色<br>
                </label>
                <select v-model="role" class="form-control" id="select_782">
                  <option v-for="(item, index) in roleList" :value="index" :key="index">
                    {{ item }}
                  </option>
                </select>
              </div>
              <div class="text-center">
                <button class="bloc-button btn btn-d btn-lg btn-rd btn-block btn-style" type="submit">
                  登录<br>
                </button>
                <br>
                <button class="bloc-button btn btn-d btn-lg btn-rd btn-block btn-style" type="button"
                  @click="handleRegister">
                  注册<br>
                </button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <!-- bloc-0 END -->

    <!-- ScrollToTop Button -->
    <a class="bloc-button btn btn-d scrollToTop" @click="scrollToTop">
      <svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" viewBox="0 0 32 32">
        <path class="scroll-to-top-btn-icon" d="M30,22.656l-14-13-14,13" />
      </svg>
    </a>
    <!-- ScrollToTop Button END-->
  </div>

</template>

<script>
import axios from 'axios';
export default {

  data() {
    return {
      username: '',
      password: '',
      role: -1,
      roleList: ['项目组', '专职质检员', '质量监督办公室']
    };
  },
  methods: {
    async handleLogin() {
      // 检查输入合法性
      if (!this.username || !this.password || this.role === -1) {
        alert('请填写所有字段并选择一个有效的角色');
        return;
      }
      // Handle form submission for login
      console.log('Login with:', this.username, this.password);

      try {
        const response = await axios.post('/user/login', {
          username: this.username,
          password: this.password,
        });

        if (response.data) {
          alert('登录成功');
          console.log('Login successful:', response.data);

          // 根据角色进行跳转
          const role = response.data.role;
          const router = this.$router;
          if (role === 0) {
            router.push('PG'); // 跳转到 /PG 路径
          } else if (role === 1) {
            router.push('IG'); // 跳转到 /IG 路径
          } else if (role === 2) {
            router.push('QG'); // 跳转到 /QG 路径
          }
        } else {
          alert('登录失败，用户名或密码错误');
        }
      } catch (error) {
        alert('登录请求失败，请稍后再试');
        console.error('Login failed:', error);
      }
    },
    handleSubmit() {
      // 获取 router 实例
      const router = this.$router; // 获取 router 实例

      // Handle form submission for login
      console.log('Login with:', this.username, this.password, this.role);

      // 根据角色进行跳转
      if (this.role == 0) { // 角色索引为 '0' 对应 '项目组'
        router.push('PG'); // 跳转到 /PG 路径

      } else if (this.role == 1) {
        router.push('IG'); // 跳转到 /IG 路径
      } else if (this.role == 2) {
        router.push('QG'); // 跳转到 /QG 路径
      }
    },
    async handleRegister() {
      // 检查输入合法性
      if (!this.username || !this.password || this.role === -1) {
        alert('请填写所有字段并选择一个有效的角色');
        return;
      }
      // Handle registration logic
      console.log('Register with:', this.username, this.password, this.role);

      try {
        const response = await axios.post('/user', {
          username: this.username,
          password: this.password,
          role: this.role
        });
        alert('注册成功');
        console.log('Registration successful:', response.data);
      } catch (error) {
        alert('注册失败,请检查字段是否正确/用户名重复更换用户名');
        console.error('Registration failed:', error);
      }
    },
    scrollToTop() {
      window.scrollTo({ top: 0, behavior: 'smooth' });
    },
  },
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>