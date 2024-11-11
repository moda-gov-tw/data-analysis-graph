<template>
  <div>
    <div class="cy" ref="cyRef" v-show="isGraphVisible"></div>
  </div>
</template>

<script>
  import cytoscape from "cytoscape";
  import { ref, onMounted, toRefs, defineComponent } from "vue";

  export default defineComponent({
    name: "SocialCircles",

    props: {
      apiEndpoint: {
        type: String,
        required: true,
      },
      layoutName: {
        type: String,
        required: true,
      },
    },
    
    setup(props) {
      const { apiEndpoint, layoutName } = toRefs(props);
      const cyRef = ref(null);
      const isGraphVisible = ref(false);
      let cy = null;

      async function fetchGraphData() {
        try {
          const response = await fetch(`http://localhost:8080/api/${apiEndpoint.value}`);
          const graphData = await response.json();
          isGraphVisible.value = true;
          initCytoscape(graphData);

        } catch (error) {
          console.error("Error fetching social circles data:", error);
        }
      }

      function initCytoscape(data) {
        if (cy) {
          cy.destroy();
        }
        
        cy = cytoscape({
          container: cyRef.value,
          elements: data.elements,
          style: [
            {
              selector: "node",
              style: {
                "background-color": "#4CAF50",
                label: "data(id)",
                "text-valign": "center",
                "text-halign": "center",
                color: "#ffffff",
                "font-size": "12px",
                "border-width": 2,
                "border-color": "#2c3e50",
                "width": "60px",
                "height": "60px",
                "shadow-color": "#000000",
                "shadow-blur": 10,
                "shadow-offset-x": 2,
                "shadow-offset-y": 2,
              },
            },
            {
              selector: "edge",
              style: {
                "width": 4,
                "line-color": "#3498db",
                "target-arrow-color": "#3498db",
                "target-arrow-shape": "triangle",
                "opacity": 0.7,
                "curve-style": "bezier",
                "arrow-scale": 1.5,
              },
            },
            {
              selector: "node:selected",
              style: {
                "background-color": "#e74c3c",
                "border-color": "#c0392b",
              },
            },
            {
              selector: "edge:selected",
              style: {
                "line-color": "#e74c3c",
                "target-arrow-color": "#e74c3c",
              },
            },
          ],

          layout: {
            name: layoutName.value,
            padding: 30,
          },
        });

        cy.fit();
      }

      onMounted(() => {
        fetchGraphData();
      });

      return {
        fetchGraphData,
        cyRef,
        isGraphVisible,
      };
    },
  });
</script>

<style>
  .cy {
    width: 100%;
    height: 600px;
    margin: auto;
  }
</style>
