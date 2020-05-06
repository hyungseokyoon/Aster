import React, {Component} from 'react'
import './style.css'

import { Button, Form, FormGroup, Label, Input } from 'reactstrap'

export class FloristLogin extends Component{
    render(){
        return(
            <Form className="login-form">
                <h1>
                    <a href='/'>ASTER</a>
                </h1>
                <h2 className="text-center">Welcome</h2>
                <FormGroup>
                    <Label>Email</Label>
                    <Input type="email" placeholder="Email"/>
                </FormGroup>
                <FormGroup>
                    <Label>Password</Label>
                    <Input type="password" placeholder="Password"/>
                </FormGroup>
                <FormGroup>
                    <Button className="btn-lg btn-dark btn-block">Log in</Button>
                </FormGroup>
                <FormGroup>
                    <Button className="text-center" href="/floristregister">Register</Button>
                </FormGroup>
            </Form>
        )
    }
}