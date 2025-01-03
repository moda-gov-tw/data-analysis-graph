import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueJsx from '@vitejs/plugin-vue-jsx';
import path from 'path';

export default defineConfig({
  resolve: {
    alias: {
      '@': path.resolve(__dirname, './src'), // 支持 @ 別名
      '@components': path.resolve(__dirname, './src/components'),
      '@assets': path.resolve(__dirname, './src/assets'),
    },
  },
  plugins: [vue(), vueJsx()],
  server: {
    port: 3000, // 開發伺服器埠號
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // 後端地址
        changeOrigin: true,
        secure: false, // 後端使用 HTTPS 時設為 true
        rewrite: (path) => path.replace(/^\/api/, ''), // 可選：去掉 /api 前綴
      },
    },
    cors: true, // 啟用跨域
  },
  build: {
    outDir: '../backend/src/main/resources/static', // 指定打包輸出目錄
    emptyOutDir: true, // 每次打包清空目錄
    terserOptions: {
      compress: {
        drop_console: true, // 移除 console.log
      },
    },
    rollupOptions: {
      output: {
        assetFileNames: 'assets/[name]-[hash].[ext]', // 靜態資源檔案名稱
        chunkFileNames: 'js/[name]-[hash].js', // JS Chunk 檔案名稱
        entryFileNames: 'js/[name]-[hash].js', // 入口檔案名稱
      },
    },
  },
});
