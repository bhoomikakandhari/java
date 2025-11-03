const ctx= document.getElementById("spending chart").getContext("2d");
const mychart= new Chart(ctx,{
    type: "line",
    data: {
        labels :["Jan", "Feb", "Mar", "Apr", "May", "Jun"," Jul"," Aug", "Sept", "Oct"," Nov"," Dec" ],
        
            
            datasets: [{  
            label: 'Spending',  
            data: [3000, 2700, 3200, 2600, 1500, 3300, 2400, 2900, 3000, 3800, 2100, 3500],  
            backgroundColor: 'rgba(168, 230, 194, 0.2)',  
            borderColor: 'rgba(0, 200, 83, 1)',  
            borderWidth: 2,  
            fill: true  
        }]  
    },   
    options: {  
        scales: {  
            y: {  
                beginAtZero: true  
            }  
        }
    } 
    });
     const cntx = document.getElementById('trendChart').getContext('2d');  

const trendChart = new Chart(cntx, {  
    type: 'line',  
    data: {  
        labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun' ],  
        datasets: [{  
            label: 'Spending Trend',  
            data: [1200, 1500, 1300, 1700, 1600, 2000,],  
            borderColor: '#4CAF50',  
            backgroundColor: 'rgba(76, 175, 80, 0.2)', 
            borderWidth:2,
            fill: true,  
        }]  
    },  
    options: {  
        scales: {  
            y: {  
                beginAtZero: true  
            }  
        }  
         
    }  
});
const cnntx = document.getElementById('spendingcategory').getContext('2d');  

const spendingcategory = new Chart(cnntx, {  
    type: 'line',  
    data: {  
        labels: ['entertainment','groceries','dinning out','transportation' ],  
        datasets: [{  
            label: 'Spending Category',  
            data: [1000, 500, 1300, 1700, 1600, ],  
            borderColor: '#4CAF50',  
            backgroundColor: 'rgba(76, 175, 80, 0.2)', 
            borderWidth:2,
            fill: true,  
        }]  
    },  
    options: {  
        scales: {  
            y: {  
                beginAtZero: true  
            }  
        }  
         
    }  
});
function navigate(screen) {  
    alert(`Navigating to ${screen}`);  
      
}