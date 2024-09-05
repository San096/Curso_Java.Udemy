import java.util.*;


public class pedido {
    private Integer id;
    private Date moment;
    private ordemStatus status;

    public pedido(){

    }
    public pedido(Integer id, Date moment , ordemStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;

    }


    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Date getMoment(){
        return this.moment;
    }

    public void setMoment(Date moment){
        this.moment = moment;
    }

    public ordemStatus getStatus( ){
        return status;
    }
    
    public void setStatus(ordemStatus status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "pedido [N = " + id + ", moment: " + moment + ", Status:  " + status + "]";
    }
    

    
}
