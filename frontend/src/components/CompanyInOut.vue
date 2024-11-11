<template>
  <div>
    <div class="cy" ref="cyRef"></div>
  </div>
</template>

<script>
  import cytoscape from 'cytoscape';

  export default {
    name: 'CompanyInOut',

    props: {
      apiEndpoint: String,
      layoutName: String,
    },

    data() {
      return {
        cy: null,
      };
    },

    mounted() {
      this.fetchGraphData();
    },

    methods: {
      async fetchGraphData() {
        try {
          const response = await fetch(`http://localhost:8080/api/${this.apiEndpoint}`);
          const graphData = await response.json();
          this.initCytoscape(graphData);
        } catch (error) {
          console.error('Error fetching graph data:', error);
        }
      },

      initCytoscape(data) {
        if (this.cy) this.cy.destroy();
        this.cy = cytoscape({
          container: this.$refs.cyRef,
          elements: data.elements,
          style: [
            {
              selector: 'node',
              style: {
                "background-color": ele => (ele.data("id") === "a1" ? "#fa39cd" : "yellow"),
                label: ele => (ele.data("banNm") ? ele.data("banNm") : ele.data("node")),
                "text-valign": "center",
                "text-wrap": "none",
                "text-max-width": 70,
                height: 60,
                width: 60,
                "font-size": 10,
              },
            },
            {
              selector: 'edge',
              style: {
                width: 1,
                "line-color": ele => (ele._private.data.edge_color === "pink" ? "#e344d8" : "blue"),
                "mid-target-arrow-color": ele => (ele._private.data.arrow === "buy" ? "orange" : "#31B404"),
                "mid-target-arrow-shape": "triangle",
                "curve-style": "bezier",
                "control-point-step-size": 15,
                "arrow-scale": 1.5,
              },
            },
            {
              selector: 'node:selected',
              style: {
                "background-color": "red",
                "border-color": "#22ee00",
              },
            },
            {
              selector: 'edge:selected',
              style: {
                "line-color": "red",
              },
            },
            {
              selector: '.multiline',
              style: {
                "text-wrap": "wrap",
                "text-max-width": "100",
              },
            },
            {
              selector: ':parent',
              style: {
                "text-valign": "top",
                "text-halign": "center",
                "background-color": "#ECF5FF",
                "font-size": 30,
              },
            },
          ],

          layout: {
            name: this.layoutName,
            rows: 1,
            padding: 10,
            minNodeSpacing: 40,
            spacingFactor: 0.7,
            directed: true,
          },

          wheelSensitivity: 0.1,
          minZoom: 0.3,
        });

        this.cy.fit();
      },
    },
    
    watch: {
      apiEndpoint: 'fetchGraphData',
      layoutName(newLayout) {
        if (this.cy) this.cy.layout({ name: newLayout }).run();
      },
    },
  };
</script>

<style>
  .cy {
    width: 80%;
    height: 100%;
    position: absolute;
    border: 1px solid #ddd;
  }
</style>
