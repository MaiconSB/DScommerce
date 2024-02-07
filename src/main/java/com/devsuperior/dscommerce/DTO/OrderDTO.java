package com.devsuperior.dscommerce.DTO;

import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.entities.OrderItem;
import com.devsuperior.dscommerce.entities.OrderStatus;
import jakarta.validation.constraints.NotEmpty;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;
    private ClientDTO cliente;
    private PaymentDTO payment;

    @NotEmpty(message = "Deve ter pelo menos um item")
    private List<OrderItemDTO> items = new ArrayList<>();

    public OrderDTO(Long id, Instant moment, OrderStatus status, ClientDTO cliente, PaymentDTO payment) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
        this.payment = payment;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        moment = entity.getMoment();
        status = entity.getStatus();
        cliente = new ClientDTO(entity.getClient());
        payment = entity.getPayment() == null ? null : new PaymentDTO(entity.getPayment());
        for(OrderItem item : entity.getItems()) {
            OrderItemDTO dto = new OrderItemDTO(item);
            items.add(dto);
        }
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ClientDTO getCliente() {
        return cliente;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public Double getTotal(){
        Double sum = 0.0;

        for (OrderItemDTO item : items) {
            sum += item.getSubTotal();
        }

        return sum;
    }
}
