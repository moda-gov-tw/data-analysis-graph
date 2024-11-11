<template>
  <div id="app">
    <button @click="setGraphConfig('companydata', 'concentric')">公司進出口資料圖1</button>
    <button @click="setGraphConfig('getdata', 'preset')">公司進出口資料圖2</button>
    <button @click="setGraphConfig('getdata', 'circle')">公司進出口資料圖3</button>
    <button @click="setGraphConfig('socialdata', 'cose')">社交圈資料圖</button>
    <company-in-out
      ref="companyInOut"
      :apiEndpoint="apiEndpoint"
      :layoutName="layoutName"
      v-if="showGraph"
    />
    <social-circles
      ref="socialCircles"
      v-if="showSocialGraph"
      :apiEndpoint="apiEndpoint"
      :layoutName="layoutName"
    />
  </div>
</template>

<script>
  import CompanyInOut from './components/CompanyInOut.vue';
  import SocialCircles from './components/SocialCircles.vue';

  export default {
    components: {
      CompanyInOut,
      SocialCircles,
    },
    
    data() {
      return {
        apiEndpoint: 'companydata',
        layoutName: 'concentric',
        showGraph: true,
        showSocialGraph: false,
      };
    },

    methods: {
      setGraphConfig(api, layout) {
        this.apiEndpoint = api;
        this.layoutName = layout;

        if (api === 'socialdata') {
          this.showGraph = false; // 隱藏 CompanyInOut
          this.showSocialGraph = true; // 顯示 SocialCircles
        } else {
          this.showGraph = true; // 顯示 CompanyInOut
          this.showSocialGraph = false; // 隱藏 SocialCircles
        }

        this.$nextTick(() => {
          if (this.showGraph) {
            this.$refs.companyInOut.fetchGraphData(); // 刷新 CompanyInOut
          }
          if (this.showSocialGraph) {
            this.$refs.socialCircles.fetchGraphData(); // 刷新 SocialCircles
          }
        });
      },
    },
  };
</script>

<style>
  button {
    padding: 10px 20px;
    margin: 5px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }

  button:hover {
    background-color: #45a049;
  }

  button:active {
    background-color: #3e8e41;
  }
</style>
