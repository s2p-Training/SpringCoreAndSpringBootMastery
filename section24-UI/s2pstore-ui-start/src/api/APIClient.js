import axios from "axios";

const APIClient = axios.create(
    {
        baseURL:import.meta.env.VITE_APP_API_BASE_URL,
        timeout:10000
    }
);


export default APIClient;