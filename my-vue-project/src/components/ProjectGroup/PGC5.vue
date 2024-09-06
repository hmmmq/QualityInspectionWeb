<!-- 导航页面组件,双列模式,子标题2个 -->
<template>
    <!-- bloc-1 -->
    <div class="page-container">
      <div class="bloc l-bloc" id="bloc-1">
        <div class="container bloc-lg">
          <div class="row">
            <div class="col">
              <h1 class="mg-md">{{ head }}</h1>
            </div>
          </div>
          <div class="row">
            <div class="col-md-6">
              <h3 class="mg-md">{{ subhead1 }}</h3>
              <template v-for="(item, index) in itemList1" :key="index">
                <nav class="navbar navbar-light row navbar-expand-md">
                  <router-link class="navbar-brand" :to="item.href">{{ item.title }}</router-link>
                  <button
                    id="nav-toggle"
                    type="button"
                    class="ui-navbar-toggler navbar-toggler border-0 p-0 mr-md-0 ml-auto"
                    data-toggle="collapse"
                    data-target=".navbar-24991"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
                  >
                    <span class="navbar-toggler-icon"></span>
                  </button>
                  <div class="collapse navbar-collapse navbar-24991">
                    <ul class="site-navigation nav navbar-nav ml-auto">
                      <li class="nav-item">
                        <router-link :to="item.href" class="nav-link">进入<br /></router-link>
                      </li>
                    </ul>
                  </div>
                </nav>
              </template>
            </div>
            <div class="col-md-6">
              <h3 class="mg-md">{{ subhead2 }}<br /></h3>
              <template v-for="(item, index) in itemList2" :key="index">
                <nav class="navbar navbar-light row navbar-expand-md">
                  <router-link class="navbar-brand" :to="item.href">{{ item.title }}</router-link>
                  <button
                    id="nav-toggle"
                    type="button"
                    class="ui-navbar-toggler navbar-toggler border-0 p-0 mr-md-0 ml-auto"
                    data-toggle="collapse"
                    data-target=".navbar-24991"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
                  >
                    <span class="navbar-toggler-icon"></span>
                  </button>
                  <div class="collapse navbar-collapse navbar-24991">
                    <ul class="site-navigation nav navbar-nav ml-auto">
                      <li class="nav-item">
                        <router-link :to="item.href" class="nav-link">进入<br /></router-link>
                      </li>
                    </ul>
                  </div>
                </nav>
              </template>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- bloc-1 END -->
  </template>
  
  <script>
  export default {
    name: "PGC5",
    props: {
      head: String,
      subhead1: String,
      subhead2: String,
      itemList1: Array,
      itemList2: Array
    }
  };
  </script>
  