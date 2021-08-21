import React from "react";
import { Route, Switch } from "react-router-dom";

const App = () => {
    return (
        <Switch>
            <Route exact={true} path="/">
                <div>App</div>
            </Route>
        </Switch>
    );
};

export default App;
