import React from "react";

const Login = () => {
    return (
        <section className="text-gray-600 body-font">
            <div className="flex flex-wrap items-center justify-center h-screen">
                <div className="lg:w-1/4 md:w-1/2 bg-gray-100 rounded-lg p-8 flex flex-col w-full ">
                    <h2 className="text-gray-900 text-lg font-medium title-font mb-5">Login</h2>
                    <div className="relative mb-4">
                        <input
                            type="text"
                            placeholder="ID"
                            id="full-name"
                            name="full-name"
                            className="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                        />
                    </div>
                    <div className="relative mb-4">
                        <input
                            placeholder="Password"
                            type="email"
                            id="email"
                            name="email"
                            className="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                        />
                    </div>
                    <button className="text-white bg-green-500 border-0 py-2 px-8 focus:outline-none hover:bg-green-600 rounded text-lg">
                        Login
                    </button>
                </div>
            </div>
        </section>
    );
};

export default Login;
