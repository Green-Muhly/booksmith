import React from "react";
import { Link, Route, Switch } from "react-router-dom";
import { Login } from "./pages";

const App = () => {
    return (
        <>
            <Switch>
                <Route exact={true} path="/">
                    <Link to="login">Login</Link>
                </Route>
                <Route path="/test">
                    <div>Test</div>
                </Route>
                <Route path="/login" component={Login} />
            </Switch>
        </>
    );
};

export default App;
