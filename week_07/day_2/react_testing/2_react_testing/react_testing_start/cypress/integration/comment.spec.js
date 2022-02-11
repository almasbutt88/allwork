describe("Comment", ()=> {

beforeEach(() => {
    cy.visit('http://localhost:3000')

})

it('shoud have a list of two comments', () => {
    const commentListItems = cy.get('#comment-list >li')
    commentListItems.should('have.length', 2)

})
it('shoud be able to add a comment', () => {
    cy.get('#name-input').type("John Jackson"); // we are mimicking a user called John Jackson just to test
    cy.get('#comment-input').type("This is a test"); // end to end experience
    cy.get('#comment-form').submit("");
    const commentListItems = cy.get('#comment-list >li')
    commentListItems.should('have.length', 3)

});
})