/*
 * Demoiselle Framework
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later.
 * See the lgpl.txt file in the root directory or <https://www.gnu.org/licenses/lgpl.html>.
 */
package org.demoiselle.jee.crud;

import org.demoiselle.jee.core.api.crud.Result;
import org.demoiselle.jee.crud.entity.UserModelForTest;

import javax.ws.rs.GET;

/**
 * 
 * @author SERPRO
 *
 */
public class UserRestForTest extends AbstractREST<UserModelForTest, Long> {

    @Override
    @GET
    public Result find() {
        return null;
    }

    @GET
    @DemoiselleResult(searchFields = {"name", "address"}, pageSize = 10)
    public Result findWithSearch() {
        return null;
    }
    
    @GET
    @DemoiselleResult(searchFields ={"name"}, enablePagination = false)
    public Result findWithSearchAnnotationAndPaginationDisabled(){
        return null;
    }
    
    @GET
    @DemoiselleResult(searchFields={"id", "name", "mail"})
    public Result findWithSearchAndFields(){
        return null;
    }
    
    @GET
    @DemoiselleResult(searchFields={"id", "name", "address(street)"})
    public Result findWithSearchAndFieldsWithSubFields(){
        return null;
    }
    
    @GET
    @DemoiselleResult(searchFields={"*"})
    public Result findWithSearchAndAllFields(){
        return null;
    }
    
}