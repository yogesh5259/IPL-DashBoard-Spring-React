import "./App.css";
import { TeamPage } from "./pages/TeamPage";
import { BrowserRouter as Router, Route } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <Router>
        <Route path="/team/:teamName">
          <TeamPage />
        </Route>
      </Router>
    </div>
  );
}

export default App;
